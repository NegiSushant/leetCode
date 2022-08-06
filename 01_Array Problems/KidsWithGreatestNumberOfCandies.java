/*

https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

6)Ques_1431-->>
                There are n kids with candies. You are given an integer array candies, where each candies[i] represents
                the number of candies the ith kid has, and an integer extraCandies,
                denoting the number of extra candies that you have.

                Return a boolean array result of length n, where result[i] is true if,
                after giving the ith kid all the extraCandies, they will have the greatest number of
                candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of Kids: ");
        int kid = sc.nextInt();

        System.out.println("Please enter the Candies: ");
        int[] candies = new int[kid];
        for(int i = 0; i < kid; i++){
            candies[i] = sc.nextInt();
        }

        System.out.println("Please enter the extra Candies: ");
        int extraCandies = sc.nextInt();


        System.out.println("Input Candies: "+ Arrays.toString(candies));
        System.out.println("Kids with Greatest Numbers of Candies: "+kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int kid = candies.length;
        int max = Integer.MIN_VALUE;

        ArrayList<Boolean> list = new ArrayList<>();
        for(int j = 0; j < kid; j++){
            if(candies[j] > max){
                max = candies[j];
            }
            candies[j] += extraCandies;
        }
        for(int k = 0; k < kid; k++){
            if(candies[k] >= max){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;


    }
}