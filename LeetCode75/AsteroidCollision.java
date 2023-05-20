/*

https://leetcode.com/problems/asteroid-collision/?envType=study-plan-v2&id=leetcode-75

We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction
(positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.



Example 1:------->>>>>>>>
                Input: asteroids = [5,10,-5]
                Output: [5,10]
                Explanation:---->>>>>>>
                                The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

Example 2:-------->>>>>>>>
                Input: asteroids = [8,-8]
                Output: []
                Explanation: ----->>>>>>>
                                The 8 and -8 collide exploding each other.


Example 3:------>>>>>>>
                Input: asteroids = [10,2,-5]
                Output: [10]
                Explanation:----->>>>>>>>>>
                                The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.


Constraints:------->>>>>>>>
            2 <= asteroids.length <= 104
            -1000 <= asteroids[i] <= 1000
            asteroids[i] != 0
 */

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] ast = {10, 2, -5};
        System.out.println(Arrays.toString(asteroidCollision(ast)));
    }
    public static int[] asteroidCollision(int[] ast) {
        Stack<Integer> stk = new Stack<>();
        int n = ast.length;

        for(int i = 0; i < n; i++){
            if(ast[i] <= 0){
                while (!stk.isEmpty() && stk.peek() > 0 && stk.peek() < ast[i] * -1){
                    stk.pop();
                }
                if(!stk.isEmpty() && stk.peek() == ast[i] * -1){
                    stk.pop();
                } else if (!stk.isEmpty() && stk.peek() >= -1 * ast[i]){
                    continue;
                }else{
                    stk.push(ast[i]);
                }
            }
            else{
                stk.push(ast[i]);
            }
        }
        n=stk.size();
        int[] ans=new int[n];

        for(int i=n-1;i>=0;i--)
            ans[i]=stk.pop();
        return ans;
    }

}
