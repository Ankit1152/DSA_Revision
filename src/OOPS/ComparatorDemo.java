package OOPS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Vipul");
        Student s2 = new Student(1, "Aparna");
        Student s3 = new Student(3, "Kajal");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list, (a, b) -> b.id - a.id);

        System.out.println(list);

    }

    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return this.id + " : " + this.name;
        }
    }
}
