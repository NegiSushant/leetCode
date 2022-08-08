/*

https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

14)Ques_1252-->>>
            There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each
            indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.


            For each location indices[i], do both of the following:
                    1) Increment all the cells on row ri.
                    2) Increment all the cells on column ci.

           Given m, n, and indices, return the number of odd-valued cells in the matrix after applying
           the increment to all locations in indices.



Example 1:--->>>>
            Input: m = 2, n = 3, indices = [[0,1],[1,1]]
            Output: 6
            Explanation: Initial matrix = [[0,0,0],[0,0,0]].
            After applying first increment it becomes [[1,2,1],[0,1,0]].
            The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

Example 2:--->>>>
                Input: m = 2, n = 2, indices = [[1,1],[0,0]]
                Output: 0
                Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.


Follow up: Could you solve this in O(n + m + indices.length) time with only O(n + m) extra space?

 */

import java.util.Scanner;

public class CellsOddValuesMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//>>> Asking for the number of Rows.
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();

//>>>>Asking for the number of Columns.
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();

        int[][] accounts = new int[rows][cols];
        System.out.print("Enter num of indices: ");
        int indices_rows = in.nextInt();
        int[][] indices = new int[indices_rows][2];

//>>>> loops for Entering element in Matrix.
        for (int i=0; i < indices_rows; i++)
        {
            System.out.print("Enter elements in "+(i+1)+" row: ");
            for (int j=0; j < 2; j++)
            {
                indices[i][j] = in.nextInt();
            }
        }
        System.out.println("Total number of odd cells: "+ oddCells(rows, cols, indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        int index;
        for (int i = 0; i < indices.length; i++){
            index = indices[i][0];
            for (int j = 0; j < n; j++){
                res[index][j]++;
            }
            index = indices[i][1];
            for (int k= 0; k < m; k++){
                res[k][index]++;
            }
        }
        int count = 0;
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                if(res[i][j] % 2 == 1)
                    count++;
            }
        }
        return count;

    }
}