/*

https://leetcode.com/problems/find-smallest-letter-greater-than-target/

07)Ques_744--->>>
                Given a characters array letters that is sorted in non-decreasing order and a character target,
                return the smallest character in the array that is larger than target.

                Note that the letters wrap around.

                For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.


Example 1:--->>>
                Input: letters = ["c","f","j"], target = "a"
                Output: "c"

Example 2:--->>>>
                Input: letters = ["c","f","j"], target = "c"
                Output: "f"

Example 3:---->>>
                Input: letters = ["c","f","j"], target = "d"
                Output: "f"

 */

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the length of character Array: ");
        int n = in.nextInt();

        System.out.println("Please enter the letter in the Array: ");
        char[] letters = new char[n];
        for (int i = 0; i < n; i++) {
            char c = in.next().charAt(0);
            letters[i] = c;
        }

        System.out.println("Please enter the Target Character: ");
        char target = in.next().charAt(0);;

        System.out.println("Input Array is: "+ Arrays.toString(letters));
        System.out.println("Greatest Letter is: "+nextGreatestLetter(letters, target));

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start<=end)
        {
            int mid = start +(end - start)/2;
            if(target < letters[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];

    }
}