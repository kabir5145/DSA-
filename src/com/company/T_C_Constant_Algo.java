package com.company;


public class T_C_Constant_Algo {
    public static int sum(int x , int y ){
        int result = x+y;
        return result;
    }
    public static int list_Sum(int []A,int n){
        int sum = 0;
        for(int i = 0 ;i<=n-1;i++){
            sum = sum +A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        //measure runtime in java
        long start =System.nanoTime();

        int res = sum(6, 4);

        long end = System.nanoTime();    // end time
        System.out.println("The sum of two numbers is: " + res);
        System.out.println("Time taken (ns): " + (end - start));

        int []A = {5,6,1,2};
        int n = A.length;
        System.out.println(list_Sum(A,n));
    }
}
