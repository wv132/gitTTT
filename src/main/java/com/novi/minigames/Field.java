/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novi.minigames;

/**
 *
 * @author jvr
 */
public class Field {
    //Create fields (board)
    //char[] board;
    
    private char value;
    private char defaultValue;
    
    
    public Field(char value){
        this.value = defaultValue = value;
    }
    
    public void setField (char value){
        this.value = value;
    }
    
    public boolean isEmpty(){
        return value == defaultValue;
    }
    
   

    
    

}
