/*

https://leetcode.com/problems/binary-search/

17)Ques_704--->>>
                Given an array of integers nums which is sorted in ascending order, and an integer target,
                write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

                You must write an algorithm with O(log n) runtime complexity.

Example 1:--->>>
                Input: nums = [-1,0,3,5,9,12], target = 9
                Output: 4
                Explanation: 9 exists in nums and its index is 4

Example 2:--->>
                Input: nums = [-1,0,3,5,9,12], target = 2
                Output: -1
                Explanation: 2 does not exist in nums so return -1

 */


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length: ");
        int n = sc.nextInt();

        System.out.println("Enter the number in Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Please enter the target: ");
        int target = sc.nextInt();

        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println(target+" is exists or not exists in nums and its index is "+search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while(start <= end){
            mid = start +(end - start) / 2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return -1;
    }
}