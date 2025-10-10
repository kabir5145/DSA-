package com.company;

public class Find_Missing_Num {
    public int find_missing_num(int[] arr) {
        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        for(int num:arr){
            sum = sum-num;
        }
        return sum;
    }
    public void arrayPrint(){
        int arr[]={1,3,6,8,2,4,7};
        System.out.println(find_missing_num(arr));
    }
    public static void main(String[] args) {
        Find_Missing_Num f = new Find_Missing_Num();
        f.arrayPrint();
    }
}
