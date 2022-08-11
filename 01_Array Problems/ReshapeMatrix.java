import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/reshape-the-matrix/

25)Ques_566--->>>
                In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a
                new one with a different size r x c keeping its original data.

                You are given an m x n matrix mat and two integers r and c representing the number of rows and
                the number of columns of the wanted reshaped matrix.

                The reshaped matrix should be filled with all the elements of the original matrix in
                the same row-traversing order as they were.

                If the reshape operation with given parameters is possible and legal, output the new reshaped matrix;
                 Otherwise, output the original matrix.



Example 1:---->>>>
            Input: mat = [[1,2],[3,4]], r = 1, c = 4
            Output: [[1,2,3,4]]

Example 2:--->>>>
            Input: mat = [[1,2],[3,4]], r = 2, c = 4
            Output: [[1,2],[3,4]]

 */
public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        for (int[] arr :
                matrixReshape(mat, r, c)) {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c)
    {
        int[][] reshape = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;

        if(r * c != m * n)
            return mat;
        for(int i = 0; i< r*c; i++)
        {
            reshape[i/c][i%c] = mat[i/n][i%n];
        }
        return reshape;
    }
}