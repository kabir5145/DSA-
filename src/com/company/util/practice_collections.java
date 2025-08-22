package com.company.util;

import java.util.*;

public class practice_collections {
    public static void main(String[] args) {
      //question 12: Extract Sublist from ArrayList
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
    }
}
