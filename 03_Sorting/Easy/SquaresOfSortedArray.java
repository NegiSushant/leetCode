/*

https://leetcode.com/problems/squares-of-a-sorted-array/

Ques_977--->>>
              Given an integer array nums sorted in non-decreasing order,
              return an array of the squares of each number sorted in non-decreasing order.

Example 1:--->>>
                Input: nums = [-4,-1,0,3,10]
                Output: [0,1,9,16,100]
                Explanation: After squaring, the array becomes [16,1,0,9,100].
                After sorting, it becomes [0,1,9,16,100].

Example 2:--->>>
                Input: nums = [-7,-3,2,3,11]
                Output: [4,9,9,49,121]

 */

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
//        int[] nums = {-7,-3,2,3,11};
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers in Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Input Array is: "+Arrays.toString(nums));
        System.out.println("Array After Square & sorting is: "+Arrays.toString(sortedSquares(nums)));

    }
    public static int[] sortedSquares(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
