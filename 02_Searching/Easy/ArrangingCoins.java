/*

https://leetcode.com/problems/arranging-coins/

06)Ques_441-->>>
            You have n coins, and you want to build a staircase with these coins.
            The staircase consists of k rows where the ith row has exactly i coins.
            The last row of the staircase may be incomplete.

            Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:--->>>>
            Input: n = 5
            Output: 2
            Explanation: Because the 3rd row is incomplete, we return 2.

Example 2:--->>>
            Input: n = 8
            Output: 3
            Explanation: Because the 4th row is incomplete, we return 3.
 */


import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n){
        int count = 0;
        int steps =1;
        while(n > 0){
            if ((n - steps)  >= 0) {
                count++;
                n -= steps;
                steps++;
            }
            else{
                break;
            }
        }
        return count;
    }
}