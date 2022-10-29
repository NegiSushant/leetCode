import java.util.Stack;

/*

https://leetcode.com/problems/basic-calculator-ii/

10)Ques_227----->>>>>>>>
                        Given a string s which represents an expression, evaluate this expression and return its value.

                        The integer division should truncate toward zero.

                        You may assume that the given expression is always valid.
                        All intermediate results will be in the range of [-231, 231 - 1].

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().


Example 1:---->>>>>
                Input: s = "3+2*2"
                Output: 7

Example 2:----->>>>>>
                Input: s = " 3/2 "
                Output: 1

Example 3:----->>>>>
                Input: s = " 3+5 / 2 "
                Output: 5


Constraints:----->>>>>>>>
                    1 <= s.length <= 3 * 105
                    s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
                    s represents a valid expression.
                    All the integers in the expression are non-negative integers in the range [0, 231 - 1].
                    The answer is guaranteed to fit in a 32-bit integer.
 */
public class BasicCalculatorII {
    public static void main(String[] args) {
        String s = " 3/2 ";
        System.out.println(calculate(s));
    }
    public static int calculate(String s) {
        if(s.isEmpty())
            return 0;
        s = s.trim();

        Stack<Integer> stack = new Stack<>();
        int len = s.length();
        int num = 0;
        char sign = '+';
        int result = 0;
        for(int i = 0; i< len; i++) {
            char crrnum = s.charAt(i);
            if(Character.isDigit(s.charAt(i))){
                num = num * 10 + crrnum - '0';
            }
            if(!Character.isDigit(crrnum) && crrnum != ' ' || i == len-1) {
                if(sign == '+') stack.push(num);
                if(sign == '-') stack.push(-num);
                if(sign == '*') stack.push(stack.pop() * num);
                if(sign == '/') stack.push(stack.pop() / num);
                sign = s.charAt(i);
                num = 0;
            }
        }
        for(int i : stack) {
            result += i;
        }
        return result;
    }
}
