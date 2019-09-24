/*
 * getters hebben geen parameters. getters pakken namelijk binnen de class de gegevens
worden opgehaald(get) uit dezelfde class.
 * Setters hebben wel parameters, 
    constructor maak je als je een class hebt gemaakt. de constructor bepaald de paramaeters om een object te maken.
 */
package com.novi.minigames;

/**
 *
 * @author jvr
 */
public class Player {
    //Create player name
    //Create player marker
    //Create player score
  private String name;
  private char marker;
  private int score;
  
  public Player(String name, char marker){
      this.name = name;
      this.marker = marker;
      this.score = score;
      
  }
  
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
  
  
  
  
  
}
