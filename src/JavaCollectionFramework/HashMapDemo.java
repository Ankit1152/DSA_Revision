package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        hashMap.put(4, "D");
        System.out.println("Initial HashMap: " + hashMap);

        // Add a duplicate key with a new value
        hashMap.put(2, "E");
        System.out.println("After adding duplicate key 2 with value 'E': " + hashMap);

        // Check if the HashMap contains a specific key or value
        System.out.println("Contains key 3: " + hashMap.containsKey(3));
        System.out.println("Contains value 'B': " + hashMap.containsValue("B"));

        // Get a value from the HashMap
        System.out.println("Value for key 1: " + hashMap.get(1));

        // Remove an element from the HashMap
        hashMap.remove(4);
        System.out.println("After removing key 4: " + hashMap);

        // Get the size of the HashMap
        System.out.println("Size of HashMap: " + hashMap.size());

        // Iterate through the HashMap
        System.out.println("Elements in HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterate through keys
        System.out.println("Keys in HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterate through values
        System.out.println("Values in HashMap:");
        for (String value : hashMap.values()) {
            System.out.println("Value: " + value);
        }

        // Replace a value
        hashMap.replace(1, "F");
        System.out.println("After replacing value for key 1 with 'F': " + hashMap);

        // Clear the HashMap
        hashMap.clear();
        System.out.println("After clearing the HashMap: " + hashMap);
    }
}

