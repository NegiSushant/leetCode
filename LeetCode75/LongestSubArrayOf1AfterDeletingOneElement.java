/*
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array.
Return 0 if there is no such subarray.



Example 1:-------->>>>>>>>>
                Input: nums = [1,1,0,1]
                Output: 3
                Explanation:--------->>>>>>>>
                                After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

Example 2:------->>>>>>
                Input: nums = [0,1,1,1,0,1,1,0,1]
                Output: 5
                Explanation:----->>>>>>>
                                After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray
                                with value of 1's is [1,1,1,1,1].

Example 3:------>>>>>>
                Input: nums = [1,1,1]
                Output: 2
                Explanation:------->>>>>
                                You must delete one element.


Constraints:------->>>>>>>
                1 <= nums.length <= 105
                nums[i] is either 0 or 1.
 */

import java.util.Scanner;

public class LongestSubArrayOf1AfterDeletingOneElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the element in Array in Binary form only: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("After deleting the 1 number longest subarray with value of 1's is: "+longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
        int head = 0, ans = 0, count = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                count++;
            }
            while (count > 1){
                if (nums[head] == 0){
                    count --;
                }
                head++;
            }
            ans = Math.max(ans, i - head);
        }
        return ans;
    }
}
