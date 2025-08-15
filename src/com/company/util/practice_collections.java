package com.company.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
        /*ArrayList<String> name = new ArrayList<>();
        name.add("kabir");
        name.add("Batman");
        name.add("Messi");
        name.add("Ronaldo");
        name.add(1,"hello");
        System.out.println(name);
        for(String element: name) {
            System.out.println(element);
        }
         */

        //question 4 : Write a java program to retrieve an element (at a specific index) from a given array list.
        /*ArrayList<Integer> num= new ArrayList<>();
        num.add(1);
        num.add(12);
        num.add(123);
        num.add(1234);
        num.add(12345);
        for(Integer element :num) {
            System.out.println(element);
        }
        System.out.println("First element is : "+num.get(0));
        System.out.println("Second element is : "+num.get(1));
         */

        //question 5: Write a java program to update an array element by given element.
        /*
        ArrayList<String > color = new ArrayList<>();
        color.add("red");
        color.add("blue");
        color.add("yellow");
        color.add("green");
        System.out.println(color);
        color.set(2,"Black");
        System.out.println(color);
         */

        //question 6: Write a java program to remove the third element from an arraylist
        /*
        ArrayList<String> n =  new ArrayList<>();
        n.add("kabir");
        n.add("Rashi");
        n.add("Rehan");
        n.add("Robin");
        n.add("Rishi");
        System.out.println("Original array is : "+n);
        System.out.println(n.remove(3));
        System.out.println("Now the array is : "+n);
         */

        //Question 7 : Write a java program to search for an element in an array list
        /*
        ArrayList<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);
        num.add(16);
        num.add(17);
        num.add(18);
        num.add(19);
        num.add(20);
        System.out.println(num);

        if(num.contains(12)){
            System.out.println("found the number !");
        }else {
            System.out.println("not found the number!");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number : ");
       if(num.contains(sc.nextInt())){
           System.out.println("yes found the number !");
       }else {
           System.out.println("Not found the number!");
       }
         */

        //Question 8 : Write a java program to sort a given array list
        ArrayList<Integer> num = new ArrayList<>();
        num.add(122);
        num.add(13);
        num.add(14);
        num.add(15);
        num.add(16);
        num.add(17);
        num.add(18);
        num.add(19);
        for (int i : num)
            System.out.print(i+" ");
        System.out.println();
        Collections.sort(num);
        System.out.print("List after sort is : "+num);
    }
}
