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
    
    boolean playing = true;

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
        int turnCount = 1;
        Player currentPlayer = player1;
        System.out.println(player1.getName()+" points: "+player1.getScore());
        System.out.println(player2.getName()+" points: "+player2.getScore());
        
        
            
        
        while (turnCount < 10) {
            System.out.println("Turn "+turnCount);
            System.out.println("Current player: "+currentPlayer.getName());
            printBoard();
            //TODO placeMarker()
            System.out.print("Choose your postion to place your marker: ");
                int pos = INPUT.nextInt();
                board[pos-1]= currentPlayer.getMarker();
                
                // TODO winGame()
                char mark = currentPlayer.getMarker();

                //Horizontal
                if(board[0]== mark & board[1] == mark & board[2] == mark || board[3] == mark & board[4] == mark & board[5] == mark || board[6]== mark & board[7] == mark & board[8] == mark){
                    System.out.println(currentPlayer.getName()+" has won the game!");
                    currentPlayer.addScore();
                    printBoard();
                    break;
                   
                }
                //Vertical
                else if(board[0]== mark & board[3] == mark & board[6] == mark || board[1] == mark & board[4] == mark & board[7] == mark || board[2]== mark & board[5] == mark & board[8] == mark){
                    System.out.println(currentPlayer.getName()+" has won the game!"); 
                    currentPlayer.addScore();
                    printBoard();
                    break;
                    

                }
                //Diagonal
                else if(board[0]== mark & board[4] == mark & board[8] == mark || board[2] == mark & board[4] == mark & board[6] == mark){
                    System.out.println(currentPlayer.getName()+" has won the game!");
                    currentPlayer.addScore();
                    printBoard();
                    break;
                    

                }
                
                else{
                    currentPlayer = currentPlayer == player1 ? player2 :player1;
                    turnCount++;

                }
            
            
        }

    
    }
    
    private boolean Playing(){
        String answer;
        System.out.println("Play again? Y/N: ");
        answer = INPUT.nextLine();
        if (answer == "Y"){
            return true;
        }
        else{
            return false;
        }
    }
    
    private boolean fullBoard(){
        //TODO controle of het bord vol is en dat het spel is geeindigd als er geen winnaar is dan betekend dit een gelijk spel. geen punten
        return false;
    }
    
    private boolean winGame(){
        boolean win = false;
        //TODO zet de win conditie in deze functie. winnaar krijgt 1 punt
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
