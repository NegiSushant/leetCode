/*

https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

20)1886-->>>
            Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to
            target by rotating mat in 90-degree increments, or false otherwise.

Example 1:--->>>>
                Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
                Output: true
                Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.


Example 2:--->>>
                Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
                Output: false
                Explanation: It is impossible to make mat equal to target by rotating mat.


Example 3:--->>>
                Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
                Output: true
                Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.


 */

import java.util.Scanner;

public class MatrixObtainedByRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of row: ");
        int row = in.nextInt();

        System.out.println("Please enter the number of column: ");
        int col = in.nextInt();

        int[][] matrix = new int[row][col];
        for (int i=0; i < row; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < col; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int[][] target = new int[row][col];
        for (int i=0; i < row; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < col; j++) {
                target[i][j] = in.nextInt();
            }
        }
        System.out.println("Is obtainable?: "+ findRotation(matrix, target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int j = 0; j < 4; j++){
            mat = rotate(mat);
            if (isEqual(mat, target)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEqual(int[][] mat, int[][] target){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static int[][] rotate(int[][] matrix){
        matrix = transpose(matrix);
        int temp, n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
        return matrix;
    }

}