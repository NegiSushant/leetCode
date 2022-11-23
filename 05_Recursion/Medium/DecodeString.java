/*

https://leetcode.com/problems/decode-string/

Ques_394------>>>>>>>>
                Given an encoded string, return its decoded string.

                The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being
                repeated exactly k times. Note that k is guaranteed to be a positive integer.

                You may assume that the input string is always valid; there are no extra white spaces, square brackets
                are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits
                and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or
                2[4].

                The test cases are generated so that the length of the output will never exceed 105.


Example 1:------->>>>>>>>
                Input: s = "3[a]2[bc]"
                Output: "aaabcbc"

Example 2:------>>>>>>>>
                Input: s = "3[a2[c]]"
                Output: "accaccacc"

Example 3:------->>>>>>
                Input: s = "2[abc]3[cd]ef"
                Output: "abcabccdcdcdef"
 */
public class DecodeString {

    public static void main(String[] args){
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }
    private static int i = 0;
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        int count = 0;

        while (i < s.length()){
            char c = s.charAt(i);
            i++;
            if(c == '['){
                str = decodeString(s);
                for (int j = 0; j < count; j++) {
                    sb.append(str);
                }
                count = 0;
            } else if (c == ']') {
                break;
            } else if (Character.isLetter(c)) {
                sb.append(c);
            }else{
                count = count * 10 + c -'0';
            }
        }
        return sb.toString();
    }
}
