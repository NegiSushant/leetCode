/*

https://leetcode.com/problems/camelcase-matching/description/

Ques_1023----->>>>>>
                    Given an array of strings queries and a string pattern, return a boolean array answer
                    where answer[i] is true if queries[i] matches pattern, and false otherwise.

                    A query word queries[i] matches pattern if you can insert lowercase English letters
                    pattern so that it equals the query. You may insert each character at any position, and
                    you may not insert any characters.



Example 1:---->>>>>>>
                    Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FB"
                    Output: [true,false,true,true,false]

                    Explanation:----->>>>>>>
                                        "FooBar" can be generated like this "F" + "oo" + "B" + "ar".
                                        "FootBall" can be generated like this "F" + "oot" + "B" + "all".
                                        "FrameBuffer" can be generated like this "F" + "rame" + "B" + "uffer".

Example 2:----->>>>>>
                    Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBa"
                    Output: [true,false,true,false,false]

                    Explanation:------>>>>>>>>
                                        "FooBar" can be generated like this "Fo" + "o" + "Ba" + "r".
                                        "FootBall" can be generated like this "Fo" + "ot" + "Ba" + "ll".

Example 3:----->>>>>>
                    Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBaT"
                    Output: [false,true,false,false,false]

                    Explanation: ---->>>>>
                                    "FooBarTest" can be generated like this "Fo" + "o" + "Ba" + "r" + "T" + "est".
 */

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public static void main(String[] args){
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FoBaT";
        System.out.println(camelMatch(queries, pattern));

    }
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        ArrayList<Boolean> answer = new ArrayList<>();

        for (String query : queries) {
            int qIndex = 0;
            int qLength = query.length();
            boolean matchPattern = true;
            for (char patChar : pattern.toCharArray()) {
                boolean isUpPat = Character.isUpperCase(patChar);
                if (isUpPat)
                    while (qIndex < qLength && !Character.isUpperCase(query.charAt(qIndex))) qIndex++;
                while (qIndex < qLength && query.charAt(qIndex) != patChar && matchPattern) {
                    if (Character.isUpperCase(query.charAt(qIndex++)) != isUpPat)
                        matchPattern = false;
                }
                if (!matchPattern || qIndex == qLength) {
                    matchPattern = false;
                    break;
                }
                qIndex++;
            }
            while (qIndex < qLength && matchPattern) {
                if (Character.isUpperCase(query.charAt(qIndex++)))
                    matchPattern = false;
            }
            answer.add(matchPattern);
        }

        return answer;
    }
}
