/*

https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

04)Ques_ ---->>>
                Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
                find two numbers such that they add up to a specific target number. Let these two numbers be
                numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

                Return the indices of the two numbers, index1 and index2, added by one as an integer array
                [index1, index2] of length 2.

                The tests are generated such that there is exactly one solution. You may not use the same element twice.

                Your solution must use only constant extra space.



Example 1:-->>>
            Input: numbers = [2,7,11,15], target = 9
            Output: [1,2]
            Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

Example 2:--->>>>
            Input: numbers = [2,3,4], target = 6
            Output: [1,3]
            Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

Example 3:--->>>
            Input: numbers = [-1,0], target = -1
            Output: [1,2]
            Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].

 */

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumArrayIsSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of array: ");
        int n = sc.nextInt();

        System.out.println("Please enter the numbers in Array in Sorted manner: ");

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Please enter the target sum: ");
        int target = sc.nextInt();
        System.out.println("Array is: "+Arrays.toString(numbers));
        System.out.println("Target was: "+target);

        System.out.println("Answer indices with +1 is: "+ Arrays.toString(twoSum(numbers, target)));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1, -1};
        int e = numbers.length - 1;

        for (int i = 0; i < e; i++) {
            int found = search(numbers, target - numbers[i], i + 1, e);
            if (found != -1) {
                ans[0] = i + 1;
                ans[1] = found + 1;
                return ans;
            }
        }

        return ans;
    }
    static int search(int[] numbers, int target, int start, int end) {
        int s = start, e = end;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}