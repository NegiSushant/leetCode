/*

https://leetcode.com/problems/koko-eating-bananas/description/?envType=study-plan-v2&id=leetcode-75

Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of
bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of
them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.



Example 1:------>>>>>>
                Input: piles = [3,6,7,11], h = 8
                Output: 4


Example 2:------>>>>>>>>
                Input: piles = [30,11,23,4,20], h = 5
                Output: 30


Example 3:------>>>>>>>>
                Input: piles = [30,11,23,4,20], h = 6
                Output: 23
 */

import java.util.Scanner;

public class KokoEatingBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the hours: ");
        int h = sc.nextInt();

        System.out.println("minimum bananas koko can eat within h hours is: "+minEatingSpeed(arr, h));

    }
    public static int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = 1;
        for(int pile : piles){
            e = Math.max(e, pile);
        }

        while(s < e){
            int m = s + (e - s)/2;
            int hour = 0;
            for(int pile : piles){
                hour += Math.ceil(pile * 1.0/m);
            }

            if(hour <= h){
                e = m;
            }else{
                s = m+1;
            }
        }
        return s;
    }
}
