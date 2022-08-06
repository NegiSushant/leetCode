import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

8)Ques_1365->>
                Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
                That is, for each nums[i] you have to count the number of valid j's such that j != i and
                nums[j] < nums[i].

                Return the answer in an array.



Example 1:
            Input: nums = [8,1,2,2,3]
            Output: [4,0,1,1,3]

            Explanation:
            For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
            For nums[1]=1 does not exist any smaller number than it.
            For nums[2]=2 there exist one smaller number than it (1).
            For nums[3]=2 there exist one smaller number than it (1).
            For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 */
public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length of Array: ");
        int len = in.nextInt();

        System.out.println("Please enter the Arrays number: ");
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println("Input Array is: "+ Arrays.toString(nums));
        System.out.println("Numbers Smaller then the Current Number is:"+Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        //int max = Integer.MIN_VALUE;
        int count;

        int[] new_nums = new int[len];

        for (int j = 0; j < len; j++){
            count = 0;
            for (int k = 0; k < len; k++) {
                if (nums[j] > nums[k]){
                    count += 1;
                }
            }
            new_nums[j] = count;
        }
        return new_nums;
    }
}