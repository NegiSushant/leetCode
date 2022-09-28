/*

https://leetcode.com/problems/sorting-the-sentence/

05)Ques_1859---->>>>>>>

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
Each word consists of lowercase and uppercase English letters.

            A sentence can be shuffled by appending the 1-indexed word position to each word then
            rearranging the words in the sentence.

            Given a shuffled sentence s containing no more than 9 words,
            reconstruct and return the original sentence.



Example 1:---->>>>
            Input: s = "is2 sentence4 This1 a3"
            Output: "This is a sentence"
            Explanation:
                        Sort the words in s to their original positions "This1 is2 a3 sentence4",
                        then remove the numbers.

Example 2:--->>>>>
            Input: s = "Myself2 Me1 I4 and3"
            Output: "Me Myself and I"
            Explanation:
                    Sort the words in s to their original positions "Me1 Myself2 and3 I4",
                    then remove the numbers.
 */


public class SortingTheSentence {
    public static void main(String[] args){
        String s = "Myself2 Me1 I4 and3";
        System.out.println(s.indexOf("I4"));
    }
}
