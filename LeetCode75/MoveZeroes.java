import java.util.Arrays;

/*

https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&id=leetcode-75

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of
the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:----->>>>>>>
                Input: nums = [0,1,0,3,12]
                Output: [1,3,12,0,0]

Example 2:----->>>>>>
                Input: nums = [0]
                Output: [0]


Constraints:------>>>>>>>
            1 <= nums.length <= 104
            -231 <= nums[i] <= 231 - 1


Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (nums[j] == 0 ){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(nums));
        //moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
