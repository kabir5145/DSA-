package com.company;

public class Reverse_An_Array {
    public void reverse_an_array(int arr[]){
        int n = arr.length;
        int i = 0,k= n-1;
        while (i<k) {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
       Reverse_An_Array r = new Reverse_An_Array();
       r.reverse_an_array(new int[]{2,11,5,10,7,8});
    }
}
