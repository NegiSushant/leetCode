/*

15)Ques_257--->>>
                Given an array of integers nums containing n + 1 integers
                where each integer is in the range [1, n] inclusive.

                There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.


Example 1:--->>>
            Input: nums = [1,3,4,2,2]
            Output: 2

Example 2:--->>
            Input: nums = [3,1,3,4,2]
            Output: 3
 */

import java.util.Arrays;
import java.util.Scanner;

public class TheDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the lenght of an Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the number in the Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Input Array is: "+Arrays.toString(nums));
        System.out.println("Number which have duplicate in Array is: "+findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums){
        Arrays.sort(nums);

        int duplicate = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                duplicate = nums[i];
            }
        }
        return duplicate;
    }
}
