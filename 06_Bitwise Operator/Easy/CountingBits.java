/*
05)Ques_338------->>>>>>>>>>>>>>>>>>
                            Given an integer n, return an array ans of length n + 1 such that for
                            each i (0 <= i <= n), ans[i] is the number of 1's in the binary
                            representation of i.



Example 1:------>>>>>>>
                        Input: n = 2
                        Output: [0,1,1]
                        Explanation:---->>>>>
                                        0 --> 0
                                        1 --> 1
                                        2 --> 10

Example 2:----->>>>>>>
                        Input: n = 5
                        Output: [0,1,1,2,1,2]
                        Explanation:----->>>>>
                                        0 --> 0
                                        1 --> 1
                                        2 --> 10
                                        3 --> 11
                                        4 --> 100
                                        5 --> 101


Follow up:-->>>>
        It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in
        linear time O(n) and possibly in a single pass?
 */

import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = sc.nextInt();

        System.out.println("ans: "+ Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n){
        int[] ans = new int[n+1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i & (i - 1)] + 1;
        }
        return  ans;
    }
}
