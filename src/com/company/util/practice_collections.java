package com.company.util;

import java.util.*;

public class practice_collections {
    public static void main(String[] args) {
      //question 10: Shuffle Arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("Numbers before shuffling : "+numbers);
        Collections.shuffle(numbers);
        System.out.println("Numbers after shuffling : "+numbers);
    }
}
