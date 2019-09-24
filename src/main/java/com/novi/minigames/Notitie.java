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
                switchPlayer();
            } else {
                System.out.println("incorrect input, coose another column");
            }

        }// end of while(!gameEnded)
    }

    private void switchPlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    private void printBoard() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) { 
                System.out.print(board[row][col].get()+" ");
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
        return false;
    }

    private void gameEnded(Player player) {

    }

    private void resetGame() {

    }

}
