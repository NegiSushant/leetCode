/*

https://leetcode.com/problems/sort-colors/

M9)Ques_75-->>
            Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of
            the same color are adjacent, with the colors in the order red, white, and blue.

            We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

            You must solve this problem without using the library's sort function.

Example 1:---->>>
            Input: nums = [2,0,2,1,1,0]
            Output: [0,0,1,1,2,2]

Example 2:-->>>>
            Input: nums = [2,0,1]
            Output: [0,1,2]
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please total number of colors: ");
        int n = in.nextInt();

        System.out.println("Please enter color(0 = red, 1 = white & 2 = blue): ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println("Enter colours is: "+Arrays.toString(nums));
        System.out.println("After same color are adjacent is: "+Arrays.toString(sortColors(nums)));
    }

    public static int[] sortColors(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++)
                if (nums[j] < nums[min_index])
                    min_index = j;

            int temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}