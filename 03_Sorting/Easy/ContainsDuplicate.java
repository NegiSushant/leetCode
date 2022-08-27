/*

https://leetcode.com/problems/contains-duplicate/

03)Ques_217--->>>
                Given an integer array nums, return true if any value appears at least
                twice in the array, and return false if every element is distinct.

Example 1:--->>>
                Input: nums = [1,2,3,1]
                Output: true

Example 2:--->>>
                Input: nums = [1,2,3,4]
                Output: false

Example 3:---->>>>
                Input: nums = [1,1,1,3,3,4,3,2,4,2]
                Output: true

 */

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the length of an Array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the number in the Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Input Array is: "+Arrays.toString(nums));
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length - 1; i++)
            if (nums[i] == nums[i+1])
                return true;
        return false;
    }
}
