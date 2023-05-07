/*

https://leetcode.com/problems/max-consecutive-ones-iii/description/?envType=study-plan-v2&id=leetcode-75

Given a binary array nums and an integer k, return the maximum number of consecutive 1's in
the array if you can flip at most k 0's.



Example 1:----->>>>>>>
                Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
                Output: 6
                Explanation: ------>>>>>
                                [1,1,1,0,0,1,1,1,1,1,1]
                                Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:----->>>>>>>>>
                Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
                Output: 10
                Explanation: ------->>>>>>
                                [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
                                Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


Constraints:------>>>>>>>
                1 <= nums.length <= 105
                nums[i] is either 0 or 1.
                0 <= k <= nums.length
 */
public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int s = 0, e = 0, zero = 0;
        while (e < n){
            if(nums[e] == 0){
                zero++;
            }
            e++;
            if(zero > k){
                if(nums[s] == 0){
                    zero--;
                }
                s++;
            }
        }
        return e-s;
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < nums.length; i++){
//            int count=0;
//            int p = k;
//            for (int j = i; j < nums.length; j++) {
//                if(nums[j] == 0 && p != 0){
//                    count++;
//                    p--;
//                } else if (nums[j] == 1) {
//                    count++;
//                }else break;
//            }
//            max = Math.max(count, max);
//        }
//        return max;
    }
}
