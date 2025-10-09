package com.company;

public class Move_Zeros_At_End {
    public void move_zeros_at_end(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[n] == 0) {
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
            }
            if (arr[n] != 0) {
                n++;
            }
        }
            for (int x : arr) {
                System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        //int []arr = {0,1,0,4,12};
        Move_Zeros_At_End m = new Move_Zeros_At_End();
        m.move_zeros_at_end(new int[]{0,1,0,4,12});

    }
}
