import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/kth-missing-positive-number/

08)Ques_1539--->>>>
                Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

                Return the kth positive integer that is missing from this array.

Example 1:---->>>
                Input: arr = [2,3,4,7,11], k = 5
                Output: 9
                Explanation:
                        The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:--->>>
                Input: arr = [1,2,3,4], k = 2
                Output: 6
                Explanation:
                            The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

 */
public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = in.nextInt();

        System.out.println("Please enter the numbers in Array(positive sorted increasing order): ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the number to find position at missing number: ");
        int k = in.nextInt();

        System.out.println("Input Array is: "+ Arrays.toString(arr));
        System.out.println("Number at "+k+"th position is: "+findKthPositive(arr, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] - mid - 1 < k) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return (start + k);
    }
}