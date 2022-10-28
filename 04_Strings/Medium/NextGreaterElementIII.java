import java.util.Arrays;

/*

https://leetcode.com/problems/next-greater-element-iii/

06)Ques_556----->>>>>>
                Given a positive integer n, find the smallest integer which has exactly the same digits existing
                in the integer n and is greater in value than n. If no such positive integer exists, return -1.

                Note that the returned integer should fit in 32-bit integer, if there is a valid answer, but
                it does not fit in 32-bit integer, return -1.



Example 1:---->>>>
                Input: n = 12
                Output: 21

Example 2:---->>>>>
                Input: n = 21
                Output: -1
 */
public class NextGreaterElementIII {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(nextGreaterElement(n));
    }
    public static int nextGreaterElement(int n) {
        String num = Integer.toString(n);
        int[] arr = new int[num.length()];
        for(int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i) - '0';
        }

        int pivot = arr.length - 2;
        while(pivot >= 0 && arr[pivot] >= arr[pivot + 1]) {
            pivot --;
        }
        if(pivot == -1) return -1;

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        Arrays.sort(arr, pivot + 1, arr.length);
        long res = 0;
        for (int j : arr) {
            res *= 10;
            res += j;
        }
        return res > Integer.MAX_VALUE ? -1 : (int) res;
    }
}
