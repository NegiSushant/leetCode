import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/single-number/description/

02)Ques_136------>>>>>>>>
                Given a non-empty array of integers nums, every element appears twice except for one.
                Find that single one.

                You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:---->>>>>>
                Input: nums = [2,2,1]
                Output: 1


Example 2:------->>>>>>
                Input: nums = [4,1,2,1,2]
                Output: 4


Example 3:----->>>>>
                Input: nums = [1]
                Output: 1


Constraints:----->>>>>>>
                1 <= nums.length <= 3 * 104
                -3 * 104 <= nums[i] <= 3 * 104
                Each element in the array appears twice except for one element which appears only once.


 */
public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of array: ");
        int len = sc.nextInt();

        System.out.println("Please enter the elements in Array: ");
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i]=sc.nextInt();
        }

        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println("Single element in array is: "+singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
