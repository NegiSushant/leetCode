/*

https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

05)Ques_153-->>
            Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
            For example, the array nums = [0,1,2,4,5,6,7] might become:
                                >>[4,5,6,7,0,1,2] if it was rotated 4 times.
                                >>[0,1,2,4,5,6,7] if it was rotated 7 times.

            Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in
            the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

            Given the sorted rotated array nums of unique elements,
            return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Example 1:--->>>
            Input: nums = [3,4,5,1,2]
            Output: 1
            Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:--->>>
            Input: nums = [4,5,6,7,0,1,2]
            Output: 0
            Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:-->>>
            Input: nums = [11,13,15,17]
            Output: 11
            Explanation: The original array was [11,13,15,17] and it was rotated 4 times.

 */

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the numbers in the Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextInt();
        }

        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums){
        int start  = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(nums[end] > nums[mid]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return nums[start];
    }
}