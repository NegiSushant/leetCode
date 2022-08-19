/*

https://leetcode.com/problems/search-insert-position/

09)Ques_35--->>>>
                Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

                You must write an algorithm with O(log n) runtime complexity.

Example 1:--->>>
                Input: nums = [1,3,5,6], target = 5
                Output: 2

Example 2:--->>>
                Input: nums = [1,3,5,6], target = 2
                Output: 1

Example 3:--->>>
                Input: nums = [1,3,5,6], target = 7
                Output: 4

 */

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length of array: ");
        int n = in.nextInt();

        System.out.println("Enter the number(sorted order) in Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Enter the targeted numbers: ");
        int target = in.nextInt();

        System.out.println("Entered Array is: "+ Arrays.toString(nums));
        System.out.println(target+ " is or will be the index at: "+searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return nums[mid] < target ? mid + 1 : mid;
    }
}