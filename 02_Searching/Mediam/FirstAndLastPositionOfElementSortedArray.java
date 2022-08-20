/*

https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

01)Ques_34--->>>
                Given an array of integers nums sorted in non-decreasing order,
                find the starting and ending position of a given target value.

                If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 Example 1:-->>>
                Input: nums = [5,7,7,8,8,10], target = 8
                Output: [3,4]

Example 2:--->>>
                Input: nums = [5,7,7,8,8,10], target = 6
                Output: [-1,-1]

Example 3:-->>>
                Input: nums = [], target = 0
                Output: [-1,-1]

 */

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPositionOfElementSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the numbers in the Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Please enter the target element which position you want: ");
        int target = sc.nextInt();

        System.out.println("Array is: "+ Arrays.toString(nums));
        System.out.println(target+ "'s first and last position respectively is: "+ Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};

        //check for first occurrence if target is first indices
        ans[0] = binarySearch(nums, target, true);
        if (ans[0] != -1){
            ans[1] = binarySearch(nums, target, false);
        }
        return ans;
    }

    private static int binarySearch(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else{
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}