/*

https://leetcode.com/problems/word-search/

Ques_79------>>>>>>>
                Given an m x n grid of characters board and a string word,
                return true if word exists in the grid.

                The word can be constructed from letters of sequentially adjacent cells,
                 where adjacent cells are horizontally or vertically neighboring.
                 The same letter cell may not be used more than once.



Example 1:------>>>>>>
                Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
                Output: true

Example 2:----->>>>>>>
                Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
                Output: true

Example 3:------>>>>>>>
                Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
                Output: false

 */
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));

    }
    static boolean[][] visit;
    public static boolean exist(char[][] board, String word) {
        visit = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean search(char[][]board, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }

        if (row >= board.length || row < 0 || col >= board[row].length ||
                col < 0 || board[row][col] != word.charAt(index) || visit[row][col]) {
            return false;
        }

        visit[row][col] = true;
        if (search(board, word, row - 1, col, index + 1) ||
                search(board, word, row + 1, col, index + 1) ||
                search(board, word, row, col - 1, index + 1) ||
                search(board, word, row, col + 1, index + 1)) {
            return true;
        }

        visit[row][col] = false;
        return false;
    }
}
