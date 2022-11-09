import java.util.Scanner;

/*

https://leetcode.com/problems/power-of-three/

Ques_326------->>>>>>
                            Given an integer n, return true if it is a power of three. Otherwise, return false.

                            An integer n is a power of three, if there exists an integer x such that n == 3x.


Example 1:----->>>>>
                Input: n = 27
                Output: true
                Explanation: 27 = 33

Example 2:----->>>>>
                Input: n = 0
                Output: false
                Explanation: There is no x where 3x = 0.

Example 3:------>>>>
                Input: n = -1
                Output: false
                Explanation: There is no x where 3x = (-1).
 */
public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }
        if(n < 1 ){
            return false;
        }

        return(n % 3 == 0 && isPowerOfThree(n / 3));
    }
}
