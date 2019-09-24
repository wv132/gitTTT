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
    
    private char value;
    private char defaultValue;
    
    // constructor
    public Field(char value){
        this.value = defaultValue = value;
    }
    
    public void set (char value){
        this.value = value;
    }
    
    public char get(){
        return value;
    }
    
    public boolean isEmpty(){
        return value == defaultValue;
    }
    
   public void reset(){
       this.value = defaultValue;
   }

    
    

}
