import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/build-array-from-permutation/

Ques_1920->>
            Given a zero-based permutation nums (0-indexed), build an array ans of the same length
            where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
            A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 */


public class BuildArrayPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] nums = new int[len];
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("Built Array: "+ Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++){
            res[i] = nums[nums[i]];
        }
        return res;

    }
}