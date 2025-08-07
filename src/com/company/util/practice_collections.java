package com.company.util;

import java.util.ArrayList;

public class practice_collections {
    public static void main(String[] args) {
        //question 1: write a java program to create an array list , add some colors (String) and print out the collections
        /*
        ArrayList<String>  colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        System.out.println(colors);

        //question 2: Write a java program to iterate through all elements in an array list.
        ArrayList<String>  color = new ArrayList<>();
        color.add("red");
        color.add("blue");
        color.add("yellow");
        color.add("green");
      for(String element: color){
          System.out.println(element);
      }
         */

        //question 3 : write a java program to insert an element into the array list at the first position
        ArrayList<String> name = new ArrayList<>();
        name.add("kabir");
        name.add("Batman");
        name.add("Messi");
        name.add("Ronaldo");
        name.add(1,"hello");
        System.out.println(name);
        for(String element: name) {
            System.out.println(element);
        }
    }
}
