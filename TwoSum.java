import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*Qus-->Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order
   https://leetcode.com/problems/two-sum/*/

public class TwoSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] nums = new int[len];
        // if
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }
        System.out.print("Enter target number: ");
        int target = in.nextInt();
        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("Indices: "+ Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target){
        //int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};

                }
            }
        }
        return new int[]{-1, -1};
    }
}