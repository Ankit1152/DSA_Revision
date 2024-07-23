package JavaCollectionFramework;

// import java.util.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Iterator;

public class Cursors {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(1, "Deepak");
        list.add("Vishal");

        // System.out.println(list);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        ListIterator litr = list.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }

        System.out.println();
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }

        System.out.println();

        Vector v = new Vector();
        v.add(10);
        v.add("Deepak");
        v.add(15.2);
        System.out.println(v);

        Enumeration e = v.elements();
        while(e.hasMoreElements()) {
            System.out.print(e.nextElement()+" ");
        }
    }
}
