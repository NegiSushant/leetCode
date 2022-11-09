/*

https://leetcode.com/problems/power-of-two/description/

Ques_231----->>>>>>>>
                            Given an integer n, return true if it is a power of two. Otherwise, return false.

                            An integer n is a power of two, if there exists an integer x such that n == 2x.


Example 1:----->>>>>>>
                Input: n = 1
                Output: true
                Explanation: 2^0 = 1

Example 2:----->>>>>>>
                Input: n = 16
                Output: true
                Explanation: 2^4 = 16

Example 3:------>>>>>>>
                Input: n = 3
                Output: false
 */

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = sc.nextInt();

        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if(n < 1 || n % 2 == 1){
            return false;
        }

        return (isPowerOfTwo(n / 2));
    }
}
