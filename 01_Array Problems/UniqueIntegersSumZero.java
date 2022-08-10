/*

https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

22)Ques_1304--->>>
                Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:--->>>
            Input: n = 5
            Output: [-7,-1,1,3,4]
            Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

Example 2:--->>>
            Input: n = 3
            Output: [-1,0,1]

Example 3:---->>>
            Input: n = 1
            Output: [0]
 */

import java.util.Arrays;
import java.util.Scanner;

public class UniqueIntegersSumZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number(+ive): ");
        int n = in.nextInt();

        System.out.println("Array is: "+ Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n/2; i++){
            result[i] = i+1;
            result[n-i-1] = -1 * (i+1);
            result[n/2] = 0;
        }
        if (n % 2 == 0){
            result[n/2] = -1*n/2;
        }

        return result;
    }
}