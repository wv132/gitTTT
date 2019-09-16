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
public class Field {
    //Create fields (board)
    //char[] board;
    int x;
    int y;
    
    
    
    
        
   
   public void createBoard(char[] board) {
       
       board = new char[x*y];  
        for (int i = 0; i < board.length; i++) {
            board[i] = (char)('1'+i);
        }
        
    }    

    public void printBoard(char[] board) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i * 3 + j]);
            }
            System.out.println();
        }
             
    }
    public boolean boardFull(char[] board){
        boolean isFull = true;
        
        for(int i = 0;i<board.length;i++){
            if(board[i]!= 'X' || board[i] != 'O'){
                isFull = false;
            }
           
        }
        return isFull;
    }
    
    public int getBoardPosition(int position,char[] board){
        return board[position];
    }
   
   
    
   

    
    

}
