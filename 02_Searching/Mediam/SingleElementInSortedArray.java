/*

https://leetcode.com/problems/single-element-in-a-sorted-array/

02)Ques_540--->>>
                You are given a sorted array consisting of only integers where every element appears exactly twice,
                except for one element which appears exactly once.

                Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.


Example 1:--->>>
            Input: nums = [1,1,2,3,3,4,4,8,8]
            Output: 2

Example 2:--->>>
            Input: nums = [3,3,7,7,10,11,11]
            Output: 10

 */

import java.util.Arrays;
import java.util.Scanner;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers in Array: ");
        int[] nums = new  int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println("single element that appears only once is: "+singleNonDuplicate(nums));

    }
    public static int singleNonDuplicate(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        if(nums.length == 1){
            return nums[0];
        }

        while (start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == nums[mid + 1]){
                mid = mid - 1;
            }
            if ((mid - start + 1) % 2 != 0){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return nums[start];
    }
}