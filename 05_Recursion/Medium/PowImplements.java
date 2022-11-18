/*

https://leetcode.com/problems/powx-n/description/

Ques------->>>>>>>>
                    Implement pow(x, n), which calculates x raised to the power n (i.e., xn).


Example 1:------->>>>>>>>>
                Input: x = 2.00000, n = 10
                Output: 1024.00000

Example 2:------->>>>>>>
                Input: x = 2.10000, n = 3
                Output: 9.26100

Example 3:------->>>>>>>>
                Input: x = 2.00000, n = -2
                Output: 0.25000
                Explanation: 2-2 = 1/22 = 1/4 = 0.25

Constraints:-------->>>>>>>
                -100.0 < x < 100.0
                -231 <= n <= 231-1
                n is an integer.
                -104 <= xn <= 104
 */
public class PowImplements {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x, n));

    }
    public static double myPow(double x, int n) {
        double ans = 1;
        if (n == 0) return 1.0;

        double half = myPow(x, n/2);
        if (n % 2 == 0) {
            return half * half;
        } else if (n < 0) {
            return (1.0 / x) * half * half;
        } else {
            return x * half * half;
        }
    }
}
