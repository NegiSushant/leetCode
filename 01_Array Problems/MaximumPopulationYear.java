import java.util.Arrays;
import java.util.Scanner;

/*

https://leetcode.com/problems/maximum-population-year/

19)1854-->>
            You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and
            death years of the ith person.

            The population of some year x is the number of people alive during that year. The ith person is counted in
            year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not
            counted in the year that they die.

            Return the earliest year with the maximum population.


Example 1:-->>>
            Input: logs = [[1993,1999],[2000,2010]]
            Output: 1993
            Explanation: The maximum population is 1, and 1993 is the earliest year with this population.

Example 2:--->>>
                Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
                Output: 1960
                Explanation:
                The maximum population is 2, and it had happened in years 1960 and 1970.
                The earlier year between them is 1960.
 */
public class MaximumPopulationYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        int[][] logs = new int[rows][2];
        for (int i=0; i < rows; i++){
            System.out.print("Enter birth and death year in row "+(i+1)+": ");
            for (int j=0; j < 2; j++) {
                logs[i][j] = in.nextInt();
            }
        }
        System.out.println("Array is: "+ Arrays.toString(logs));
        System.out.println("Max population count: "+ maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int[] peopleInRange = new int[101];
        for (int i = 0; i < logs.length; i++){
            includeAlive(peopleInRange, logs[i][0]-1950, logs[i][1]-1950);
        }
        int max =0, year = 1950;
        for (int j = 0; j < 101; j++){
            if(peopleInRange[j] > max){
                max = peopleInRange[j];
                year = j+1950;
            }
        }
        return year;
    }
    public static void includeAlive(int[] arr, int start, int end){
        for (int i = start; i < end; i++){
            arr[i]++;
        }
    }
}