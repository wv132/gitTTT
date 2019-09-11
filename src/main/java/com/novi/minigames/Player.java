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
public class Player {
    //Create player name
    //Create player marker
    //Create player score
  private final String name;
  private char marker;
  private int score;
  
  
  
  public String getName(){
      return name;
  }
  
  public char getMarker(){
      return marker;
  }
  
  public void addScore(){
      score++;
  }
  public int getScore(){
      return score;
  }
  
  public Player(String name, char marker){
      this.name = name;
      this.marker = marker;
      this.score = score;
      
  }
  
}
