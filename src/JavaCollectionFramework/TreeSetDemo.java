package JavaCollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("C");
        treeSet.add("E");
        System.out.println("Initial TreeSet: " + treeSet);

        // Attempt to add duplicate element
        treeSet.add("A");
        System.out.println("After adding duplicate element 'A': " + treeSet);

        // Check if the TreeSet contains a specific element
        System.out.println("Contains 'C': " + treeSet.contains("C"));
        System.out.println("Contains 'F': " + treeSet.contains("F"));

        // Remove an element
        treeSet.remove("D");
        System.out.println("After removing element 'D': " + treeSet);

        // Get the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Iterate through the TreeSet
        System.out.print("Elements in TreeSet: ");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Retrieve and remove the first and last elements
        String first = treeSet.pollFirst();
        System.out.println("First element removed: " + first);
        String last = treeSet.pollLast();
        System.out.println("Last element removed: " + last);

        // Display the TreeSet after removals
        System.out.println("TreeSet after removing first and last elements: " + treeSet);

        // Get first and last elements without removing
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Subset operations
        TreeSet<String> subset = new TreeSet<>(treeSet.subSet("B", "E"));
        System.out.println("Subset from 'B' to 'E': " + subset);

        // HeadSet and TailSet operations
        TreeSet<String> headSet = new TreeSet<>(treeSet.headSet("C"));
        System.out.println("HeadSet up to 'C': " + headSet);
        TreeSet<String> tailSet = new TreeSet<>(treeSet.tailSet("C"));
        System.out.println("TailSet from 'C': " + tailSet);

        // Clear the TreeSet
        treeSet.clear();
        System.out.println("After clearing the TreeSet: " + treeSet);
    }
}

