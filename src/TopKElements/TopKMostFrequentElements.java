package TopKElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TopKMostFrequentElements {
    public static void main(String[] args) {
        int topK[] = topKMostFrequent(new int[] { 1, 1, 1, 1, 2, 2, 3, 3, 3 }, 2);
        System.out.println(Arrays.toString(topK));
    }

    public static int[] topKMostFrequent(int nums[], int k) {
        int result[] = new int[k];

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : nums) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        Map<Integer, Integer> orderedMap = new LinkedHashMap<>();

        // Sorting takes TC :- O(nlogn)
        frequencyMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEachOrdered(x -> orderedMap.put(x.getKey(), x.getValue()));

        // System.out.println(orderedMap);

        for (int key : orderedMap.keySet()) {
            result[result.length - (k--)] = key;
            if (k == 0) {
                break;
            }
        }

        return result;
    }

}