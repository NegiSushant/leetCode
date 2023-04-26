/*

https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&id=leetcode-75

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases,
more than once.



Example 1:---->>>>>
            Input: s = "hello"
            Output: "holle"

Example 2:----->>>>>
            Input: s = "leetcode"
            Output: "leotcede"
 */

import java.util.Scanner;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();

        System.out.println(reverseVowels(s));

    }
    public static boolean IsVowel(char c)
    {
        return (c != 'a' && c != 'A' && c != 'e'
                && c != 'E' && c != 'i' && c != 'I'
                && c != 'o' && c != 'O' && c != 'u'
                && c != 'U');
    }
    public static String reverseVowels(String s) {
            int start = 0,end = s.length()-1;
            String st = "aeiouAEIOU";
            char[] ans = s.toCharArray();

            while(start < end){
                if (IsVowel(ans[start])){
                    start++;
                    continue;
                }
                if (IsVowel(ans[end])) {
                    end--;
                    continue;
                }

                char temp = ans[start];
                ans[start]= ans[end];
                ans[end]= temp;

                start++;
                end--;
            }
            return String.valueOf(ans);
    }
}
