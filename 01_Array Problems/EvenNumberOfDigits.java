/*

https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

16)Ques_1295--->>>
                Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:-->>
            Input: nums = [12,345,2,6,7896]
            Output: 2
            Explanation:
                        12 contains 2 digits (even number of digits).
                        345 contains 3 digits (odd number of digits).
                        2 contains 1 digit (odd number of digits).
                        6 contains 1 digit (odd number of digits).
                        7896 contains 4 digits (even number of digits).
                        Therefore, only 12 and 7896 contain an even number of digits.

Example 2:
            Input: nums = [555,901,482,1771]
            Output: 1
            Explanation:
            Only 1771 contains an even number of digits.
 */

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] nums = new int[len];
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("Numbers having even digits count: "+ findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }
    static boolean even(int num)
    {
        int numberofDigit = digits(num);

        return numberofDigit % 2 ==0;
    }
    static int digits(int num)
    {
        if(num < 0)
        {
            num = num *-1;
        }
        if (num == 0)
        {
            return 1;
        }

        int count = 0;
        while (num > 0)
        {
            count++;
            num = num / 10;
        }

        return count;
    }
}