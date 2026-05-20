package com.company;
import java.util.Arrays;

public class Triplets_with_Smaller_Sum {
    int countTriplets(int sum, int arr[]) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                if (arr[i] + arr[left] + arr[right] >= sum) {
                    right--;
                } else {
                    count += (right - left);
                    left++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        Triplets with Smaller Sum
        Triplets_with_Smaller_Sum obj = new Triplets_with_Smaller_Sum();
        System.out.println(obj.countTriplets(10, new int[]{1, 2, 3, 4}));
    }
}
