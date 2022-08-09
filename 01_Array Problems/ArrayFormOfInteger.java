import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
18)Ques_989--->>>
            The array-form of an integer num is an array representing its digits in left to right order.
                       > For example, for num = 1321, the array form is [1,3,2,1].

            Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.


Example 1:--->>>
            Input: num = [1,2,0,0], k = 34
            Output: [1,2,3,4]
            Explanation: 1200 + 34 = 1234

Example 2:---->>>>
            Input: num = [2,7,4], k = 181
            Output: [4,5,5]
            Explanation: 274 + 181 = 455

Example 3:--->>>>
            Input: num = [2,1,5], k = 806
            Output: [1,0,2,1]
            Explanation: 215 + 806 = 1021
 */
public class ArrayFormOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int l = sc.nextInt();

        System.out.println("Please enter the to add in Array: ");
        int k = sc.nextInt();

        //int length = String.valueOf(k).length();

        int[] num = new int[l];
        System.out.println("Enter the Array: ");
        for (int i = 0; i < l; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Array enter by you is: "+ Arrays.toString(num));
        System.out.println("Array After adding "+k+" is: "+addToArrayForm(num, k));



    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int no = num.length;
        for (int i = no-1; i >= 0; i--) {
            k += num[i];
            result.add(0, k%10);
            k /= 10;
        }
        while (k > 0){
            result.add(0,k%10);
            k /= 10;
        }

        return result;

    }
}