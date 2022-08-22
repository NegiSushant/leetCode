/*

https://leetcode.com/problems/find-peak-element/

06)Ques_162--->>>
            A peak element is an element that is strictly greater than its neighbors.

            Given a 0-indexed integer array nums, find a peak element, and return its index.
            If the array contains multiple peaks, return the index to any of the peaks.

            You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always
            considered to be strictly greater than a neighbor that is outside the array.


You must write an algorithm that runs in O(log n) time.



Example 1:--->>>
                Input: nums = [1,2,3,1]
                Output: 2
                Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:---->>>
                Input: nums = [1,2,1,3,5,6,4]
                Output: 5
                Explanation: Your function can return either index number 1 where
                the peak element is 2, or index number 5 where the peak element is 6.


 */

import java.util.Arrays;
import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.println("Please enter the length od Array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the numbers in the Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Input Arrays is: "+ Arrays.toString(nums));
        System.out.println("Peak element at the index of: "+findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums){
        int start= 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}