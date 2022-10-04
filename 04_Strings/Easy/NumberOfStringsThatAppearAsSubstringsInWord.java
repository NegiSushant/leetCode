/*

https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

10)Ques_1967---->>>>>
                    Given an array of strings patterns and a string word,
                    return the number of strings in patterns that exist as a substring in word.

                    A substring is a contiguous sequence of characters within a string.


Example 1:---->>>>>
                    Input: patterns = ["a","abc","bc","d"], word = "abc"
                    Output: 3
                    Explanation:---->>>>
                                    - "a" appears as a substring in "abc".
                                    - "abc" appears as a substring in "abc".
                                    - "bc" appears as a substring in "abc".
                                    - "d" does not appear as a substring in "abc".
                                    3 of the strings in patterns appear as a substring in word.

Example 2:----->>>>>
                    Input: patterns = ["a","b","c"], word = "aaaaabbbbb"
                    Output: 2
                    Explanation:---->>>>
                                    - "a" appears as a substring in "aaaaabbbbb".
                                    - "b" appears as a substring in "aaaaabbbbb".
                                    - "c" does not appear as a substring in "aaaaabbbbb".
                                    2 of the strings in patterns appear as a substring in word.


Example 3:----->>>>>
                    Input: patterns = ["a","a","a"], word = "ab"
                    Output: 3
                    Explanation: Each of the patterns appears as a substring in word "ab".

 */
public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args){
        String[] patterns = {"a","a","a"};
        String word = "ab";
        System.out.println(numOfStrings(patterns, word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i = 0; i < patterns.length; i++) {
            if(word.contains(patterns[i])){
                count += 1;
            }

        }
        return count;
    }
}
