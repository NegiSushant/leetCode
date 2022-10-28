import java.util.Scanner;

/*

https://leetcode.com/problems/multiply-strings/

09)Ques_43----->>>>>
                Given two non-negative integers num1 and num2 represented as strings,
                return the product of num1 and num2, also represented as a string.

                Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.



Example 1:--->>>>>
                Input: num1 = "2", num2 = "3"
                Output: "6"

Example 2:---->>>>
                Input: num1 = "123", num2 = "456"
                Output: "56088"

 */
public class MultiplyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("please enter the first number: ");
//        String num1 = sc.next();
//
//        System.out.println("please enter the second number: ");
//        String num2 = sc.next();
        String num1 = "123";
        String num2 = "456";

        System.out.println(multiply(num1, num2));
    }
    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] num = new int[m + n];

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int n1 = i + j, n2 = i + j + 1;
                int sum = mul + num[n2];

                num[n1] += sum / 10;
                num[n2] = (sum) % 10;
            }
        }

        StringBuilder ans = new StringBuilder();
        for(int p : num) if(!(ans.length() == 0 && p == 0)) ans.append(p);
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
