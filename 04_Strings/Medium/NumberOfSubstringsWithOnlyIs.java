import java.util.Scanner;

/*

https://leetcode.com/problems/number-of-substrings-with-only-1s/

12)Ques_1513------>>>>>>
                    Given a binary string s, return the number of substrings with all characters 1's.
                    Since the answer may be too large, return it modulo 109 + 7.


Example 1:----->>>>
                Input: s = "0110111"
                Output: 9
                Explanation:---->>>>>>>
                            There are 9 substring in total with only 1's characters.
                                        "1" -> 5 times.
                                        "11" -> 3 times.
                                        "111" -> 1 time.

Example 2:----->>>>>
                Input: s = "101"
                Output: 2
                Explanation: Substring "1" is shown 2 times in s.

Example 3:----->>>>
                Input: s = "111111"
                Output: 21
                Explanation: Each substring contains only 1's characters.
 */
public class NumberOfSubstringsWithOnlyIs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number contain 0 and 1 only: ");
        String s = sc.next();

        //String s = "111111";
        System.out.println(numSub(s));

    }
    public static int numSub(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int result = 0, count = 0, mod = (int)1e9 + 7;
        for (int i = 0; i < s.length(); ++i) {
            count = s.charAt(i) == '1' ? count + 1 : 0;
            result = (result + count) % mod;
        }
        return result;
    }
}
