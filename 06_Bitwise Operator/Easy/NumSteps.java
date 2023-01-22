/*

https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

Ques_1342------>>>>>>>
                Given an integer num, return the number of steps to reduce it to zero.

                In one step, if the current number is even, you have to divide it by 2, otherwise,
                you have to subtract 1 from it.



Example 1:------>>>>>>>>
                Input: num = 14
                Output: 6
                Explanation:----->>>>>>
                                Step 1) 14 is even; divide by 2 and obtain 7.
                                Step 2) 7 is odd; subtract 1 and obtain 6.
                                Step 3) 6 is even; divide by 2 and obtain 3.
                                Step 4) 3 is odd; subtract 1 and obtain 2.
                                Step 5) 2 is even; divide by 2 and obtain 1.
                                Step 6) 1 is odd; subtract 1 and obtain 0.

Example 2:------>>>>>>>>>
                Input: num = 8
                Output: 4
                Explanation:----->>>>>>
                                Step 1) 8 is even; divide by 2 and obtain 4.
                                Step 2) 4 is even; divide by 2 and obtain 2.
                                Step 3) 2 is even; divide by 2 and obtain 1.
                                Step 4) 1 is odd; subtract 1 and obtain 0.

Example 3:------>>>>>>
                Input: num = 123
                Output: 12


Constraints:---->>>>>>>
            0 <= num <= 106
 */

import java.util.Scanner;

public class NumSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int num = sc.nextInt();

        System.out.println("Number of steps to reduced 0 is: "+numberOfSteps(num));

    }
    public static int numberOfSteps(int num){
        return helper(num, 0);
    }

    public static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);

        // //Using Recursion
        // if(num == 0) {
        //     return 0;
        // }else if(num % 2 == 0) {
        //     return (numberOfSteps(num / 2) + 1);
        // }else if(num % 2 == 1) {
        //     return (numberOfSteps(num - 1) + 1);
        // }
        // return 0;
        // Bruitforce Code
        // int count = 0;
        // while (num > 0){
        //     if(num % 2 == 0){
        //         num = num / 2;
        //     }else {
        //         num = num - 1;
        //     }
        //     count ++;
        // }
        // return  count;
    }
}
