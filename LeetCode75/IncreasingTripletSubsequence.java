/*

https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&id=leetcode-75

Given an integer array nums, return true if there exists a triple of indices (i, j, k)
such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.



Example 1:----->>>>>>
                Input: nums = [1,2,3,4,5]
                Output: true
                Explanation: Any triplet where i < j < k is valid.

Example 2:------->>>>>>
                Input: nums = [5,4,3,2,1]
                Output: false
                Explanation: No triplet exists.


Example 3:-------->>>>>>
                Input: nums = [2,1,5,0,4,6]
                Output: true
                Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.


Constraints:------->>>>>>
                1 <= nums.length <= 5 * 105
                -231 <= nums[i] <= 231 - 1


Follow up: Could you implement a solution that runs in O(n) time complexity and O(1) space complexity?
 */

import java.util.Scanner;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of Arrays: ");
        int n = sc.nextInt();

        System.out.println("Enter the length of Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();;
        }
        System.out.println(increasingTriplet(nums));
    }
    public static boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3){
            return false;
        }
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num <= sMin) {
                sMin = num;

            } else {
                return true;
            }
        }
        return false;
    }
}
