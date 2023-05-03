/*

https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&id=leetcode-75

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points
i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.



Example 1:------->>>>>
                Input: gain = [-5,1,5,0,-7]
                Output: 1
                Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Example 2:----->>>>>>
                Input: gain = [-4,-3,-2,-1,4,3,2]
                Output: 0
                Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.


Constraints:------->>>>>>
                n == gain.length
                1 <= n <= 100
                -100 <= gain[i] <= 100
 */
import java.util.Arrays;
import java.util.Scanner;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum altitude hide is: "+largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = 0;
        int[] trip = new int[n+1];
        trip[0] = 0;
        for(int i = 1; i < trip.length; i++){
            trip[i] = trip[i-1] + gain[i-1];
        }
        Arrays.sort(trip);

        for(int i = 0; i < trip.length; i++){
            if(trip[i] > 0){
                max = trip[i];
            }
        }
        return max;
    }
}
