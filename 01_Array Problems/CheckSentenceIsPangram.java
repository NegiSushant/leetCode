/*

https://leetcode.com/problems/check-if-the-sentence-is-pangram/

10)Ques_1832-->>
                Given a string sentence containing only lowercase English letters,
                return true if sentence is a pangram, or false otherwise.

                ((A pangram is a sentence where every letter of the English alphabet appears at least once.))




Example 1:
        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        Output: true
        Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:
            Input: sentence = "leetcode"
            Output: false

 */

import java.util.Scanner;

public class CheckSentenceIsPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the word or Sentence with no gape blw words: ");
        String sentence = sc.next();

        System.out.println("Pangram is: "+checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence){

        int n = sentence.length();
        if (n < 26){
            return false;
        }
        int[] alpha = new int[26];
        int count = 0;

        for (int i = 0; i < n; i++){
            int temp = sentence.charAt(i) - 97; // for the character index in a sentence.
            if(alpha[temp] != 1){
                count += 1;
                alpha[temp] = 1;
            }
            if(count == 26){
                return true;
            }
        }
        return false;
    }
}