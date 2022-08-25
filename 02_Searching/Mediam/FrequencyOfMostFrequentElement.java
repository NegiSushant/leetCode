/*

https://leetcode.com/problems/frequency-of-the-most-frequent-element/

14)Ques_1838--->>>
            The frequency of an element is the number of times it occurs in an array.

            You are given an integer array nums and an integer k. In one operation,
             you can choose an index of nums and increment the element at that index by 1.

            Return the maximum possible frequency of an element after performing at most k operations.

 Example 1:--->>>
            Input: nums = [1,2,4], k = 5
            Output: 3
            Explanation:
                        Increment the first element three times and the second element two times to make nums = [4,4,4].
                        4 has a frequency of 3.

Example 2:--->>>
            Input: nums = [1,4,8,13], k = 5
            Output: 2
            Explanation: There are multiple optimal solutions:
                    - Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
                    - Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
                    - Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.

Example 3:--->>>
            Input: nums = [3,9,6], k = 2
            Output: 1

 */

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfMostFrequentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers in Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter how many operations you want to performing:");
        int k = sc.nextInt();

        System.out.println("Input Array is: "+Arrays.toString(nums));
        System.out.println("Ans: "+maxFrequency(nums, k));
    }
    public static int maxFrequency(int[] nums, int k) {
        int result = 1, i = 0, j;
        long sum = 0;
        Arrays.sort(nums);
        for (j = 0; j < nums.length; ++j) {
            sum += nums[j];
            while (sum + k < (long)nums[j] * (j - i + 1)) {
                sum -= nums[i];
                i += 1;
            }
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}
