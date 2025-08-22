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

        //question 13: Compare Two ArrayList
        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println("The first original list is : "+c);
        List<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        System.out.println("The second original list is :"+b);
        List<Integer> combine = new ArrayList<>();
        combine.addAll(c);
        combine.addAll(b);
        System.out.println("The combined list is : "+combine);
    }
}
