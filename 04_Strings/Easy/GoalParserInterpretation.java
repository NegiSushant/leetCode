/*

https://leetcode.com/problems/goal-parser-interpretation/

Ques_03(1678)--->>>>
                You own a Goal Parser that can interpret a string command.
                The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
                The Goal Parser will interpret "G" as the string "G", "()" as the string "o",
                and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

                Given the string command, return the Goal Parser's interpretation of command.



Example 1:---->>>>
                Input: command = "G()(al)"
                Output: "Goal"
                Explanation: The Goal Parser interprets the command as follows:
                G -> G
                () -> o
                (al) -> al
                The final concatenated result is "Goal".


Example 2:--->>>>
                Input: command = "G()()()()(al)"
                Output: "Gooooal"


Example 3:---->>>>
                Input: command = "(al)G(al)()()G"
                Output: "alGalooG"

 */

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }
    public static String interpret(String command){
        StringBuilder parser = new StringBuilder();

        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                parser.append("G");
            } else if (command.charAt(i) == '(') {
                if(command.charAt(i+1) == ')'){
                    parser.append("o");
                }else {
                    parser.append("al");
                    i = i+3;
                }
            }
        }
        return parser.toString();
    }
}
