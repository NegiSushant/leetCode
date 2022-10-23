/*

https://leetcode.com/problems/longest-common-prefix/

17)Ques------->>>>>>
                Write a function to find the longest common prefix string amongst an array of strings.
                If there is no common prefix, return an empty string "".


Example 1:----->>>>>>
                    Input: strs = ["flower","flow","flight"]
                    Output: "fl"

Example 2:------->>>>
                    Input: strs = ["dog","racecar","car"]
                    Output: ""
                    Explanation: There is no common prefix among the input strings.


Constraints:
                1 <= strs.length <= 200
                0 <= strs[i].length <= 200
                strs[i] consists of only lowercase English letters.

 */

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of Array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the String Array: ");
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
//        String[] strs = {"dog","racecar","car"}; /// Test Case
        System.out.println("Input String Array is: "+Arrays.toString(strs));
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}


/*
PLEASE UPVOTE IF IT HELPS YOU! THANK YOU!
Recommend to dry run along with the example.

Working:
1)Take the first(index=0) string in the array as prefix.
2)Iterate from second(index=1) string till the end.
3)Use the indexOf() function to check if the prefix is there in the strs[i] or not.
If the prefix is there the function returns 0 else -1.
4)Use the substring function to chop the last letter from prefix each time the function return -1.

eg:
strs=["flower", "flow", "flight"]
prefix=flower
index=1
    while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flower")!=0)
    Since flower as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flowe"
    Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flowe")!=0)
    Since flowe as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flow"
    Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flow")!=0)
    Since flow as a whole is in flow, it returns 0 so now prefix=flow
index=2
    while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flow")!=0)
    Since flow as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flo"
    Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flo")!=0)
    Since flo as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "fl"
    Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("fl")!=0)
    Since fl as a whole is in flight, it returns 0 so now prefix=fl
index=3, for loop terminates and we return prefix which is equal to fl
*/
