/*
You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means
not empty, and an integer n, return true if n new flowers can be planted in the flowerbed
without violating the no-adjacent-flowers rule and false otherwise.



Example 1:---->>>>
            Input: flowerbed = [1,0,0,0,1], n = 1
            Output: true

Example 2:----->>>>>
            Input: flowerbed = [1,0,0,0,1], n = 2
            Output: false


Constraints:---->>>>
            1 <= flowerbed.length <= 2 * 104
            flowerbed[i] is 0 or 1.
            There are no two adjacent flowers in flowerbed.
            0 <= n <= flowerbed.length
 */

import java.util.Scanner;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();

        int [] flowerbed = new int[len];
        System.out.println("Enter the element in Array(only 0 and 1): ");
        for (int i = 0; i < len; i++) {
            flowerbed[i] = sc.nextInt();
        }
        System.out.println("Enter the number of plant you plot: ");
        int n = sc.nextInt();
        System.out.println(canPlaceFlowers(flowerbed, n));

    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean left = flowerbed[i - 1] == 0;
                boolean right = (i == flowerbed.length-1)||(flowerbed[i+1] == 0);
                if(left && right){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}
