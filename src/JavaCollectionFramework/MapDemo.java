package JavaCollectionFramework;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap demonstration
        Map<String, Integer> hashMap = new HashMap<>();
        demoMap(hashMap, "HashMap");

        // TreeMap demonstration
        Map<String, Integer> treeMap = new TreeMap<>();
        demoMap(treeMap, "TreeMap");

        // LinkedHashMap demonstration
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        demoMap(linkedHashMap, "LinkedHashMap");
    }

    private static void demoMap(Map<String, Integer> map, String mapType) {
        System.out.println("Demonstrating " + mapType);

        // Add elements to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        // Print the map
        System.out.println("Initial " + mapType + ": " + map);

        // Access an element
        System.out.println("Value for key 'three': " + map.get("three"));

        // Remove an element
        map.remove("two");
        System.out.println("After removing key 'two': " + map);

        // Check if the map contains a key or value
        System.out.println("Contains key 'one': " + map.containsKey("one"));
        System.out.println("Contains value 4: " + map.containsValue(4));

        // Get the size of the map
        System.out.println("Size of " + mapType + ": " + map.size());

        // Iterate through the map
        System.out.println("Iterating through " + mapType + ":");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear the map
        map.clear();
        System.out.println("After clearing the " + mapType + ": " + map);
        System.out.println();
    }
}

