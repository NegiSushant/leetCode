/*
M8)Ques_189-->>>
                Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:--->>>
            Input: nums = [1,2,3,4,5,6,7], k = 3
            Output: [5,6,7,1,2,3,4]

            Explanation:>>>>
                        rotate 1 steps to the right: [7,1,2,3,4,5,6]
                        rotate 2 steps to the right: [6,7,1,2,3,4,5]
                        rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:--->>>>
            Input: nums = [-1,-100,3,99], k = 2
            Output: [3,99,-1,-100]

            Explanation: >>>>>
                        rotate 1 steps to the right: [99,-1,-100,3]
                        rotate 2 steps to the right: [3,99,-1,-100]

Follow up:>>>>
            Try to come up with as many solutions as you can.
            There are at least three different ways to solve this problem.
            Could you do it in-place with O(1) extra space?

 */

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Arrays: ");
        int n = sc.nextInt();

        System.out.println("Please enter the numbers in Arrays: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the number which you want to rotate Arrays: ");
        int k = sc.nextInt();

        System.out.println("Input Array is: "+Arrays.toString(nums));
        System.out.println("Rotation in Arrays by: "+k);
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rotateSubArray(nums, 0, n-k);
        rotateSubArray(nums, n-k, n);
        rotateSubArray(nums, 0 , n);
        System.out.println("Rotated Array: "+ Arrays.toString(nums));;
    }
    public static void rotateSubArray(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end-1);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}