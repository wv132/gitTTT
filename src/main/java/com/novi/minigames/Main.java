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
public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Menu:");
        System.out.println("1. TicTacToe\n2. Four in a row");
        System.out.println("0. Quit.");
        System.out.print("Menu choice: ");
        
        int input = reader.nextInt();
        System.out.println();
        
        switch(input){
            case 0:
                break;
                
            case 1:
                TicTacToe game = new TicTacToe();
                game.Play();
                
                break;
                
            case 2:
                
                break;
        }
        
                
    }
    
}
