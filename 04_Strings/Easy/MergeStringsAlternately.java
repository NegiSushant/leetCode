/*

https://leetcode.com/problems/merge-strings-alternately/

20)Ques_1768---->>>>>>
                You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
                starting with word1. If a string is longer than the other, append the additional letters onto
                the end of the merged string.

                Return the merged string.


Example 1:---->>>>
            Input: word1 = "abc", word2 = "pqr"
            Output: "apbqcr"
            Explanation: ----->>>>>
                        The merged string will be merged as so:
                        word1:  a   b   c
                        word2:    p   q   r
                        merged: a p b q c r

Example 2:----->>>>
            Input: word1 = "ab", word2 = "pqrs"
            Output: "apbqrs"
            Explanation:----->>>>>>
                        Notice that as word2 is longer, "rs" is appended to the end.
                        word1:  a   b
                        word2:    p   q   r   s
                        merged: a p b q   r   s

Example 3:---->>>>>>
            Input: word1 = "abcd", word2 = "pq"
            Output: "apbqcd"
            Explanation:------>>>>>
                        Notice that as word1 is longer, "cd" is appended to the end.
                        word1:  a   b   c   d
                        word2:    p   q
                        merged: a p b q c   d

 */

import java.util.Scanner;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the word1: ");
        String word1 = sc.next();

        System.out.println("Please enter the word2: ");
        String word2 = sc.next();

//        String word1 = "abcd";
//        String word2 = "pq";
        System.out.println("word1: "+word1+"  word2: "+word2);
        System.out.println("after merging of word1 and word2: )"+mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        // return  word1.isEmpty()||word2.isEmpty() ? word1 : word2;
        StringBuilder ans = new StringBuilder();

        int n = word1.length();
        int m = word2.length();

        int i =0, j = 0;

        while (i < n || j < m){
            if(i < n) ans.append(word1.charAt(i++));
            if(j < m) ans.append(word2.charAt(j++));
        }
        return ans.toString();
    }
}
