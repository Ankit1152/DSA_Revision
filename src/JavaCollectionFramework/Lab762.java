package JavaCollectionFramework;

import java.util.*;

class Customer implements Comparable<Customer> {
    int cid;
    String cname;
    String email;
    long phone;

    public Customer() {
    }

    public Customer(int cid, String cname, String email, long phone) {
        this.cid = cid;
        this.cname = cname;
        this.email = email;
        this.phone = phone;
    }

    public String toString() {
        return "[" + cid + "," + cname + "," + email + "," + phone + "," + "]";
    }

    public int compareTo(Customer cust) {
        return this.cname.compareTo(cust.cname);
    }
}

public class Lab762 {
    public static void main(String[] args) {
        Customer cust1 = new Customer(102, "Ankit", "ankit@1152.com", 123456);
        Customer cust2 = new Customer(103, "Rohan", "rohan@1152.com", 4589623);
        Customer cust3 = new Customer(101, "Sumit", "sumit@1152.com", 98564725);

        Set<Customer> myset = new TreeSet<>();
        myset.add(cust1);
        myset.add(cust2);
        myset.add(cust3);

        for (Customer cust : myset) {
            System.out.println(cust);
        }
    }
}
