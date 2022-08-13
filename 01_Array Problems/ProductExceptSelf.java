import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/product-of-array-except-self/

M5)Ques_238-->>
            Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the
            elements of nums except nums[i].

            The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

Example 1:-->>>>
            Input: nums = [1,2,3,4]
            Output: [24,12,8,6]

Example 2:---->>>
            Input: nums = [-1,1,0,-3,3]
            Output: [0,0,9,0,0]
 */
public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the number in the Array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter Array is: "+ Arrays.toString(nums));
        System.out.println("Product of Array Except Self is: "+Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int left = 1, right = 1;
        for (int i = 0; i < n; i++){
            ans[i] = 1;
        }
        for (int i = 0; i < n; i++){
            ans[i] *= left;
            left *= nums[i];
            ans[n-i-1] *= right;
            right *= nums[n-i-1];
        }
        return ans;
    }
}