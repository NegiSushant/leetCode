/*

https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

11)Ques_1351--->>>>
                Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
                return the number of negative numbers in grid.

Example 1:--->>>
                Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
                Output: 8
                Explanation: There are 8 negatives number in the matrix.

Example 2:---->>>>
                Input: grid = [[3,2],[1,0]]
                Output: 0

Follow up: Could you find an O(n + m) solution?

 */

import java.util.Arrays;
import java.util.Scanner;

public class CountNegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//>>> Asking for the number of Rows.
        System.out.print("Enter num of rows: ");
        int row = sc.nextInt();

//>>>>Asking for the number of Columns.
        System.out.print("Enter num of cols: ");
        int col = sc.nextInt();

        // Make matrix:
        int[][] grid = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter elements in row "+(i+1)+": ");
            for (int j = 0; j < col; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(grid));
        System.out.println("There are "+countNegatives(grid)+" negative number in the matrix.");
    }
    public static int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] ints : grid) {
            ans += BinarySearch(ints);
        }
        return ans;
    }

    private static int BinarySearch(int[] ints) {
        int start = 0;
        int end = ints.length - 1;
        int count = 0;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(ints[mid] >= 0){
                start =  mid +1;
            }else {
                count = count + end - mid + 1;
                end = mid - 1;
            }
        }
        return count;
    }
}