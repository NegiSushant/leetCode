/*

https://leetcode.com/problems/find-the-duplicate-number/

Ques_287---->>>
            Given an array of integers nums containing n + 1 integers
            where each integer is in the range [1, n] inclusive.

            There is only one repeated number in nums, return this repeated number.

            You must solve the problem without modifying the array nums and
            uses only constant extra space.

Example 1:--->>>>
                Input: nums = [1,3,4,2,2]
                Output: 2

Example 2:---->>>
            Input: nums = [3,1,3,4,2]
            Output: 3

 */

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[]  nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));

    }
    public static int findDuplicate(int[] nums) {
//         Arrays.sort(nums);

//         int n = nums.length;

//         int duplicate=0;
//         for(int i = 0; i < n-1; i++){
//             if(nums[i] == nums[i+1])
//                 duplicate = nums[i];
//         }
//         return duplicate;

        ///// Using Cyclic Sorting Algo////////
        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i , correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
