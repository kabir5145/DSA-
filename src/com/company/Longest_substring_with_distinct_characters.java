package com.company;

import java.util.HashSet;
import java.util.Set;

public class Longest_substring_with_distinct_characters {
    public int longestUniqueSubstr(String s) {
        /*
        Time complexity : O(n)
        Space complexity : O(k)
         */
        int n = s.length();
        int low = 0, max = 0;
        Set<Character> seen = new HashSet<>();

        for (int high = 0; high < n; high++) {
            // shrink window from left until no duplicate
            while (seen.contains(s.charAt(high))) {
                seen.remove(s.charAt(low));
                low++;
            }
            seen.add(s.charAt(high));
            max = Math.max(max, high - low + 1);
        }
        return max;
    }
    public static void main(String[] args) {
//        Longest substring with distinct characters
        Longest_substring_with_distinct_characters obj = new Longest_substring_with_distinct_characters();
        System.out.println(obj.longestUniqueSubstr("abcabcbb"));
    }
}
