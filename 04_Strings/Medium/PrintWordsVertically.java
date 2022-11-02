import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*

https://leetcode.com/problems/print-words-vertically/

Ques_1324---->>>>>
                    Given a string s. Return all the words vertically in the same order in which they appear in s.
                    Words are returned as a list of strings, complete with spaces when is necessary.
                    (Trailing spaces are not allowed).
                    Each word would be put on only one column and that in one column there will be only one word.



Example 1:---->>>
                Input: s = "HOW ARE YOU"
                Output: ["HAY","ORO","WEU"]
                Explanation:---->>>>
                                Each word is printed vertically.
                                         "HAY"
                                         "ORO"
                                         "WEU"

Example 2:---->>>>>
                Input: s = "TO BE OR NOT TO BE"
                Output: ["TBONTB","OEROOE","   T"]
                Explanation: ---->>>>>>
                                Trailing spaces is not allowed.
                                            "TBONTB"
                                            "OEROOE"
                                            "   T"
Example 3:---->>>>>
                Input: s = "CONTEST IS COMING"
                Output: ["CIC","OSO","N M","T I","E N","S G","T"]
 */

public class PrintWordsVertically {
    public static void main(String[] args) {
        String s = "TO BE OR NOT TO BE";
        System.out.println(printVertically(s));
    }
    public static List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int maxLength = 0;
        for (String value : words)
            if (value.length() > maxLength)
                maxLength = value.length();
        List<String> vWord = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            StringBuilder str = new StringBuilder();
            StringBuilder spaces = new StringBuilder();
            for (String word : words) {
                if (i >= word.length())
                    spaces.append(" ");
                else {
                    str.append(spaces).append(word.charAt(i));
                    spaces = new StringBuilder();
                }
            }
            vWord.add(str.toString());
        }
        return vWord;
    }
}
