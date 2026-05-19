package com.company;

import java.util.Arrays;

public class Find_Triplets_With_Zero_Sum {
    public boolean findTriplets(int[] arr) {
        //Brute force
        //Time complexity = O(n³)
        //Space complexity = O(1)
//        Arrays.sort(arr);
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            for(int j = i + 1; j < n; j++){
//                for(int k = j + 1; k < n; k++){
//                    if(arr[i] + arr[j] + arr[k] == 0){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;

        //Two pointer
        //Time complexity = O(n²)
        //Space complexity = O(1)
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;   // sum too small, move left pointer right
                } else {
                    right--;  // sum too large, move right pointer left
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        Find triplets with zeros sum
        Find_Triplets_With_Zero_Sum obj = new Find_Triplets_With_Zero_Sum();
        System.out.println(obj.findTriplets(new int[]{-3,-1,0,2,1}));
    }
}
