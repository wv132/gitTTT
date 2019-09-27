/*
 * For in a Row , maak gebruik van dezelfde klasse als TicTacToe
 */
package com.novi.minigames;

/**
 *
 * @author wouterverveer
 */
public class FourInARow {
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    private Field[] board;
    private int boardSize;
    

    public FourInARow(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;

        // init board
        boardSize = 3;
        board = new Field[boardSize * boardSize];
        //Field[] board = new Field[boardSize * boardSize];
        for (int i = 0; i < boardSize * boardSize; i++) {
            this.board[i] = new Field((char)('1'+i));
        }
        

    }
    public void playGame(){
        boolean gameEnded = false;
        Player currentPlayer = player1;
            System.out.println("Score "+ player1.getName()+": "+player1.getScore());
            System.out.println("Score "+ player2.getName()+": "+player2.getScore());
            
        while(!gameEnded){  
            

            printBoard();
            System.out.println(currentPlayer.getName() + " Choose your field: ");
            int column = Game.INPUT.nextInt();
            if (setField(column - 1)) {
                if(winGame(currentPlayer.getMarker())){
                System.out.println(currentPlayer.getName() + " has won the game!");
                    currentPlayer.addScore();
                    printBoard();
                    break;
                }
                else{
                    switchPlayer();
                }
                
                
            } else {
                System.out.println("incorrect input, choose another field");
            }
            
     
        }// end of while(!gameEnded)    
    }

    private void switchPlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }
    
    private boolean setField(int index) {
        boolean result = false;
                if (board[index].isEmpty()) {
                    board[index].set(currentPlayer.getMarker());
                    result = true;
                }       
        return result;
    }
    
    private boolean gameIsWon() {
        return false;
    }

    private void gameEnded(Player player) {
        
    }

    private void resetGame() {

    }
    
    private boolean winGame(char mark) {
        boolean win = false;
        //Horizontal
        if (this.board[0].get() == mark & this.board[1].get() == mark & this.board[2].get() == mark || this.board[3].get() == mark & this.board[4].get() == mark & this.board[5].get() == mark || this.board[6].get() == mark & this.board[7].get() == mark & this.board[8].get() == mark){
            win = true;
        }
        //Vertical
        else if (this.board[0].get() == mark & this.board[3].get() == mark & this.board[6].get() == mark || this.board[1].get() == mark & this.board[4].get() == mark & this.board[7].get() == mark || this.board[2].get() == mark & this.board[5].get() == mark & this.board[8].get() == mark){
            win = true;
        }
        //Diagonal
        else if (this.board[0].get() == mark & this.board[4].get() == mark & this.board[8].get() == mark || this.board[2].get() == mark & this.board[4].get() == mark & this.board[6].get() == mark){
            win = true;
        }
        
        return win;
    }
    
    private boolean fullBoard(){
       return false; 
    }
    

    private void printBoard() {
        System.out.println(" +---+---+---+");
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(" | ");
                System.out.print(this.board[i * 3 + j].get());
            }
            System.out.print(" |");
            System.out.println();
            System.out.println(" +---+---+---+");

        }
    }
    
}
