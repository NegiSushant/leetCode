/*

https://leetcode.com/problems/sort-array-by-parity/

Ques_905--->>>>
                Given an integer array nums, move all the even integers at the beginning of the
                array followed by all the odd integers.

                Return any array that satisfies this condition.

 Example 1:--->>>>
                Input: nums = [3,1,2,4]
                Output: [2,4,3,1]
                Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:--->>>
                Input: nums = [0]
                Output: [0]

 */

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of an Array: ");
        int n = sc.nextInt();

        System.out.println("enter the numbers in the Arrays: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println("Array after sort in Even & Odd order: "+Arrays.toString(sortArrayByParity(nums)));
    }
    public static int[] sortArrayByParity(int[] nums){
        for (int i = 0, j = 0; j < nums.length; j++) {
            if(nums[j] % 2 == 0){
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
