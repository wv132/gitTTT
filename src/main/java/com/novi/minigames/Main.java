/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.novi.minigames;

import java.util.Scanner;

/**
 *
 * @author jvr
 */
public class Main {
   
   
    public static void main(String[] args) {
        
        // create players     
//player 1 name and marker
        System.out.println("Player 1 name: ");
        String player1Name = TTT.DEBUG ? "Jan" : TTT.INPUT.nextLine();
        char player1Marker = 'X';
// player 2 name and marker

        System.out.println("Player 2 name: ");
        String player2Name = TTT.DEBUG ? "Piet" : TTT.INPUT.nextLine();
        char player2Marker = 'O';

// Create object of player
        Player player1 = new Player(player1Name, player1Marker);
        Player player2 = new Player(player2Name, player2Marker);
        
        
       //new Game();
       Scanner reader = new Scanner(System.in);
    System.out.println("Menu:");
        System.out.println("1. TicTacToe\n2. Four in a row");
        System.out.println("0. Quit.");
        System.out.print("Menu choice: ");
        
        int chosenGame = reader.nextInt();
        System.out.println();
        
        switch(chosenGame){
            case 0:
                break;     
            case 1: TTT game = new TTT(player1,player2); game.playGame();            
                break;  
            case 2:
                break;
        }
                
    }
    
}
