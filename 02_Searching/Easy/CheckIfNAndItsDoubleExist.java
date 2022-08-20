/*

https://leetcode.com/problems/check-if-n-and-its-double-exist/

15)Ques_1346-->>>
                Given an array arr of integers, check if there exists two integers N and M
                such that N is the double of M ( i.e. N = 2 * M).

                More formally check if there exists two indices i and j such that :
                            >> i != j
                            >> 0 <= i, j < arr.length
                            >> arr[i] == 2 * arr[j]

Example 1:--->>>
                Input: arr = [10,2,5,3]
                Output: true
                Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.

Example 2:--->>>
                Input: arr = [7,1,14,11]
                Output: true
                Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.

Example 3:--->>>>
                Input: arr = [3,1,7,11]
                Output: false
                Explanation: In this case does not exist N and M, such that N = 2 * M.

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the number in the Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input Array is: "+ Arrays.toString(arr));
        System.out.println(checkIfExist(arr));

    }
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    /*
    ***************** BRUTE FORCE ********************
     static boolean checkIfExist(int[] arr) {
         Arrays.sort(arr);
         int start, end;
         for (int i = 0; i < arr.length - 1; i++) {
             int target = arr[i] * 2;
             if (arr[i] < 0) {
                 start = 0;
                 end = i;
             } else {
                 start = i + 1;
                 end = arr.length - 1;
             }
             if (hasDouble(arr, target, start, end)) {
                 return true;
             }
         }
         return false;
     }
     static boolean hasDouble(int[] arr, int target, int start, int end) {
         int s = start, e = end;
         while (s <= e) {
             int mid = s + (e - s) / 2;
             if (arr[mid] == target) {
                 return true;
             } else if (arr[mid] > target) {
                 e = mid - 1;
             } else {
                 s = mid + 1;
             }
         }
         return false;
     }
     */
}