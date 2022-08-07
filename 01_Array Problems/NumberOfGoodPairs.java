/*

https://leetcode.com/problems/number-of-good-pairs/

7)Ques_1512-->>
                Given an array of integers nums, return the number of good pairs.
                A pair (i, j) is called good if nums[i] == nums[j] and i < j.


Example 1:
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length of number: ");
        int n = in.nextInt();

        System.out.println("Please enter the Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("Number of Good Pairs: "+numIdenticalPairs(nums));

    }
    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int target = 0;

        for (int j = 0; j < n-1; j++) {
            for (int k = j+1; k < n; k++){
                if (nums[j] == nums[k]){
                    target +=1;
                }
            }
        }
        return target;
    }
}