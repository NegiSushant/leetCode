import java.util.Arrays;
import java.util.Scanner;

/*
https://leetcode.com/problems/concatenation-of-array/


2(Ques_1929)->>
            Given an integer array nums of length n, you want to create an array ans of length 2n
            where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
            Specifically, ans is the concatenation of two nums arrays.

            Return the array ans.
 */
public class ConcatenationOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of an Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the number of an Array: ");
        int[] nums = new int[n];

        // loop for entering arrays numbers.
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Input Arrays "+ Arrays.toString(nums));
        System.out.println("Concatenation Arrays: "+Arrays.toString(getConcatenation(nums)));

    }
    static int[] getConcatenation(int[] nums){
        int len = nums.length;
        int[] ans = new int[2*len];
        for (int j = 0; j<len; j++){
            ans[j + len] = ans[j] = nums[j];
        }
        return ans;
    }

}