package com.company;

public class Resize_An_Array {
    public void resize_an_array(int arr[],int capacity){
        int[]temp = new int[capacity];
        for(int i = 0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        for(int x :arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Resize_An_Array r = new Resize_An_Array();
        r.resize_an_array(new int[]{5,9,3,10},6);
    }
}
