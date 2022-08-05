import java.util.Scanner;
/*

https://leetcode.com/problems/richest-customer-wealth/

4)Ques_1672-->>
                You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
                ith customer has in the jth bank. Return the wealth that the richest customer has.

                A customer's wealth is the amount of money they have in all their bank accounts.
                The richest customer is the customer that has the maximum wealth.
 */
public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] accounts = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                accounts[i][j] = in.nextInt();
            }
        }
        System.out.println("Max wealth: "+ maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0, sum;
        int rows = accounts.length;
        for (int i = 0; i < rows; i++){
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if (max < sum){
                max = sum;
            }
        }
        return max;
    }
}