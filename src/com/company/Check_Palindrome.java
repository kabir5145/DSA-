package com.company;

public class Check_Palindrome {
    public boolean check_palindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Check_Palindrome c = new Check_Palindrome();
        System.out.println(c.check_palindrome("madam"));
    }
}
