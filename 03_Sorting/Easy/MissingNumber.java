/*

https://leetcode.com/problems/missing-number/

04)Ques_268--->>>>
                    Given an array nums containing n distinct numbers in the range [0, n],
                    return the only number in the range that is missing from the array.

Example 1:-->>>
            Input: nums = [3,0,1]
            Output: 2
            Explanation:
                        n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
                        2 is the missing number in the range since it does not appear in nums.

Example 2:--->>>
            Input: nums = [0,1]
            Output: 2
            Explanation:
                        n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
                        2 is the missing number in the range since it does not appear in nums.

Example 3:-->>>
            Input: nums = [9,6,4,2,3,5,7,0,1]
            Output: 8
            Explanation:
                        n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
                        8 is the missing number in the range since it does not appear in nums.

 */

import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of an Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers in the Array: ");
        int[] nums = new  int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println("Missing number is: "+missingNumber(nums));

    }
    public static int missingNumber(int[] nums){
        int i = 0;

        while (i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        // Searching for the first number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
