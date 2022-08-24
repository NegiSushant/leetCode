/*

https://leetcode.com/problems/find-right-interval/

06)Ques_436--->>>
                You are given an array of intervals, where intervals[i] = [starti, endi] and
                each starti is unique.

                The right interval for an interval i is an interval j such that
                startj >= endi and startj is minimized. Note that i may equal j.

                Return an array of right interval indices for each interval i.
                If no right interval exists for interval i, then put -1 at index i.


Example 1:--->>>
                Input: intervals = [[1,2]]
                Output: [-1]
                Explanation: There is only one interval in the collection, so it outputs -1.

Example 2:--->>>
                Input: intervals = [[3,4],[2,3],[1,2]]
                Output: [-1,0,1]
                Explanation: There is no right interval for [3,4].
                The right interval for [2,3] is [3,4] since start0 = 3 is the smallest start that is >= end1 = 3.
                The right interval for [1,2] is [2,3] since start1 = 2 is the smallest start that is >= end2 = 2.


Example 3:-->>>
                Input: intervals = [[1,4],[2,3],[3,4]]
                Output: [-1,2,-1]
                Explanation: There is no right interval for [1,4] and [3,4].
                The right interval for [2,3] is [3,4] since start2 = 3 is the smallest start that is >= end1 = 3.


 */

import java.util.Arrays;
import java.util.Scanner;

public class FindRightInterval {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of row: ");
        int row = in.nextInt();

        System.out.println("Please enter the number of colum: ");
        int col = in.nextInt();

        int[][] intervals = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter element in Row "+(i+1)+" : ");
            for (int j = 0; j < col; j++) {
                intervals[i][j] = in.nextInt();
            }
        }

        System.out.println("Input Array is: "+ Arrays.deepToString(intervals));
        System.out.println("Array of right interval indices:"+Arrays.toString(findRightInterval(intervals)));
    }
    public static int[] findRightInterval(int[][] intervals){
        int N = intervals.length;
        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {
            int right = -1;
            for (int j = 0; j < N; j++) {
                if (intervals[i][1] > intervals[j][0]) {
                    continue;
                }
                if (intervals[i][1] <= intervals[j][0]) {
                    if (right == -1) {
                        right = j;
                    }
                    if (intervals[right][0] > intervals[j][0]) {
                        right = j;
                    }
                }
            }
            ans[i] = right;
        }

        return ans;
    }
}