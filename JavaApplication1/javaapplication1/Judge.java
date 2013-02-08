/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author tame
 */
public class Judge {

    static int result;

    static void check2() {
        if (Data.board[16][16] == 1) {
            result = 2;
        }
        if (Data.board[16][16] == 2) {
            result = 1;
        }

    }

    static void check() {
        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 16; j++) {
                if (j + 4 <= 16) {
                    if (Data.board[i][j] == 1 && Data.board[i][j + 1] == 1 && Data.board[i][j + 2] == 1 && Data.board[i][j + 3] == 1 && Data.board[i][j + 4] == 1) {
                        result = 2;
                        return;
                    }

                    if (Data.board[i][j] == 2 && Data.board[i][j + 1] == 2 && Data.board[i][j + 2] == 2 && Data.board[i][j + 3] == 2 && Data.board[i][j + 4] == 2) {
                        result = 1;
                        return;
                    }
                }
            }
        }


        for (int k = 1; k <= 16; k++) {
            for (int j = 1; j <= 16; j++) {
                if (k + 4 <= 16) {
                    if (Data.board[k][j] == 2 && Data.board[k + 1][j] == 2 && Data.board[k + 2][j] == 2 && Data.board[k + 3][j] == 2 && Data.board[k + 4][j] == 2) {
                        result = 1;
                        return;
                    }
                    if (Data.board[k][j] == 1 && Data.board[k + 1][j] == 1 && Data.board[k + 2][j] == 1 && Data.board[k + 3][j] == 1 && Data.board[k + 4][j] == 1) {
                        result = 2;
                        return;
                    }
                }
            }
        }
        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 16; j++) {
                if (i + 4 <= 16 && j + 4 <= 16) {
                    if (Data.board[i][j] == 1 && Data.board[i + 1][j + 1] == 1 && Data.board[i + 2][j + 2] == 1 && Data.board[i + 3][j + 3] == 1 && Data.board[i + 4][j + 4] == 1) {
                        result = 2;
                        return;
                    }

                    if (Data.board[i][j] == 2 && Data.board[i + 1][j + 1] == 2 && Data.board[i + 2][j + 2] == 2 && Data.board[i + 3][j + 3] == 2 && Data.board[i + 4][j + 4] == 2) {
                        result = 1;
                        return;
                    }
                }
            }
        }

        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 16; j++) {
                if (i + 4 <= 16 && j - 4 >= 1) {
                    if (Data.board[i][j] == 1 && Data.board[i + 1][j - 1] == 1 && Data.board[i + 2][j - 2] == 1 && Data.board[i + 3][j - 3] == 1 && Data.board[i + 4][j - 4] == 1) {
                        result = 2;
                        return;
                    }

                    if (Data.board[i][j] == 2 && Data.board[i + 1][j - 1] == 2 && Data.board[i + 2][j - 2] == 2 && Data.board[i + 3][j - 3] == 2 && Data.board[i + 4][j - 4] == 2) {
                        result = 1;
                        return;
                    }
                }
            }
        }
        return;
    }
}
