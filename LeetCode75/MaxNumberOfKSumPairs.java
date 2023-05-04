/*

https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&id=leetcode-75

You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.



Example 1:------->>>>>>
                Input: nums = [1,2,3,4], k = 5
                Output: 2
                Explanation:------>>>>>>
                                Starting with nums = [1,2,3,4]:
                                - Remove numbers 1 and 4, then nums = [2,3]
                                - Remove numbers 2 and 3, then nums = []
                                There are no more pairs that sum up to 5, hence a total of 2 operations.

Example 2:------>>>>>>>
                Input: nums = [3,1,3,4,3], k = 6
                Output: 1
                Explanation:------->>>>>>
                                    Starting with nums = [3,1,3,4,3]:
                                    - Remove the first two 3's, then nums = [1,4,3]
                                    There are no more pairs that sum up to 6, hence a total of 1 operation.


Constraints:------->>>>>>>
                1 <= nums.length <= 105
                1 <= nums[i] <= 109
                1 <= k <= 109
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            //to check if that k-nums[i] present and had some value left or already paired
            if (map.containsKey(k - num) && map.get(k - num) > 0) {
                count++;
                map.put(k - num, map.get(k - num) - 1);
            } else {
                //getOrDefault is easy way it directly checks if value is 0 returns 0 where I added 1
                //and if some value is present then it return that value "similar to map.get(i)" and I added 1 on it
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
//        int i = 0;
//        int len = nums.length;
//        int j = len-1;
//        int count = 0;
//        Arrays.sort(nums);
//        while(i < j){
//            if(nums[i] + nums[j] == k){
//                count++;
//                i++;
//                j--;
//            }else if(nums[i] + nums[j] < k){
//                i++;
//            }
//            else{
//                j--;
//            }
//        }
//        return count;
    }
}
