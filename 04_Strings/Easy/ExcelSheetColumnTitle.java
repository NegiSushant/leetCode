import java.util.Scanner;

/*

https://leetcode.com/problems/excel-sheet-column-title/

13)Ques_168------->>>>>>>
                    Given an integer columnNumber, return its corresponding column title as
                    it appears in an Excel sheet.

For example:---->>>>>
            A -> 1
            B -> 2
            C -> 3
            ...
            Z -> 26
            AA -> 27
            AB -> 28
            ...


Example 1:----->>>>>>
                Input: columnNumber = 1
                Output: "A"


Example 2:---->>>>>>
                Input: columnNumber = 28
                Output: "AB"


Example 3:------>>>>>>>
                Input: columnNumber = 701
                Output: "ZY"

 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the column Number: ");
        int columnNumber = sc.nextInt();

        System.out.println("Column Number is: "+columnNumber);
        System.out.println("output: "+convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        String result = "";
        while(columnNumber != 0) {
            char ch = (char)((columnNumber - 1) % 26 + 65);
            columnNumber = (columnNumber - 1) / 26;
            result = ch + result;
        }
        return result;
    }
}
