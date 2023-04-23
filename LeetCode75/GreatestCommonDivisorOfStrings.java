/*

https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&id=leetcode-75

For two strings s and t, we say "t divides s" if and only if s = t + ... + t
(i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.



Example 1:---->>>>>
            Input: str1 = "ABCABC", str2 = "ABC"
            Output: "ABC"

Example 2:----->>>>>
            Input: str1 = "ABABAB", str2 = "ABAB"
            Output: "AB"

Example 3:------>>>>>>
            Input: str1 = "LEET", str2 = "CODE"
            Output: ""


Constraints:------>>>>>>
            1 <= str1.length, str2.length <= 1000
            str1 and str2 consist of English uppercase letters.
 */

import java.util.Scanner;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two String: ");
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println("largest string that divides both str1 and str2: "+gcdOfStrings(str1, str2));
    }
    public static String gcdOfStrings(String str1, String str2) {
        String smallerString = str1.length() > str2.length() ? str2 : str1;
        String biggerString = str1.length() > str2.length() ? str1 : str2;

        return gcd(biggerString, smallerString);
    }

    public static String gcd(String str1, String str2){
        if(str1.equals(str2)){
            return str1;
        }

        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }

        return "";
    }
}
