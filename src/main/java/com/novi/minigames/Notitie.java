/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novi.minigames;

/**
 *
 * @author wouterverveer
 */
public class Notitie {

    // class aanmaken van fourinarow, heet nu even Notitie straks refactor als je gaat bouwen
    // de class naam is nu alleen voor training en uitleg.
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    private Field[][] board;

    public Notitie(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        currentPlayer = player1;

        //init board
        board = new Field[6][7];

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                board[row][col] = new Field('.');
            }
        }

    }

    public void playGame() {
        boolean gameEnded = false;
        while (!gameEnded) {

            printBoard();
            System.out.println(currentPlayer.getName() + " Choose your column: ");
            int column = Game.INPUT.nextInt();
            if (setField(column - 1)) {
                if (gameIsWon()) {
                    printBoard();
                    System.out.println(currentPlayer.getName() + " won the game");
                    gameEnded = true;
                } else {
                    switchPlayer();
                }

            } else {
                System.out.println("incorrect input, choose another column");
            }

        }// end of while(!gameEnded)
    }

    private void switchPlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    private void printBoard() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                System.out.print(board[row][col].get() + " ");
            }
            System.out.println();
        }
        System.out.println("1 2 3 4 5 6 7");
    }

    private boolean setField(int index) {
        boolean result = false;
        if (index >= 0 && index <= 6) {
            for (int i = 5; i >= 0; i--) {
                if (board[i][index].isEmpty()) {
                    board[i][index].set(currentPlayer.getMarker());
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    private boolean gameIsWon() {
        boolean result = false;
        for (int i = 5; i > 0; i--) {
            result = evaluateRow(i, 0, 1);
            if (result) {
                break;
            }
        }
        if (!result) {
            for (int i = 0; i <= 6; i++) {
                result = evaluateColumn(5, i, 1);
                if (result) {
                    break;
                }
            }
        }
        if (!result) {
            for (int i = 0; i <= 6; i++) {
                result = evaluateSlash(5, i, 1);
                if (result) {
                    break;
                }
            }
        }
        if (!result) {
            for (int i = 5; i >= 0; i--) {
                result = evaluateSlash(i, 5, 1);
                if (result) {
                    break;
                }
            }
        }
        if (!result) {
            for (int i = 0; i <= 6; i++) {
                result = evaluateBackSlash(5, i, 1);
                if (result) {
                    break;
                }
            }
        }
        if (!result) {
            for (int i = 5; i >= 0; i--) {
                result = evaluateBackSlash(i, 5, 1);
                if (result) {
                    break;
                }
            }
        }
        return result;
    }

    private boolean evaluateRow(int row, int column, int set) {
        if (set == 4) {
            return true;
        } else if (row < 0 || row > 5 || column < 0 || column > 5) {
            return false;
        } else if (!board[row][column].isEmpty() && board[row][column].get() == board[row][column + 1].get()) {
            return evaluateRow(row, column + 1, set + 1);
        } else {
            return evaluateRow(row, column + 1, 1);
        }
    }

    private boolean evaluateColumn(int row, int column, int set) {
        if (set == 4) {
            return true;
        } else if (row < 0 || row > 5 || column < 0 || column > 5) {
            return false;
        } else if (!board[row][column].isEmpty() && board[row][column].get() == board[row - 1][column].get()) {
            return evaluateColumn(row - 1, column, set + 1);
        } else {
            return evaluateColumn(row - 1, column, 1);
        }
    }

    private boolean evaluateSlash(int row, int column, int set) {
        if (set == 4) {
            return true;
        } else if (row < 1 || row > 5 || column < 1 || column > 5) {
            return false;
        } else if (!board[row][column].isEmpty() && board[row][column].get() == board[row - 1][column + 1].get()) {
            return evaluateSlash(row - 1, column + 1, set + 1);
        } else {
            return evaluateSlash(row - 1, column + 1, 1);
        }
    }

    private boolean evaluateBackSlash(int row, int column, int set) {
        if (set == 4) {
            return true;
        } else if (row < 1 || row > 5 || column < 1 || column > 6) {
            return false;
        } else if (!board[row][column].isEmpty() && board[row][column].get() == board[row - 1][column - 1].get()) {
            return evaluateBackSlash(row - 1, column - 1, set + 1);
        } else {
            return evaluateBackSlash(row - 1, column - 1, 1);
        }
    }

    private void gameEnded(Player player) {

    }

    private void resetGame() {

    }

}
