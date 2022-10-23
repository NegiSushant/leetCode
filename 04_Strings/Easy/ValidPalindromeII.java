/*

https://leetcode.com/problems/valid-palindrome-ii/

16)Ques_680----->>>>>>>
                  Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:---->>>>>>
                Input: s = "aba"
                Output: true

Example 2:----->>>>>
                Input: s = "abca"
                Output: true
                Explanation: You could delete the character 'c'.

Example 3:----->>>>>
                Input: s = "abc"
                Output: false
 */

import java.util.Scanner;

public class ValidPalindromeII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the String: ");
        String s = sc.nextLine();

        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalin(s, left + 1, right) || isPalin(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalin(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

