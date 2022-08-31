/*

https://leetcode.com/problems/sort-array-by-parity-ii/

Ques_922-->>>
                Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

                Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

                Return any answer array that satisfies this condition.



Example 1:--->>>>>
                Input: nums = [4,2,5,7]
                Output: [4,5,2,7]
                Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Example 2:-->>>
                Input: nums = [2,3]
                Output: [2,3]

 */

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParityII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the numbers in Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println("Answer Arrays is: "+Arrays.toString(sortArrayByParityII(nums)));

    }
    public static int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];

        int evenIndex = 0;
        int oddIndex = 1;

        for(int i : nums){
            if(i % 2 == 1){
                result[oddIndex] = i;
                oddIndex += 2;
            }else{
                result[evenIndex] = i;
                evenIndex += 2;
            }
        }
        return result;
    }
}
