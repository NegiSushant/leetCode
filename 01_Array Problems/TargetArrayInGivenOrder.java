/*

https://leetcode.com/problems/create-target-array-in-the-given-order/

9)Ques_1389-->>
                Given two arrays of integers nums and index. Your task to create target array under the following rules:
                        1) Initially target array is empty.
                        2) From left to right read nums[i] and index[i], insert at index index[i] the value
                           nums[i] in target array.
                        3) Repeat the previous step until there are no elements to read in nums and index.

                 Return the target array.

                 It is guaranteed that the insertion operations will be valid.



Example 1>>>>
        Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]

        Output: [0,4,1,3,2]

        Explanation:
                    nums       index     target
                    0            0        [0]
                    1            1        [0,1]
                    2            2        [0,1,2]
                    3            2        [0,1,3,2]
                    4            1        [0,4,1,3,2]

Example 2:
            Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
            Output: [0,1,2,3,4]
            Explanation:
                        nums       index     target
                        1            0        [1]
                        2            1        [1,2]
                        3            2        [1,2,3]
                        4            3        [1,2,3,4]
                        0            0        [0,1,2,3,4]

Example 3:
            Input: nums = [1], index = [0]
            Output: [1]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the Arrays lenght: ");
        int n = sc.nextInt();

        System.out.println("Please enter the array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Please enter the index of array & make sure this index lie below the Arrays lenght: ");
        int[] index = new int[n];
        for (int j = 0; j < n; j++) {
            index[j] = sc.nextInt();
        }

        System.out.println("Enter Arrays is: "+ Arrays.toString(nums));
        System.out.println("Index is: "+Arrays.toString(index));
        System.out.println("Target Array is:"+ Arrays.toString(createTargetArray(nums, index)));


    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        //n = index.length;

        int[] target = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < n; i++) {
            target[i]= list.get(i);
        }
        return target;
    }
}