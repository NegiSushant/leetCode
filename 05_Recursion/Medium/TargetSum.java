/*

https://leetcode.com/problems/target-sum/

Ques_494------->>>>>>>>
                    You are given an integer array nums and an integer target.

                    You want to build an expression out of nums by adding one of the symbols '+' and
                    '-' before each integer in nums and then concatenate all the integers.

                    For example,
                            if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them
                            to build the expression "+2-1".

                    Return the number of different expressions that you can build, which evaluates to target.



Example 1:------>>>>>>>
                    Input: nums = [1,1,1,1,1], target = 3
                    Output: 5
                    Explanation: ------>>>>>>
                                    There are 5 ways to assign symbols to make the sum of nums be target 3.
                                    -1 + 1 + 1 + 1 + 1 = 3
                                    +1 - 1 + 1 + 1 + 1 = 3
                                    +1 + 1 - 1 + 1 + 1 = 3
                                    +1 + 1 + 1 - 1 + 1 = 3
                                    +1 + 1 + 1 + 1 - 1 = 3

Example 2:----->>>>>>
                Input: nums = [1], target = 1
                Output: 1
 */

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the number in Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Please enter the target sum: ");
        int target = sc.nextInt();
//        int[] nums = {1, 1, 1, 1, 1};
//        int target = 3;
        System.out.println("Number of different expressions that build target is: "+findTargetSumWays(nums, target));
    }
    public static int aux(int[] nums, int i, int sum, int target){
        if(i == nums.length){
            if(target == sum){
                return 1;
            }
            return 0;
        }
        //Positive
        int pos=aux(nums, i+1, sum+nums[i], target);
        //Negative
        int neg=aux(nums,i+1, sum-nums[i], target);
        return (pos + neg);
    }
    public static int findTargetSumWays(int[] nums, int target) {
        return aux(nums,0,0,target);
    }
}
