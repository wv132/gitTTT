package com.novi.minigames;

import java.util.*;

/**
 *
 * @author jvr
 */
public class TTT {

    private Player player1;
    private Player player2;

    private char[] board;
    private int boardSize;
    

    public TTT(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        // init board
        boardSize = 3;
        board = new char[boardSize * boardSize];
        

    }

    public void playGame() {
        boolean playing = true;
        int turnCount = 1;
        //init currentplayer
        Player currentPlayer = player1;
        

        while (playing) {
            createBoard(board, boardSize);
            System.out.println(player1.getName() + " points: " + player1.getScore());
            System.out.println(player2.getName() + " points: " + player2.getScore());
            while (turnCount < 11) {
                System.out.println("Turn " + turnCount);
                System.out.println("Current player: " + currentPlayer.getName());
                printBoard(board);

                placeMarker(board,currentPlayer.getMarker());
                
                if (fullBoard(board)==true){
                    System.out.println("No winner it is a tie!");
                    break;
                }
                else if (winGame(board,currentPlayer.getMarker())) {
                    System.out.println(currentPlayer.getName() + " has won the game!");
                    currentPlayer.addScore();
                    printBoard(board);
                    break;
                    

                } else {
                    currentPlayer = currentPlayer == player1 ? player2 : player1;
                    turnCount++;

                }
               
            }//end of while count

           playing = false;
        }//end of playing

    }

    private boolean fullBoard(char[] board) {
        //TODO controle of het bord vol is en dat het spel is geeindigd als er geen winnaar is dan betekend dit een gelijk spel. geen punten
        //Eerste opzet maar wekt nog niet
        boolean full = false;
        for(int i = 0; i<board.length; i++){
            if(board[i] != 'X' || board[i] !='O'){
                
                //return false;
                break;
            }  
            else {
                full = true;
            }
        }
        
        return full;
    }

    private boolean winGame(char[] board, char mark) {
        boolean win = false;
        //Horizontal
        if (board[0] == mark & board[1] == mark & board[2] == mark || board[3] == mark & board[4] == mark & board[5] == mark || board[6] == mark & board[7] == mark & board[8] == mark){
            win = true;
        }
        //Vertical
        else if (board[0] == mark & board[3] == mark & board[6] == mark || board[1] == mark & board[4] == mark & board[7] == mark || board[2] == mark & board[5] == mark & board[8] == mark){
            win = true;
        }
        //Diagonal
        else if (board[0] == mark & board[4] == mark & board[8] == mark || board[2] == mark & board[4] == mark & board[6] == mark){
            win = true;
        }
        
        return win;
    }

    private char placeMarker(char[] board, char mark) {
            System.out.print("Choose your postion to place your marker: ");
                int pos = Game.INPUT.nextInt();
                
        return board[pos - 1] = mark;
    }
    
    private void createBoard(char[] board, int boardSize){
        for (int i = 0; i < boardSize * boardSize; i++) {
            board[i] = (char) ('1' + i);
        }
    }

    private void printBoard(char[] board) {
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
