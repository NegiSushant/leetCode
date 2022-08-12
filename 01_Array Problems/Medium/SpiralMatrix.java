/*

https://leetcode.com/problems/spiral-matrix/

M1)Ques_54---->>>
                Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:---->>>>
                Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
                Output: [1,2,3,6,9,8,7,4,5]

Example 2:--->>>
            Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
            Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
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
        System.out.println("Max wealth: "+ spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int minR = 0, minC = 0;
        int maxR = matrix.length-1, maxC = matrix[0].length-1;
        int count = (maxR+1)*(maxC+1);

        while (count > 0){
            for (int i = minR, j = minC; j <= maxC && count > 0; j++){
                result.add(matrix[i][j]);
                count --;
            }
            minR++;

            for (int i = minR, j = maxC; i <= maxR && count > 0; i++){
                result.add(matrix[i][j]);
                count --;
            }
            maxC--;

            for (int i = maxR, j = maxC; j >= minC && count > 0; j--){
                result.add(matrix[i][j]);
                count --;
            }
            maxR--;

            for (int i = maxR, j = minC; i >= minR && count > 0; i--){
                result.add(matrix[i][j]);
                count --;
            }
            minC++;
        }
        return result;
    }
}