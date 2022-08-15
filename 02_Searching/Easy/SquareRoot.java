/*

https://leetcode.com/problems/sqrtx/

01)Ques_69----->>>>
                Given a non-negative integer x, compute and return the square root of x.

                Since the return type is an integer, the decimal digits are truncated, and only the integer
                part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.


Example 1:--->>>
            Input: x = 4
            Output: 2

Example 2:--->>>
            Input: x = 8
            Output: 2
            Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 */

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int x = sc.nextInt();

        System.out.println("Square root of "+x+ " is: "+mySqrt(x));
    }
    public static int mySqrt(int x){
        if (x == 1) {
            return x;
        }

        int start = 1;
        int end = x-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (mid < (x / mid)){
                start = mid + 1;
            } else if (mid == (x / mid)) {
                return mid;
            }else {
                end = mid - 1;
            }
        }
        return start - 1;
    }
}