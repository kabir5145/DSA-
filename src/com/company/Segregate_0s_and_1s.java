package com.company;

public class Segregate_0s_and_1s {
        void segregate0and1(int[] arr) {
            int count0 = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0)
                    count0++;
            }

            for (int i = 0; i < count0; i++)
                arr[i] = 0;

            for (int i = count0; i < arr.length; i++)
                arr[i] = 1;
        }

    public static void main(String[] args) {
//        Segregate 0s and 1s
        Segregate_0s_and_1s obj = new Segregate_0s_and_1s();
        int[] arr = {0,1,1,1,1,0,0,0,0,0};
        obj.segregate0and1(arr);
    }
}
