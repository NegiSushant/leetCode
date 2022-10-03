/*

https://leetcode.com/problems/to-lower-case/

07)Ques_709---->>>>
                Given a string s, return the string after replacing every
                uppercase letter with the same lowercase letter.



Example 1:---->>>>
                Input: s = "Hello"
                Output: "hello"

Example 2:---->>>>
                Input: s = "here"
                Output: "here"

Example 3:---->>>>>
                Input: s = "LOVELY"
                Output: "lovely"

 */

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "LOVELY";
        System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String s) {
        //return s.toLowerCase();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                ans.append((char)(s.charAt(i)+32));
            }
            else
            {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
