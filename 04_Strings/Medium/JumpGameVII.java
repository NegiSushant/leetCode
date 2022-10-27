import java.util.Scanner;

/*

https://leetcode.com/problems/jump-game-vii/

01)Ques_1871------>>>>>
                    You are given a 0-indexed binary string s and two integers minJump and maxJump.
                    In the beginning, you are standing at index 0, which is equal to '0'.
                    You can move from index i to index j if the following conditions are fulfilled:

                                1> i + minJump <= j <= min(i + maxJump, s.length - 1), and
                                2> s[j] == '0'.

                    Return true if you can reach index s.length - 1 in s, or false otherwise.



Example 1:----->>>>>>
                Input: s = "011010", minJump = 2, maxJump = 3
                Output: true
                Explanation:---->>>>>>
                            In the first step, move from index 0 to index 3.
                            In the second step, move from index 3 to index 5.

Example 2:---->>>>
                Input: s = "01101110", minJump = 2, maxJump = 3
                Output: false


Constraints:---->>>>>
                2 <= s.length <= 105
                s[i] is either '0' or '1'.
                s[0] == '0'
                1 <= minJump <= maxJump < s.length
 */


public class JumpGameVII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number 0 or 1 as String: ");
        String s = sc.next();
        System.out.println("Enter the maxJump: ");
        int maxJump = sc.nextInt();

        System.out.println("Enter the minJump: ");
        int minJump = sc.nextInt();
//        String s = "01101110";
//        int minJump = 2;
//        int maxJump = 3;
        System.out.println(canReach(s, minJump, maxJump));

    }
    public static boolean canReach(String s, int minJump, int maxJump) {
        int len = s.length();
        int check = 0;
        if(s.charAt(0) == '1' || s.charAt(len - 1) == '1') {
            return false;
        }

        boolean[] reach = new boolean[len];
        reach[0] = true;

        for(int i = 1; i < len; i++) {
            if(i >= minJump) check += reach[i - minJump] ? 1 : 0;
            if(i > maxJump) check -= reach[i - maxJump - 1] ? 1 : 0;

            reach[i] = check > 0 && s.charAt(i) == '0';
        }
        return reach[len - 1];
    }
}
