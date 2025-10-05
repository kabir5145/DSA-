package com.company;

public class Min_Value_In_An_Array {
    public int min_value_in_an_array(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Wrong Input");
        }
        int n = arr.length;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {5,9,15,3,1,2};
        Min_Value_In_An_Array a = new Min_Value_In_An_Array();
        System.out.println(a.min_value_in_an_array(arr));
    }
}
