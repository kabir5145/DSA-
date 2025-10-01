package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Print_an_Array {
    public void printArray(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Print_an_Array arrUtil = new Print_an_Array();
        arrUtil.printArray(new int[]{5,1,2,9,10});
    }
}
