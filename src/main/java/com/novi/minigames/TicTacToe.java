/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novi.minigames;

import java.util.*;

/**
 *
 * @author jvr
 */
public class TicTacToe {

    Scanner input = new Scanner(System.in);
    Field field = new Field(3,3);
    boolean debug = true;
    char[] board= new char[9];
    
    
     
      void printBoard(){
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i * 3 + j]);
            }
            System.out.println();
        }
             
    
      }      
   

    // build blocks for the game
    public void playGame() {
        System.out.println("play Game");
         

        //createboard
        field.createBoard(board);
        

// create players     
//player 1 name and marker
        System.out.println("Player 1 name: ");
        String player1Name = debug ? "Wouter" : input.nextLine();
        System.out.println("Player 1 marker (X or O): ");
        char player1Marker = debug ? 'X' : input.nextLine().charAt(0);
// player 2 name and marker

        System.out.println("Player 2 name: ");
        String player2Name = debug ? "Verveer" : input.nextLine();
        char player2Marker = player1Marker == 'X' ? 'O' : 'X';
        System.out.println(player2Name + " has marker: " + player2Marker);

// Create object of player
        Player player1 = new Player(player1Name, player1Marker);
        Player player2 = new Player(player2Name, player2Marker);

// start player and marker
        Player nowPlayer = player1;
        String currentPlayer = player1.getName();
        char playerMarker = player1.getMarker();
        int turnCount = 0;
        while (turnCount < 9) {
            //printBoard();
            field.printBoard(board);
            System.out.println(nowPlayer.getName() + " make your pos choice");

            //getPlayerPosition();
            //field.getBoardPosition(nowPlayer.getPlayerChoice());
            //place marker on field, check for free position, check for winner
            
            if (field.boardFull(board)) {
                System.out.println("not full");
            }

            //if no winner
            //change player turn
            nowPlayer = nowPlayer == player1 ? player2 : player1;
            playerMarker = playerMarker == 'X' ? 'O' : 'X';

            //make a turn count
            turnCount++;
        }

    }

// winnaar bepalen
// juiste invoer
// punten telling
// einde game
}
