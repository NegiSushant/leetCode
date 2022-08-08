/*
13)Ques_832-->>>
                Given an n x n binary matrix image, flip the image horizontally, then invert it, and
                return the resulting image.

Hint >> To flip an image horizontally means that each row of the image is reversed.
        For example, flipping [1,1,0] horizontally results in [0,1,1].
        To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

        For example, inverting [0,1,1] results in [1,0,0].


Example 1:----->>>>>
            Input: image = [[1,1,0],[1,0,1],[0,0,0]]
            Output: [[1,0,0],[0,1,0],[1,1,1]]
            Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
            Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

Example 2:->>>>
            Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
            Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
            Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
            Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */

import java.util.Arrays;
import java.util.Scanner;

public class FlippingImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] image = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                image[i][j] = in.nextInt();
            }
        }
        System.out.println("Original Image: ");
        for (int[] row:image){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Flipped Image: ");
        image = flipAndInvertImage(image);
        for (int[] row:image){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for(int row = 0; row < len; row++){
            int start = 0;
            int end = image[row].length - 1;

            while(start <= end){
                int temp = invert(image[row][start]);
                image[row][start] = invert(image[row][end]);
                image[row][end] = temp;

                start++;
                end--;

            }

        }
        return image;

    }
    public static int invert(int n){
        if (n == 0)
            return 1;
        else
            return 0;
    }
}