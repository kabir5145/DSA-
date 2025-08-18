package com.company.util;

import java.util.*;

public class practice_collections {
    public static void main(String[] args) {
      //question 11: Reverse Arraylist
        ArrayList<Integer> n = new ArrayList<>();
        n.add(12);
        n.add(36);
        n.add(98);
        n.add(43);
        System.out.println("The original array is : "+n);
        Collections.reverse(n);
        System.out.println("The reversed array is : "+n);
    }
}
