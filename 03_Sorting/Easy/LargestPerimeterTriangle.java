/*

https://leetcode.com/problems/largest-perimeter-triangle/

Ques_976--->>>>
                Given an integer array nums, return the largest perimeter of a triangle with a non-zero area,
                formed from three of these lengths. If it is impossible to form any triangle of a non-zero area,
                return 0.

Example 1:-->>>>
                Input: nums = [2,1,2]
                Output: 5


Example 2:--->>>
                Input: nums = [1,2,1]
                Output: 0

 */

import java.util.Arrays;
import java.util.Scanner;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] nums = {1, 2, 1};
        int n = 3;
        System.out.println("Please enter the length of triangle: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Perimeter: "+largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums){
        Arrays.sort(nums);

        for (int i = nums.length - 3; i >= 0; i--) {
            if(nums[i] + nums[i+1] > nums[i + 2]){
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        return 0;
    }
}
