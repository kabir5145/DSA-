package com.company;

public class Remove_Even_Integers {
    public void remove_even_integers(int []arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] % 2 !=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        //Removing Even Integers From An Array.
        Remove_Even_Integers r = new Remove_Even_Integers();
        r.remove_even_integers(new int[]{3,2,4,7,10,6,5});
    }
}
