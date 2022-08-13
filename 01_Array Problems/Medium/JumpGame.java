import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/jump-game/

M7)Ques_55--->>>
            You are given an integer array nums. You are initially positioned at the array's first index,
             and each element in the array represents your maximum jump length at that position.

            Return true if you can reach the last index, or false otherwise.

Example 1:-->>
            Input: nums = [2,3,1,1,4]
            Output: true
            Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.


Example 2:--->>
            Input: nums = [3,2,1,0,4]
            Output: false
            Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */
public class JumpGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.println("Enter numbers in array: ");
        int[] nums = new int[len];
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }

        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("Can reach the end?: "+ canJump(nums));

    }
    public static boolean canJump(int[] nums) {
        int maxMoves = nums[0];
        for (int i=0; i<= maxMoves; i++) {
            if (maxMoves >= nums.length-1) {
                return true;
            }
            if (maxMoves < i+nums[i]){
                maxMoves = i+nums[i];
            }
        }
        return false;
    }
}