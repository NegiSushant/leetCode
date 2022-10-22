/*

https://leetcode.com/problems/valid-palindrome/

15)Ques_125---->>>>>
                A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
                and removing all non-alphanumeric characters, it reads the same forward and backward.
                Alphanumeric characters include letters and numbers.

                Given a string s, return true if it is a palindrome, or false otherwise.

 Example 1:----->>>>>
                Input: s = "A man, a plan, a canal: Panama"
                Output: true
                Explanation: "amanaplanacanalpanama" is a palindrome.


Example 2:----->>>>>>
                Input: s = "race a car"
                Output: false
                Explanation: "raceacar" is not a palindrome.

Example 3:----->>>>>
                Input: s = " "
                Output: true
                Explanation: s is an empty string "" after removing non-alphanumeric characters.
                Since an empty string reads the same forward and backward, it is a palindrome.


 */

public class ValidPalindrome {
    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        //String s = "race a car";
        String s = " ";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int end = s.length() - 1;

        char cHead, cTail;

        while (start <= end){
            cHead = s.charAt(start);
            cTail = s.charAt(end);
            if (!Character.isLetterOrDigit(cHead)) {
                start++;
            } else if(!Character.isLetterOrDigit(cTail)) {
                end--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
