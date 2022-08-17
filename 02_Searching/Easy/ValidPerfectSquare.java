/*

https://leetcode.com/problems/valid-perfect-square/

05)Ques_367--->>>>
            Given a positive integer num, write a function which returns True if num is a perfect square else False.

            Follow up: Do not use any built-in library function such as sqrt.

Example 1:--->>>
            Input: num = 16
            Output: true

Example 2:---->>>
            Input: num = 14
            Output: false

 */

import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int num = in.nextInt();

        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num){
        int start = 1;
        int end = num;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid == num){
                return true;
            } else if (mid < num / mid) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;
    }
}