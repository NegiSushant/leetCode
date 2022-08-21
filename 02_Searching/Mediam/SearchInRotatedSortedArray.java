/*

03)Ques_33--->>>
                There is an integer array nums sorted in ascending order (with distinct values).

                Prior to being passed to your function, nums is possibly rotated at an unknown
                pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1],
                 ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7]
                  might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

                Given the array nums after the possible rotation and an integer target,
                return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.


Example 1:--->>>
            Input: nums = [4,5,6,7,0,1,2], target = 0
            Output: 4

Example 2:--->>>
            Input: nums = [4,5,6,7,0,1,2], target = 3
            Output: -1

Example 3:--->>>
            Input: nums = [1], target = 0
            Output: -1

 */

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = in.nextInt();

        System.out.println("Please enter the numbers in the Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Please enter the target element: ");
        int target = in.nextInt();

        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println("Target elemnt is: "+target);
        System.out.println("After the possible rotation the index of target is: "+search(nums, target));
    }
    public static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        int start = 0;
        int end = nums.length - 1;

        if (target >= nums[pivot] && target <= nums[nums.length - 1]){
            start = pivot;
        }else {
            end = pivot;
        }
        return BinarySearch(nums, target, start, end);

    }

    private static int BinarySearch(int[] nums, int target, int start, int end) {
        int s = start, e = end;
        while (s <= e){
            int mid = s + (e - s) / 2;
            if (target == nums[mid]){
                return  mid;
            } else if (target > nums[mid]) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return -1;
    }

    private static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[end] > nums[mid]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}