package com.company;

public class QueenBackTracking
{
    public static void Main(String[] args)
    {
        int[][] board = new int[4][4];
        queen(board, 1, 1);
    }

    public static void queen(int[][] board, int i, int j)
    {
        if (isSafe(board, i, j)) {
            board[i][j] = 1;
        }

    }

    public static boolean isSafe(int[][] board, int i, int j)
    {
        if (i > 0 && j > 0 && board[i - 1][j - 1] == 1)
            return false;
        if (i > 0 && j < 3 && board[i - 1][j + 1] == 1)
            return false;
        for (int p = 0; p < 4; p++) {
            if (board[i][p] == 1)
                return false;
            if (board[p][j] == 1)
                return false;
        }
        return true;
    }
}
