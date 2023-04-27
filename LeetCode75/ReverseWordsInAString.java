/*

https://leetcode.com/problems/reverse-words-in-a-string/description/

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated
by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any
extra spaces.



Example 1:---->>>>>
            Input: s = "the sky is blue"
            Output: "blue is sky the"

Example 2:----->>>>>
            Input: s = "  hello world  "
            Output: "world hello"
            Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:------>>>>>
            Input: s = "a good   example"
            Output: "example good a"
            Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.


Constraints:----->>>>
            1 <= s.length <= 104
            s contains English letters (upper-case and lower-case), digits, and spaces ' '.
            There is at least one word in s.


Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
 */

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings(Line): ");
        String s1 = sc.nextLine();

        System.out.println("Given String is: "+s1);
        //String s = "  hello world  ";
        System.out.println("String after reverse: "+reverseWords(s1));
    }
    public static String reverseWords(String s) {
        String[] space = s.trim().split(" ");
        Stack<String> ans = new Stack<>();

        for (String s1 : space) {
            if(s1!=""){
                ans.push(s1);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (ans.size()>0){
            String ss = ans.pop();
            if(ans.size() == 0){
                sb.append(ss);
            }else{
                sb.append(ss).append(" ");
            }
        }
        return sb.toString();
    }
}
