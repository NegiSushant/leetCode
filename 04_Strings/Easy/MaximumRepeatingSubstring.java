/*

https://leetcode.com/problems/maximum-repeating-substring/

18)Ques_1668---->>>
             For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence.
             The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence.
             If word is not a substring of sequence, word's maximum k-repeating value is 0.

            Given strings sequence and word, return the maximum k-repeating value of word in sequence.



Example 1:--->>>>
                Input: sequence = "ababc", word = "ab"
                Output: 2
                Explanation: "abab" is a substring in "ababc".

Example 2:---->>>
                Input: sequence = "ababc", word = "ba"
                Output: 1
                Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".

Example 3:----->>>>>>>
                Input: sequence = "ababc", word = "ac"
                Output: 0
                Explanation: "ac" is not a substring in "ababc".


Constraints:----->>>
                1 <= sequence.length <= 100
                1 <= word.length <= 100
                sequence and word contains only lowercase English letters.
 */

import java.util.Scanner;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sequence: ");
        String sequence = sc.next();

        System.out.println("Please enter the word: ");
        String word = sc.next();
/** Test Cases
 *
//        String sequence = "ababc";
//        String word = "ab";
 **/
        System.out.println(maxRepeating(sequence, word));
    }
    public static int maxRepeating(String sequence, String word) {
        if(sequence.isEmpty() || word.isEmpty()){
            return 0;
        }
        int count = 0;
        String temp = word;
        while(sequence.contains(temp)){
            count++;
            temp += word;
        }
        return count;
    }
}
