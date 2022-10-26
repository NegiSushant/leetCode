import java.util.Scanner;

/*
24)Ques_58---->>>>>
                Given a string s consisting of words and spaces, return the length of the last word in the string.

                A word is a maximal substring consisting of non-space characters only.



Example 1:----->>>>>
                Input: s = "Hello World"
                Output: 5
                Explanation: The last word is "World" with length 5.

Example 2:----->>>>>
                Input: s = "   fly me   to   the moon  "
                Output: 4
                Explanation: The last word is "moon" with length 4.

Example 3:---->>>>
                Input: s = "luffy is still joyboy"
                Output: 6
                Explanation: The last word is "joyboy" with length 6.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the sentence or word: ");
        String s = sc.next();
//        String s = "   fly me   to   the moon  ";// test case
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                len++;
            }else{
                if(len > 0){
                    return len;
                }
            }
        }
        return len;
    }
}
