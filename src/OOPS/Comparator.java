package OOPS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(15);
        list.add(5);

        Collections.sort(list); // natural ordering
        Collections.sort(list, (a, b) -> b - a); // descending order using Comparator interface has only one abstract
                                                 // method

        // System.out.println(list);

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(50);
        set.add(25);
        set.add(60);
        set.add(15);
        // System.out.println(set);

        Set<Integer> set1 = new TreeSet<>((a, b) -> b - a);
        set1.add(10);
        set1.add(50);
        set1.add(25);
        set1.add(60);
        set1.add(15);

        // System.out.println(set1);

    }
}
