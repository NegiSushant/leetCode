/*

https://leetcode.com/problems/two-sum/

21)Ques_1--->>
            Given an array of integers nums and an integer target,
            return indices of the two numbers such that they add up to target.

            You may assume that each input would have exactly one solution,
            and you may not use the same element twice.

            You can return the answer in any order.



Example 1:--->>>
            Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


Example 2:---->>>
            Input: nums = [3,2,4], target = 6
            Output: [1,2]


Example 3:--->>>
            Input: nums = [3,3], target = 6
            Output: [0,1]
 */


import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of array: ");
        int len = sc.nextInt();

        int[] nums = new int[len];
        System.out.println("Please enter the numbers: ");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Please enter target: ");
        int target = sc.nextInt();

        System.out.println("Array is: "+ Arrays.toString(nums));
        System.out.println("Indices is: "+Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}