package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ListAndSet {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(100);
        list.add(2, 200);
        list.add(300);
        list.add(300);
        list.add(null);
        list.add(null);
        // System.out.println(list);

        // Iterator itr = list.iterator();
        // while (itr.hasNext()) {
        //     System.out.print(itr.next()+" ");
        // }

        ListIterator litr =  list.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next()+" ");
        }

        Set set = new HashSet();
        set.add(400);
        set.add(400);
        set.add(500);
        set.add(600);
        set.add(600);
        set.add(700);
        set.add(null);
        set.add(null);

        // System.out.println(set);

        // Iterator itr = set.iterator();
        // while (itr.hasNext()) {
        //     System.out.print(itr.next()+" ");
        // }
        
    }
}
