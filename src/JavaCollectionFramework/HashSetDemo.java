package JavaCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println("Initial HashSet: " + set);

        // Add duplicate element
        set.add("A");
        System.out.println("After adding duplicate element 'A': " + set);

        // Check if the HashSet contains a specific element
        System.out.println("Contains 'B': " + set.contains("B"));
        System.out.println("Contains 'E': " + set.contains("E"));

        // Remove an element
        set.remove("C");
        System.out.println("After removing element 'C': " + set);

        // Get the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Iterate through the HashSet
        System.out.print("Elements in HashSet: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Clear the HashSet
        set.clear();
        System.out.println("After clearing the HashSet: " + set);
    }
}

