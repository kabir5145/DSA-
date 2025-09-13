package com.company;


public class T_C_Constant_Algo {
    public static int sum(int x , int y ){
        int result = x+y;
        return result;
    }
    public static void main(String[] args) {
        //measure runtime in java
        long start =System.nanoTime();

        int res = sum(6, 4);

        long end = System.nanoTime();    // end time
        System.out.println("The sum of two numbers is: " + res);
        System.out.println("Time taken (ns): " + (end - start));
    }
}
