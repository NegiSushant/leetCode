import java.util.Scanner;

/*

https://leetcode.com/problems/power-of-four/description/

Ques_342------>>>>>>
                        Given an integer n, return true if it is a power of four. Otherwise, return false.

                        An integer n is a power of four, if there exists an integer x such that n == 4x.


Example 1:------>>>>>>
                Input: n = 16
                Output: true

Example 2:---->>>>>
                Input: n = 5
                Output: false

Example 3:---->>>>>>
                Input: n = 1
                Output: true
 */

public class PowerOfFour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = sc.nextInt();

        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n){
        if(n == 1) return  true;
        if (n < 1) return false;

        return (n % 4 == 0 && isPowerOfFour(n / 4));
    }
}
