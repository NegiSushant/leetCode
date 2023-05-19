/*


https://leetcode.com/problems/decode-string/description/?envType=study-plan-v2&id=leetcode-75

Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being
repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets
are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and
that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.



Example 1:------>>>>>>>
                Input: s = "3[a]2[bc]"
                Output: "aaabcbc"

Example 2:------->>>>>>>>
                Input: s = "3[a2[c]]"
                Output: "accaccacc"

Example 3:------>>>>>>>>
                Input: s = "2[abc]3[cd]ef"
                Output: "abcabccdcdcdef"


Constraints:-------->>>>>>>>>>>
                1 <= s.length <= 30
                s consists of lowercase English letters, digits, and square brackets '[]'.
                s is guaranteed to be a valid input.
                All the integers in s are in the range [1, 300].
 */

import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("String after decoding is: "+decodeString(str));
    }
    public static String decodeString(String s){
        Stack<Integer> numstk = new Stack<>();
        Stack<StringBuilder> strstk = new Stack<>();
        StringBuilder str = new StringBuilder();
        int num = 0;

        for(char c : s.toCharArray()){
            if(c>='0' && c<='9'){
                num = num * 10 + c - '0';
            }else if(c=='['){
                strstk.push(str);
                str = new StringBuilder();
                numstk.push(num);
                num = 0;
            }else if (c == ']') {
                StringBuilder temp = str;
                str = strstk.pop();
                int count = numstk.pop();
                while (count-->0){
                    str.append(temp);
                }
            }else{
                str.append(c);

            }

        }
        return str.toString();
    }
}
