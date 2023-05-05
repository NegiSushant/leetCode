import java.util.Scanner;

/*

https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&id=leetcode-75

You are given an integer array height of length n. There are n vertical lines drawn such that the
two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.


Return the maximum amount of water a container can store.

Notice that you may not slant the container.



Example 1:---->>>>>>>
                Input: height = [1,8,6,2,5,4,8,3,7]
                Output: 49
                Explanation:----->>>>
                            The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
                            In this case, the max area of water (blue section) the container can contain is 49.

Example 2:---->>>>>
                Input: height = [1,1]
                Output: 1


Constraints:----->>>>>>
                n == height.length
                2 <= n <= 105
                0 <= height[i] <= 104
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in Array: ");
        int[] height =  new int[n];
        for (int i = 0; i < n; i++) {
            height[i]= sc.nextInt();
        }
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int ans = 0;
        while(i < j){
            int current = (j-i)*Math.min(height[i], height[j]);
            ans = Math.max(ans, current);
            if(height[i] < height[j]){
                i++;
            } else if (height[i] > height[j]) {
                j--;
            }else{
                i++;
                j--;
            }
        }
        return ans;
    }
}
