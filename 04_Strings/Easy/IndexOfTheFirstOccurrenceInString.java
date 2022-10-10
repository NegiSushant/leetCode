/*

https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

14)Ques_28------>>>>>>
                    Given two strings needle and haystack,
                    return the index of the first occurrence of needle in haystack,
                    or -1 if needle is not part of haystack.

 Example 1:---->>>>>
                Input: haystack = "sadbutsad", needle = "sad"
                Output: 0
                Explanation: ---->>>>>
                                "sad" occurs at index 0 and 6.
                                The first occurrence is at index 0, so we return 0.


Example 2:----->>>>>>
                Input: haystack = "leetcode", needle = "leeto"
                Output: -1
                Explanation: ------>>>>
                                "leeto" did not occur in "leetcode", so we return -1.
 */
public class IndexOfTheFirstOccurrenceInString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(strStr(haystack, needle));

    }
    public static int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
