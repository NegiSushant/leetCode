/*

https://leetcode.com/problems/maximum-subarray/

24)Ques_53--->>>>
                Given an integer array nums, find the contiguous subArray (containing at least one number)
                which has the largest sum and return its sum.

                A subArray is a contiguous part of an array.

Example 1:--->>
            Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
            Output: 6
            Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:---->>>>
            Input: nums = [1]
            Output: 1

Example 3:---->>
            Input: nums = [5,4,-1,7,8]
            Output: 23
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.println("Please enter the numbers in array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Enter Array is: "+ Arrays.toString(nums));
        System.out.println("Max sum Array is: "+maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int sum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);{
                if(sum<0) {
                    sum=0;
                }
            }
        }
        return maxSum;
    }
}