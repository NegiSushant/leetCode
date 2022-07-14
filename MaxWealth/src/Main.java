//You are given an m x n integer grid accounts where accounts[i][j]
// is the amount of money ith customer has in the jth bank.
// Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts.
// The richest customer is the customer that has the maximum wealth.

//https://leetcode.com/problems/richest-customer-wealth/

public class Main {
    public static void main(String[] args) {
        //System.out.println(maximumWealth());

    }
    public int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}