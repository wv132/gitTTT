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

    // build blocks for the game
    public void Play() {
        System.out.println("play Game");
        Scanner input = new Scanner(System.in);
        createBoard();
        //player 1

        System.out.print("Player 1 name: ");
        String player1Name = input.nextLine();
        System.out.println("Player 1 marker (X or O): ");
        char player1Marker = input.nextLine().charAt(0);
// player 2
        System.out.print("Player 2 name: ");
        String player2Name = input.nextLine();

        char player2Marker;
        if (player1Marker == 'X') {
            player2Marker = 'O';
        } else {
            player2Marker = 'X';
        }
        System.out.println("PLayer 2 has marker " + player2Marker);

// Create object of player
        Player player1 = new Player(player1Name, player1Marker);
        Player player2 = new Player(player2Name, player2Marker);

        printBoard();

    }
    public char[] board = new char[9];

    public void createBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = (char) ('1' + i);
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i * 3 + j]);
            }
            System.out.println();
        }
    }

// start
// positie van marker
// juiste invoer
// punten telling
// einde game
}
