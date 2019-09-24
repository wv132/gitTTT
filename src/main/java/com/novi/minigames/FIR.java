/*
 * For in a Row , maak gebruik van dezelfde klasse als TicTacToe
 */
package com.novi.minigames;

/**
 *
 * @author wouterverveer
 */
public class FIR {
    private Player player1;
    private Player player2;

    private Field[] board;
    private int boardSize;
    

    public FIR(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        // init board
        boardSize = 3;
        board = new Field[boardSize * boardSize];
        //Field[] board = new Field[boardSize * boardSize];
        for (int i = 0; i < boardSize * boardSize; i++) {
            board[i] = new Field('1');
        }
        

    }
    public void playGame(){
        //createBoard();
        printBoard(board);
        this.board[1]=new Field('X');
        printBoard(board);
        
    }

    private void createBoard() {
        
        
    }

    private void printBoard(Field[] board) {
        System.out.println(" +---+---+---+");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(" | ");
                System.out.print(board[i * 3 + j]);
            }
            System.out.print(" |");
            System.out.println();
            System.out.println(" +---+---+---+");

        }
    }
    
}
