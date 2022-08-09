import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/transpose-matrix/

17)Ques_867-->>
                Given a 2D integer array matrix, return the transpose of matrix.

(The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.)


Example 1:-->>>
        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [[1,4,7],[2,5,8],[3,6,9]]


Example 2:---->>>>
            Input: matrix = [[1,2,3],[4,5,6]]
            Output: [[1,4],[2,5],[3,6]]

 */
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of row: ");
        int row = in.nextInt();

        System.out.println("Please enter the number of colum: ");
        int col = in.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter elements in row "+(i+1)+": ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Matrix enter by you is: "+ Arrays.deepToString(matrix));
        System.out.println("Transpose Matrix is: "+ Arrays.deepToString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] Tmatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                Tmatrix[i][j] = matrix[j][i];
            }
        }
        return Tmatrix;
    }
}