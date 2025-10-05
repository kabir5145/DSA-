package com.company;

public class Second_Max_Value_In_An_Array {
    public int second_max_value(int[] arr) {

        if (arr == null || arr.length < 2) {
            System.out.println("Wrong Input");
            return -1;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[]={12,34,2,34,33,1};
        Second_Max_Value_In_An_Array a = new Second_Max_Value_In_An_Array();
        System.out.println(a.second_max_value(arr));
    }
}
