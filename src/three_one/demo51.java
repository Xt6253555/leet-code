package three_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//N皇后
public class demo51 {
    public static void main(String[] args) {
        demo51 demo51 = new demo51();
        List<List<String>> lists = demo51.solveNQueens(12);
        System.out.print(lists.size());
    }
    List<String> list = new ArrayList<>();
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        // 初始化棋盘
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        // 从第 0 行开始
        backtrack(board, 0);
        return res;
    }
    public void backtrack(char[][] board, int row) {
        if (row == board.length) {
            res.add(new ArrayList<>(list));
        }
        for (int i = 0; i < board.length; i++) {
            // 该格不符合放棋子的条件
            if (!isValid(board, row, i)) continue;
            //放棋子
            board[row][i] = 'Q';
            list.add(new String(board[row]));
            //处理下一行
            backtrack(board,row+1);
            //移除棋子
            board[row][i] = '.';
            list.remove(list.size()-1);
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        int n = board.length;
        // 检查列是否有冲突
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') return false;
        }
        // 检查右上方是否有冲突
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        // 检查左上方是否有冲突
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }
}
