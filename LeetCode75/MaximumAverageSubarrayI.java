/*


https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&id=leetcode-75

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and
return this value. Any answer with a calculation error less than 10-5 will be accepted.



Example 1:------->>>>>>>>>
                Input: nums = [1,12,-5,-6,50,3], k = 4
                Output: 12.75000
                Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:--------->>>>>>>>
                Input: nums = [5], k = 1
                Output: 5.00000


Constraints:------>>>>>>>
                n == nums.length
                1 <= k <= n <= 105
                -104 <= nums[i] <= 104
 */
public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {4433,-7832,-5068,4009,2830,6544,-6119,-7126,-780,-4254,-8249,-9168,
                9492,402,5789,6808,8953,5810,-7353,7933,4766,5182,-3230,-1989,5786,6922,
                -4646,4415,-9906,807,-6373,3370,2604,8751,-9173,-2668,-6876,9500,3465,
                -1900,4134,-1758,-1453,-5201,-9825,4469,-1999,-1108,1836,3923,6796,-5252,
                9863,-5997,-3251,9596,-3404,-540,2826,-1737,3341,-3623,-9885,2603,-5782,8174,2710,6504,-4128};
        int k = 59;

        System.out.println(findMaxAverage(nums, k));

    }
    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double currAvg;
        double currsum = 0;

        for(int i = 0; i < nums.length; i++) {
            currsum += nums[i];
            if(i >= k - 1) {
                currAvg = currsum / k;
                maxAvg = Math.max(maxAvg, currAvg);
                currsum -= nums[i - (k - 1)];
            }
        }
        return maxAvg;
    }
}
