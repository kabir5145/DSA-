package com.company.util;

import java.util.*;

public class practice_collections {
    public static void main(String[] args) {
      //question 12: Extract Sublist from ArrayList
        /*
        List<Integer> n = new ArrayList<>();
        n.add(12);
        n.add(13);
        n.add(14);
        n.add(15);
        n.add(16);
        n.add(17);
        System.out.println("Original List is : "+n);
        List<Integer> v = n.subList(0,3);
        System.out.println("List of three elements is : "+v);
         */

        //question 14: Swap ArrayList element
        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        System.out.println("The Arraylist before swaping it : "+c);

        Collections.swap(c,0,3);
        System.out.println("The Arraylist after swaping the number  is : "+c);
    }
}
