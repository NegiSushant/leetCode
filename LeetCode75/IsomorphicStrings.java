/*

https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan&id=level-1

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order
of characters. No two characters may map to the same character, but a character may map to itself.


Example 1:---->>>>>>
            Input: s = "egg", t = "add"
            Output: true

Example 2:------>>>>
            Input: s = "foo", t = "bar"
            Output: false

Example 3:------->>>>>
            Input: s = "paper", t = "title"
            Output: true


*/
import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two string: ");
        String s = sc.next();
        String t = sc.next();

        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                if(hm1.containsKey(s.charAt(i)) ){
                    if(hm1.get(s.charAt(i))!=t.charAt(i))return false;
                }
                if(hm2.containsKey(t.charAt(i))){
                    if(hm2.get(t.charAt(i))!=s.charAt(i)) return false;
                }
                hm1.put(s.charAt(i), t.charAt(i));
                hm2.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
//    static boolean duplicate(String s, String t){
//        int flag = 0;
//        Stack<Character> st1 = new Stack<>();
//        Stack<Character> st2 = new Stack<>();
//
//        for(int i = 0; i < s.length(); i++){
//            for (int j = i+1; j<s.length(); j++){
//                if(s.charAt(i) == s.charAt(j)){
//                    st1.push(s.charAt(i));
//                    st1.push(s.charAt(j));
//                }
//            }
//        }
//
//        for(int i = 0; i < t.length(); i++){
//            for (int j = i+1; j<t.length(); j++){
//                if(t.charAt(i) == t.charAt(j)){
//                    st2.push(t.charAt(i));
//                    st2.push(t.charAt(j));
//                }
//            }
//        }
//
//        while (!st1.isEmpty()) {
//            if (st1.peek() == st2.peek()) {
//                st1.pop();
//                st2.pop();
//            } else {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
