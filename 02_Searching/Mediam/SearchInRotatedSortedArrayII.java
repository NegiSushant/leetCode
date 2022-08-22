/*

https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

04)Ques_81--->>>
                There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

                Before being passed to your function, nums is rotated at an unknown pivot index k
                (0 <= k < nums.length) such that the resulting array is
                [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
                For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

                Given the array nums after the rotation and an integer target,
                return true if target is in nums, or false if it is not in nums.

                You must decrease the overall operation steps as much as possible.


 Example 1:--->>>
                Input: nums = [2,5,6,0,0,1,2], target = 0
                Output: true

Example 2:--->>>
                Input: nums = [2,5,6,0,0,1,2], target = 3
                Output: false

 */

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of an Array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the numbers in Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target index: ");
        int target = sc.nextInt();

        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println("Target is in Array: "+search(nums, target));
    }
    public static boolean search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                return true;
            }
            if(nums[end] == nums[mid]){
                end--;
            } else if (nums[mid] < nums[end]) {
                if(nums[mid] < target && nums[end] >= target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}