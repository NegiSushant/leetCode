/*

https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&id=leetcode-75

Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal
to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the
left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.



Example 1:------->>>>>>>
                Input: nums = [1,7,3,6,5,6]
                Output: 3
                Explanation:------>>>>>>
                            The pivot index is 3.
                            Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
                            Right sum = nums[4] + nums[5] = 5 + 6 = 11

Example 2:------->>>>>>>>>
                Input: nums = [1,2,3]
                Output: -1
                Explanation:--------->>>>>>
                            There is no index that satisfies the conditions in the problem statement.

Example 3:-------->>>>>>>>
                Input: nums = [2,1,-1]
                Output: 0
                Explanation:------->>>>>>
                            The pivot index is 0.
                            Left sum = 0 (no elements to the left of index 0)
                            Right sum = nums[1] + nums[2] = 1 + -1 = 0


Constraints:-------->>>>>>>>
                    1 <= nums.length <= 104
                    -1000 <= nums[i] <= 1000


Note: This question is the same as 1991: https://leetcode.com/problems/find-the-middle-index-in-array/
 */
import java.util.Scanner;

public class FindPivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in Array: ");
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Pivot Index is: "+pivotIndex(arr));
    }
    static public int pivotIndex(int[] nums) {

        if(nums.length == 0){
            return -1;
        }
        int leftsum = 0;
        int rightsum = 0;

        for(int i : nums){
            rightsum+=i;
        }
        for(int i = 0; i < nums.length; i++){
            rightsum -=nums[i];
            if(rightsum == leftsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;

/*--------------- Brute force---------------------->>
        int n = nums.length;
        int sum = 0;

        int mid = n/2;
        for(int i = 0; i < n; i++){
            sum+=nums[i];
        }

        for(int i = 0; i < n; i++){
            int lsum = 0, rsum = 0;
            if(i <= mid){
                for(int j = 0; j < i; j++){
                    lsum+=nums[j];
                }

                rsum = sum - lsum - nums[i];
            }else{
                for(int j = i+1; j < n; j++){
                    rsum += nums[j];
                }

                lsum = sum - rsum - nums[i];
            }
            if(lsum == rsum){
                return i;
            }
        }
        return -1;

 */
    }
}
