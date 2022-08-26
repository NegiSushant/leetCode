import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/merge-sorted-array/

01)Ques_88--->>
                You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
                and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

                Merge nums1 and nums2 into a single array sorted in non-decreasing order.

                The final sorted array should not be returned by the function,
                but instead be stored inside the array nums1. To accommodate this,
                nums1 has a length of m + n, where the first m elements denote the elements
                that should be merged, and the last n elements are set to 0 and should be ignored.
                nums2 has a length of n.

Example 1:--->>>
            Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
            Output: [1,2,2,3,5,6]
            Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
            The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:--->>>
            Input: nums1 = [1], m = 1, nums2 = [], n = 0
            Output: [1]
            Explanation: The arrays we are merging are [1] and [].
            The result of the merge is [1].

Example 3:--->>>
            Input: nums1 = [0], m = 0, nums2 = [1], n = 1
            Output: [1]
            Explanation: The arrays we are merging are [] and [1].
            The result of the merge is [1].
            Note that because m = 0, there are no elements in nums1.
            The 0 is only there to ensure the merge result can fit in nums1.

 */
public class MergeSortedArray {
    public static void main(String[] args) {

        int m = 3, n = 3;
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArr = new int[m + n];
        int i = 0, j = 0, index = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                tempArr[index++] = nums1[i++];
            } else {
                tempArr[index++] = nums2[j++];
            }
        }

        while (j < n) {
            tempArr[index++] = nums2[j++];
        }

        while (i < m) {
            tempArr[index++] = nums1[i++];
        }

        for (int k = 0; k < tempArr.length; k++) {
            nums1[k] = tempArr[k];
        }
    }
}