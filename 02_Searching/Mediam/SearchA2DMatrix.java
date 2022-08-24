/*

https://leetcode.com/problems/search-a-2d-matrix/

12)Ques_74--->>
            Write an efficient algorithm that searches for a value target in an m x n integer matrix.
            This matrix has the following properties:
                      > Integers in each row are sorted from left to right.
                      >  The first integer of each row is greater than the last integer of the previous row.

Example 1:--->>>
            Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
            Output: true


Example 2:--->>
            Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
            Output: false

 */

import java.util.Arrays;
import java.util.Scanner;

public class SearchA2DMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row: ");
        int row = sc.nextInt();

        System.out.println("Enter the number of colum: ");
        int col = sc.nextInt();

        System.out.println("Note -> All number in Matrix Are in sorted order in row!");
        
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter the number in "+(i+1)+" row: ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        
        System.out.println("Input Matrix Array is: "+ Arrays.deepToString(matrix));
        System.out.println("Target element "+target+" is in matrix: "+searchMatrix(matrix, target));
        
    }
    public static boolean searchMatrix(int[][] matrix, int target){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == target){
                    return true;
                }
            }
        }
        return false;
    }
}