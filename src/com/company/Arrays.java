package com.company;

class ArrayUtil {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[]myArray = new int[5];//default values
        //printArray(myArray);
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;
        myArray[3]=4;
        myArray[4]=5;
//        myArray[2]=9;
        printArray(myArray);
        System.out.println(myArray.length);

        int []arr = {1,23,1,3,4};
        printArray(arr);
    }
}
public class Arrays {
    public static void main(String[] args) {
        //Adding or Updating elements in an array.
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
    }
}
