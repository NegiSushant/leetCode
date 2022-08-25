import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/find-a-peak-element-ii/

13)Ques_1901--->>>
                A peak element in a 2D grid is an element that is strictly greater than all of its
                 adjacent neighbors to the left, right, top, and bottom.

                Given a 0-indexed m x n matrix mat where no two adjacent cells are equal,
                find any peak element mat[i][j] and return the length 2 array [i,j].

                You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.

You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.


Example 1:-->>>
                Input: mat = [[1,4],[3,2]]
                Output: [0,1]
                Explanation: Both 3 and 4 are peak elements so [1,0] and [0,1] are both acceptable answers.

Example 2:--->>>
                Input: mat = [[10,20,15],[21,30,14],[7,16,32]]
                Output: [1,1]
                Explanation: Both 30 and 32 are peak elements so [1,1] and [2,2] are both acceptable answers.

 */
public class FindPeakElementII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of row: ");
        int row = sc.nextInt();

        System.out.println("Please enter the length of col: ");
        int col = sc.nextInt();

        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Please enter the number in "+(i+1)+" row: ");
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Array is: "+ Arrays.deepToString(mat));
        System.out.println("Ans: "+Arrays.toString(findPeakGrid(mat)));
    }
    public static int[] findPeakGrid(int[][] mat) {
        int startCol = 0;
        int endCol = mat[0].length-1;

        while(startCol <= endCol){
            int maxRow = 0;
            int midCol = startCol + (endCol - startCol) / 2;

            for(int row = 0; row < mat.length; row++){
                maxRow = mat[row][midCol] >= mat[maxRow][midCol]? row : maxRow;
            }
            boolean rightIsBig = midCol + 1 <= endCol && mat[maxRow][midCol + 1] > mat[maxRow][midCol];
            boolean leftIsBig = midCol - 1 >= startCol && mat[maxRow][midCol - 1] > mat[maxRow][midCol];

            if(!leftIsBig && !rightIsBig){
                return new int[]{maxRow, midCol};
            }
            else if(rightIsBig){
                startCol = midCol+1;
            }else{
                endCol = midCol - 1;
            }
        }
        return null;
    }

}
