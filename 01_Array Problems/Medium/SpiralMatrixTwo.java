import java.util.Scanner;

/*
https://leetcode.com/problems/spiral-matrix-ii/description/

59) Given a positive integer n, generate an n x n matrix filled with elements
    from 1 to n2 in spiral order.

    Example 1:---->>>>>
                    Input: n = 3
                    Output: [[1,2,3],[8,9,4],[7,6,5]]
    Example 2:------>>>>>>
                    Input: n = 1
                    Output: [[1]]

 */
public class SpiralMatrixTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }


    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;

        for(int layer = 0; layer < (n+1)/2; layer++){
            for(int ptr = layer; ptr < n - layer; ptr++){
                ans[layer][ptr] = count++;
            }


            for(int ptr = layer+1; ptr < n - layer; ptr++){
                ans[ptr][n-layer-1] = count++;
            }

            for(int ptr = layer + 1; ptr < n-layer; ptr++){
                ans[n-layer-1][n-ptr-1]=count++;
            }

            for(int ptr = layer+1; ptr < n-layer-1; ptr++){
                ans[n-ptr-1][layer] = count++;
            }
        }
        return ans;
    }
}
