package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int column = 0; column < board.length; column++) {
            rsl[column] = board[column][column];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int column = 0; column < board.length; column++) {
            if (board[column][column] == 'X' && (monoHorizontal(board, column) || monoVertical(board, column))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
