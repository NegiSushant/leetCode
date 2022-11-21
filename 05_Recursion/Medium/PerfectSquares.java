import java.util.Arrays;

/*

https://leetcode.com/problems/perfect-squares/

Ques_279----->>>>>>
                Given an integer n, return the least number of perfect square numbers that sum to n.

                A perfect square is an integer that is the square of an integer; in other words,
                it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares
                while 3 and 11 are not.

Example 1:----->>>>>>>
                Input: n = 12
                Output: 3
                Explanation: 12 = 4 + 4 + 4.

Example 2:------>>>>>>
                Input: n = 13
                Output: 2
                Explanation: 13 = 4 + 9.

 */
public class PerfectSquares {
    public static void main(String[] args) {

        int n = 156;
        System.out.println(numSquares(n));

    }

    public static int numSquares(int n) {
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        return dp(n);
    }
    static  int[] memo;
    static int dp(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(memo[n]!=-1) return memo[n];

        int min = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++){
            int power = i*i;
            if(n-power>=0){
                min = Math.min(min, dp(n-power)+1);
            }
        }
        memo[n] = min;
        return min;

//        if(n <= 3){
//            return n;
//        }
//        int min = Integer.MAX_VALUE;
//        for(int i = 1; i * i <= n; i++){
//            min = Math.min(min, numSquares(n - i * i) + 1);
//        }
//        return min;

    }
}
