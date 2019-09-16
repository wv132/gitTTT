package com.novi.minigames;

import java.util.*;

/**
 *
 * @author jvr
 */
public class TTT {

    public static Scanner INPUT = new Scanner(System.in);
    public static boolean DEBUG = true;
    
    private Player player1;
    private Player player2;

    private char[] board;
    private int boardSize;

    public TTT(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        
        
        // init board
        int boardSize = 3;
        board = new char[boardSize * boardSize];
        for(int i = 0;i< boardSize * boardSize;i++){
            board[i] = (char)('1' + i);
        }

    }

    public void playGame() {
        int turnCount = 0;
        Player currentPlayer = player1;
        System.out.println(player1.getName()+" points: "+player1.getScore());
        System.out.println(player2.getName()+" points: "+player2.getScore());
        
        
        while (turnCount < 9) {
            System.out.println("Turn "+turnCount);
            System.out.println("Current player: "+currentPlayer.getName());
            
            //TODO placeMarker()
            System.out.print("Choose your postion to place your marker: ");
                int pos = INPUT.nextInt();
                board[pos-1]= currentPlayer.getMarker();
                
                // TODO winGame()
                char mark = currentPlayer.getMarker();

                //Horizontal
                if(board[0]== mark & board[1] == mark & board[2] == mark || board[3]== mark & board[4] == mark & board[5] == mark || board[6]== mark & board[7] == mark & board[8] == mark){
                    System.out.println(currentPlayer.getName()+" has won the game!");
                    
                    currentPlayer.addScore();
                    break;
                    
                }
                
                //Vertical
                else if(board[0]== mark & board[3] == mark & board[6] == mark || board[1]== mark & board[4] == mark & board[7] == mark || board[2]== mark & board[5] == mark & board[8] == mark){
                    System.out.println(currentPlayer.getName()+" has won the game!");
                    
                    currentPlayer.addScore();
                    break;

                }
                //Diagonal
                else if(board[0]== mark & board[4] == mark & board[8] == mark || board[2]== mark & board[4] == mark & board[6] == mark){
                    System.out.println(currentPlayer.getName()+" has won the game!");
                    currentPlayer.addScore();
                    break;

                }
                
                else{
                    currentPlayer = currentPlayer == player1 ? player2 :player1;
                    turnCount++;
                    printBoard();
                }
            
            
        }

    }
    
    private boolean winGame(){
        boolean win = false;
        //TODO zet de win conditie in deze functie.
        return win;
    }
    
    private char placeMarker(){
        //TODO
        // functie om de marker van de current player to zetten
        return ' ';
    }

    private void printBoard() {
        System.out.println(" +---+---+---+");
        for(int i = 0; i<3;i++){
                    for(int j = 0; j<3;j++){
                        System.out.print(" | ");
                        System.out.print(board[i * 3 + j]);

                    }
                    System.out.print(" |");
                    System.out.println();
                    System.out.println(" +---+---+---+");

    }
    }
}
