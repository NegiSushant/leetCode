/*

https://leetcode.com/problems/lucky-numbers-in-a-matrix/

23)Ques_1380-->>>>>
                Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
                A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.


Example 1:---->>>>
                Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
                Output: [15]
                Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 2:---->>>>>>
                Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
                Output: [12]
                Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 3:---->>>>
                Input: matrix = [[7,8],[1,2]]
                Output: [7]
                Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbersInMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of row: ");
        int row = sc.nextInt();

        System.out.println("Please enter the number of column: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Please enter the number in "+(i+1) +": ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix enter is: "+ Arrays.deepToString(matrix));
        System.out.println("Lucky number is: "+luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        // for max in Column
        int[] maxIndex = new int[matrix[0].length];
        int max;
        for (int i = 0; i < matrix[0].length; i++){
            max = matrix[0][i];
            for(int j = 0; j < matrix.length; j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                }
            }
            maxIndex[i] = max;
        }
        // for Min in row,
        int min, index;
        for(int i = 0; i < matrix.length; i++){
            min = matrix[i][0];
            index = 0;
            for (int j = 0; j < matrix[0].length; j++){
                if (min > matrix[i][j]){
                    index = j;
                    min = matrix[i][j];
                }
            }
            // for final value if max = min;
            if (min == maxIndex[index]){
                result.add(min);
            }
        }
        return result;
    }
}