/*

https://leetcode.com/problems/reach-a-number/

08)Ques_754--->>>
                You are standing at position 0 on an infinite number line.
                There is a destination at position target.

                You can make some number of moves numMoves so that:
                            >> On each move, you can either go left or right.
                            >> During the ith move (starting from i == 1 to i == numMoves),
                               you take i steps in the chosen direction.

                Given the integer target, return the minimum number of moves required
                (i.e., the minimum numMoves) to reach the destination.


Example 1:--->>>
                Input: target = 2
                Output: 3
                Explanation:
                        On the 1st move, we step from 0 to 1 (1 step).
                        On the 2nd move, we step from 1 to -1 (2 steps).
                        On the 3rd move, we step from -1 to 2 (3 steps).

Example 2:-->>>
                Input: target = 3
                Output: 2
                Explanation:
                        On the 1st move, we step from 0 to 1 (1 step).
                        On the 2nd move, we step from 1 to 3 (2 steps).

 */

import java.util.Scanner;

public class ReachANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the target number: ");
        int target = sc.nextInt();

        System.out.println("Minimum number of moves required to reach the target is:"+reachNumber(target));
    }
    public static int reachNumber(int target) {
        int sum = 0;
        int jump = 1;

        // returns the absolute value of a given argument
        target = Math.abs(target);

        while(sum < target){
            sum += jump;
            jump++;
        }

        if((sum - target) %2 == 0){
            return jump-1;
        }else if((sum+jump-target)%2 == 0){
            return jump;
        }else{
            return jump+1;
        }
    }
}