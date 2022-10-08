/*

https://leetcode.com/problems/reverse-words-in-a-string-iii/

12)Ques_557---->>>>>>
                Given a string s, reverse the order of characters in each word within a
                sentence while still preserving whitespace and initial word order.


Example 1:---->>>>>
                Input: s = "Let's take LeetCode contest"
                Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:---->>>>>
                Input: s = "God Ding"
                Output: "doG gniD"
 */
public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println("Original sentence is: "+s);
        System.out.println(reverseWords(s));


    }
    public static String reverseWords(String s) {
        if(s.length() == 1){
            return s;
        }

        String[] results = s.split(" ");

        for (int i = 0; i < results.length; i++) {
            results[i] =  new StringBuilder(results[i]).reverse().toString();
        }
        return String.join(" ", results);
    }
}
