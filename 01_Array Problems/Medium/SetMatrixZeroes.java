/*

https://leetcode.com/problems/set-matrix-zeroes/

M4)Ques_73--->>>>
            Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

            You must do it in place.

Example 1:---->>>
            Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
            Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:--->>>
            Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
            Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            System.arraycopy(matrix[i], 0, res[i], 0, matrix[0].length);
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (res[i][j] == 0){
                    setRowZero(matrix, i);
                    setColumnZero(matrix, j);
                }
            }
        }
        for (int[] row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void setRowZero(int[][] matrix, int row){
        for (int i = row, j = 0; j < matrix[0].length; j++){
            matrix[i][j] = 0;
        }
    }
    public static void setColumnZero(int[][] matrix, int column){
        for (int i = 0, j = column; i < matrix.length; i++){
            matrix[i][j] = 0;
        }
    }
}