import java.util.Scanner;

/*

https://leetcode.com/problems/matrix-diagonal-sum/

15)Ques_1572--->>>
                    Given a square matrix mat, return the sum of the matrix diagonals.

                    Only include the sum of all the elements on the primary diagonal and all the elements on the
                    secondary diagonal that are not part of the primary diagonal.



Example 1:--->>>
                Input: mat = [[1,2,3],
                              [4,5,6],
                              [7,8,9]]
                Output: 25
                Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
                Notice that element mat[1][1] = 5 is counted only once.

Example 2:-->>>
            Input: mat = [[1,1,1,1],
                          [1,1,1,1],
                          [1,1,1,1],
                          [1,1,1,1]]
            Output: 8

Example 3:-->>>
            Input: mat = [[5]]
            Output: 5
 */
public class MatrixDiagonalSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Ask for the number of row.
        System.out.println("Please enter the number of row: ");
        int row = sc.nextInt();

        // Ask for the number of column.
        System.out.println("Please enter the number of Column: ");
        int col = sc.nextInt();

        // Make matrix:
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter elements in row "+(i+1)+": ");
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of the diagonal of matrix is: "+diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        //Sum of 1st diagonal.
        for(int row = 0; row < n; row++){
            sum +=  mat[row][row];
        }

        //Sum of 2nd diagonal.
        for (int col = 0; col < n; col++) {
            sum += mat[col][n - col -1];
        }
        // in case of odd matrix.
        if(n%2==1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}