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
    public static void main(String[] args) {
        Find_Missing_Num f = new Find_Missing_Num();
        f.find_missing_num(new int[]{2,4,1,8,6,3,7});
    }
}
