/*
https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1

(1480) Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.


Example 1:----->>>>>>>
            Input: nums = [1,2,3,4]
            Output: [1,3,6,10]
            Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:------>>>>>
            Input: nums = [1,1,1,1,1]
            Output: [1,2,3,4,5]
            Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:------>>>>>>>
            Input: nums = [3,1,2,10,1]
            Output: [3,4,6,16,17]
 */

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in Arrays: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            nums[i] = sum;

        }
        return nums;
    }
}
