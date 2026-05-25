package com.company;

public class Max_Sum_Subarray_of_size_K {
    public int maxSubarraySum(int[] arr, int k) {
        /*
        Time complexity : O(n)
        Space complexity : O(1)
         */
        int n = arr.length;
        int low = 0;
        int high = k - 1;
        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum += arr[i];
        }

        int res = sum;

        while (high < n - 1) {
            sum = sum - arr[low];
            low++;
            high++;
            sum += arr[high];
            res = Math.max(res, sum);
        }

        return res;
    }
    public static void main(String[] args) {
//        Max Sum Subarray of size K
        Max_Sum_Subarray_of_size_K obj = new Max_Sum_Subarray_of_size_K();
        System.out.println(obj.maxSubarraySum(new int[]{1,2,3,4}, 2));
    }
}
