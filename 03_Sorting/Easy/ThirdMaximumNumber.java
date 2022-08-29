/*

https://leetcode.com/problems/third-maximum-number/

07)Ques_414---->>>>>>
                    Given an integer array nums, return the third distinct maximum number in this array.
                    If the third maximum does not exist, return the maximum number.


Example 1:---->>>>
                Input: nums = [3,2,1]
                Output: 1
                Explanation:
                            The first distinct maximum is 3.
                            The second distinct maximum is 2.
                            The third distinct maximum is 1.

Example 2:---->>>>
                Input: nums = [1,2]
                Output: 2
                Explanation:
                            The first distinct maximum is 2.
                            The second distinct maximum is 1.
                            The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:--->>>>>
                Input: nums = [2,2,3,1]
                Output: 1
                Explanation:
                            The first distinct maximum is 3.
                            The second distinct maximum is 2 (both 2's are counted together since they have the same value).
                            The third distinct maximum is 1.


 */

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        int ans = findmax(nums);
        System.out.println(ans);
    }
    static int findmax(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        if(n < 3){
            return nums[n-1];
        }
        int k = 1;
        while(k < 3 && n>1){
            n--;
            if(nums[n] != nums[n-1]){
                k++;
            }
        }
        if(k<3){
            return nums[nums.length-1];
        }
        return nums[n-1];
    }
}
