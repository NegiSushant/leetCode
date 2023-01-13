import java.util.Scanner;

/*

https://leetcode.com/problems/add-binary/description/

01)Ques_67------->>>>>>>>>
                    Given two binary strings a and b, return their sum as a binary string.

Example 1:----->>>>>>
                Input: a = "11", b = "1"
                Output: "100"


Example 2:------->>>>>>
                Input: a = "1010", b = "1011"
                Output: "10101"

Constraints:-------->>>>>>
                    1 <= a.length, b.length <= 104
                    a and b consist only of '0' or '1' characters.
                    Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st the number binary number: ");
        String a = sc.nextLine();

        System.out.println("Enter 2nd the number binary number: ");
        String b = sc.nextLine();

        System.out.println("Sum: "+ addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        if (a == null || a.equals("")){
            return b;
        }
        if (b == null || b.equals("")){
            return a;
        }

        int carry = 0;
        String result = "";
        int len1 = a.length()-1;
        int len2 = b.length()-1;

        while (len1 >= 0 || len2 >= 0 || carry == 1) {
            if (len1 >= 0) {
                carry += Integer.parseInt(a.charAt(len1)+"");
                len1--;
            }

            if (len2 >= 0) {
                carry += Integer.parseInt(b.charAt(len2)+"");
                len2--;
            }

            result = String.valueOf(carry%2) + result;
            carry /= 2;
        }
        return result;
    }
}
