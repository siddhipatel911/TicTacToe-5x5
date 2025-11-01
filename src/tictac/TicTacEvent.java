/*
Programmer: Siddhi Patel
Date: April 25, 2025
Program Name: Tic Tac Toe Game
Program Description: This program uses arrays to create a tic tac toe game
* This file handles events and logic for the Tic Tac Toe game
* A 5x5 grid of buttons is displayed and the two players are to enter their names and click the play button to start
* Player 1 will start the game, clicking any button to show X, followed by player 2 playing as O
* The buttons will show X and Y alternately until there is a win (4 in a row) 
* The winner will be displayed and the winning 4 in a row will be highlighted in gold
* The game can be played multiple times with an ongoing score by using the play button as the reset button as well
* The number of wins for each player and number of ties will be displayed for each ongoing game
 */
package tictac;

/**
 *
 * @author Siddhi 
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TicTacEvent implements ItemListener, ActionListener, Runnable { //creates a class that responds to mouse and keyboard input
    TicTac gui; //associates the game board with the event
    
    // Images for the X, O, and default card back
    ImageIcon a = new ImageIcon("X.jpg");
    ImageIcon b = new ImageIcon("O.jpg");
    ImageIcon back = new ImageIcon("cardback.jpg ");
    
    int clicks = 0; //tracks the number of clicks
    int[][] check = new int[5][5]; //array to check for winner (0 = empty, 1 = X, 2 = O)
    
    //To track wins and ties
    int xWins = 0;
    int oWins = 0;
    int ties = 0;
    
    //Default player names
    String p1Name = "X";
    String p2Name = "O";

    public TicTacEvent (TicTac in){ //associates the two files to be used together
        gui = in;
        
        /*Sets all buttons to default (neither x nor o)*/
        for (int row=0; row<=4; row++){
           for (int col=0; col<=4; col++){
               check[row][col]=0; //initiates the winner check array
           }
       }
    }
    
    /* Handles button clicks for all game buttons and the "Play" button */
    public void actionPerformed (ActionEvent event) { //tells the program what to do when a button is clicked
       String command = event.getActionCommand(); //gets the button click input by taking its name

       /* Resets board and game state when "Play" button is clicked */
       if (command.equals("Play")) { 
           p1Name = gui.Player1.getText(); //gets player 1 name
           p2Name = gui.Player2.getText(); //gets player 2 name
           gui.play.setEnabled(false); //disables the play button
           clicks = 0; //resets the clicks
           
           /* Resets the layout*/
           for (int x=0; x<=4; x++){ //for all the rows
            for (int y=0; y<=4; y++){ //for all the columns
                gui.boxes[x][y].setIcon(back); //changes all buttons to back image
                gui.boxes[x][y].setBackground(new Color (128,166,206)); //resets the button color 
                check[x][y]=0; //resets all buttons to neither x nor o
                gui.boxes[x][y].setEnabled(true); //enables all the buttons to play
            }
           }
       }
       
       /*Handles grid button clicks by calling appropriate method*/
       if (command.equals("1")) {
           b1();
       }
       if (command.equals("2")) {
           b2();
       }
       if (command.equals("3")) {
           b3();
       }
       if (command.equals("4")) {
           b4();
       }
       if (command.equals("5")) {
           b5();
       }
       if (command.equals("6")) {
           b6();
       }
       if (command.equals("7")) {
           b7();
       }
       if (command.equals("8")) {
           b8();
       }
       if (command.equals("9")) {
           b9();
       }
       if (command.equals("10")) {
           b10();
       }
       if (command.equals("11")) {
           b11();
       }
       if (command.equals("12")) {
           b12();
       }
       if (command.equals("13")) {
           b13();
       }
       if (command.equals("14")) {
           b14();
       }
       if (command.equals("15")) {
           b15();
       }
       if (command.equals("16")) {
           b16();
       }
       if (command.equals("17")) {
           b17();
       }
       if (command.equals("18")) {
           b18();
       }
       if (command.equals("19")) {
           b19();
       }
       if (command.equals("20")) {
           b20();
       }
       if (command.equals("21")) {
           b21();
       }
       if (command.equals("22")) {
           b22();
       }
       if (command.equals("23")) {
           b23();
       }
       if (command.equals("24")) {
           b24();
       }
       if (command.equals("25")) {
           b25();
       }
    }
    
    /**
     * Marks the specified box with X or O based on turn count and updates game state.
     * These 25 methods handle individual box clicks. Each updates the visual icon,
     * internal board state, and checks for a winner.
     */
    
    void b1() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){ 
            gui.boxes[0][0].setIcon(a); //displays x
            check[0][0] = 1;
        } 
        else { 
            gui.boxes[0][0].setIcon(b); //displays o
            check[0][0] = 2;
        }
        winner(); //checks for winner
    }
    
    void b2() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[0][1].setIcon(a); //displays x
            check[0][1] = 1;
        } else {
            gui.boxes[0][1].setIcon(b); //displays o
            check[0][1] = 2;
        }
        winner(); //checks for winner
    }
    
    void b3() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[0][2].setIcon(a); //displays x
            check[0][2] = 1;
        } else {
            gui.boxes[0][2].setIcon(b); //displays o
            check[0][2] = 2;
        }
        winner(); //checks for winner
    }
    
    void b4() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[0][3].setIcon(a); //displays x
            check[0][3] = 1;
        } else {
            gui.boxes[0][3].setIcon(b); //displays o
            check[0][3] = 2;
        }
        winner(); //checks for winner
    }
    
    void b5() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[0][4].setIcon(a); //displays x
            check[0][4] = 1;
        } else {
            gui.boxes[0][4].setIcon(b); //displays o
            check[0][4] = 2;
        }
        winner(); //checks for winner
    }
    
    void b6() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[1][0].setIcon(a); //displays x
            check[1][0] = 1;
        } else {
            gui.boxes[1][0].setIcon(b); //displays o
            check[1][0] = 2;
        }
        winner(); //checks for winner
    }
    
    void b7() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[1][1].setIcon(a); //displays x
            check[1][1] = 1;
        } else {
            gui.boxes[1][1].setIcon(b); //displays o
            check[1][1] = 2;
        } 
        winner(); //checks for winner
    }
    
    void b8() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[1][2].setIcon(a); //displays x
            check[1][2] = 1;
        } else {
            gui.boxes[1][2].setIcon(b); //displays o
            check[1][2] = 2;
        }
        winner(); //checks for winner
    }
    
    void b9() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[1][3].setIcon(a); //displays x
            check[1][3] = 1;
        } else {
            gui.boxes[1][3].setIcon(b); //displays o
            check[1][3] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b10() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[1][4].setIcon(a); //displays x
            check[1][4] = 1;
        } else {
            gui.boxes[1][4].setIcon(b); //displays o
            check[1][4] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b11() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[2][0].setIcon(a); //displays x
            check[2][0] = 1;
        } else {
            gui.boxes[2][0].setIcon(b); //displays o
            check[2][0] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b12() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[2][1].setIcon(a); //displays x
            check[2][1] = 1;
        } else {
            gui.boxes[2][1].setIcon(b); //displays o
            check[2][1] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b13() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[2][2].setIcon(a); //displays x
            check[2][2] = 1;
        } else {
            gui.boxes[2][2].setIcon(b); //displays o
            check[2][2] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b14() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[2][3].setIcon(a); //displays x
            check[2][3] = 1;
        } else {
            gui.boxes[2][3].setIcon(b); //displays o
            check[2][3] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b15() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[2][4].setIcon(a); //displays x
            check[2][4] = 1;
        } else {
            gui.boxes[2][4].setIcon(b); //displays o
            check[2][4] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b16() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[3][0].setIcon(a); //displays x
            check[3][0] = 1;
        } else {
            gui.boxes[3][0].setIcon(b); //displays o
            check[3][0] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b17() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[3][1].setIcon(a); //displays x
            check[3][1] = 1;
        } else {
            gui.boxes[3][1].setIcon(b); //displays o
            check[3][1] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b18() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[3][2].setIcon(a); //displays x
            check[3][2] = 1;
        } else {
            gui.boxes[3][2].setIcon(b); //displays o
            check[3][2] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b19() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[3][3].setIcon(a); //displays x
            check[3][3] = 1;
        } else {
            gui.boxes[3][3].setIcon(b); //displays o
            check[3][3] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b20() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[3][4].setIcon(a); //displays x
            check[3][4] = 1;
        } else {
            gui.boxes[3][4].setIcon(b); //displays o
            check[3][4] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b21() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[4][0].setIcon(a); //displays x
            check[4][0] = 1;
        } else {
            gui.boxes[4][0].setIcon(b); //displays o
            check[4][0] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b22() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[4][1].setIcon(a); //displays x
            check[4][1] = 1;
        } else {
            gui.boxes[4][1].setIcon(b); //displays o
            check[4][1] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b23() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[4][2].setIcon(a); //displays x
            check[4][2] = 1;
        } else {
            gui.boxes[4][2].setIcon(b); //displays o
            check[4][2] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b24() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[4][3].setIcon(a); //displays x
            check[4][3] = 1;
        } else {
            gui.boxes[4][3].setIcon(b); //displays o
            check[4][3] = 2;
        }   
        winner(); //checks for winner
    }
    
    void b25() {
        clicks = clicks + 1; //adds to the clicks to track them
        if ((clicks%2)==1){
            gui.boxes[4][4].setIcon(a); //displays x
            check[4][4] = 1;
        } else {
            gui.boxes[4][4].setIcon(b); //displays o
            check[4][4] = 2;
        }   
        winner(); //checks for winner
    }

    /**
     * Checks for the winner by checking if there are 4 buttons that have either all X's or all O's in a row
     * Checks for 4 in a row by rows, columns, and diagonally
     * When a player wins, the winning four buttons are changed to gold to highlight them
     * When the game ends, the remaining buttons are disabled so no further moves can be made, 
     * the game status (win or tie) is displayed in a pop-up panel, and the play button is enabled again to reset the game
     * The win, loss, or tie is added to the counters and they are displayed in the text fields 
     * 
     */
    void winner() {
        int winner = 0; //set to default (no winner)
        
        JButton[] winningButtons = new JButton[4]; // Temporary storage for winning buttons
        
        /*Check for the winner by row*/
        for (int i=0; i<=4; i++){
            for (int j = 0; j <= 1; j++){ //checks up to column 1 (checks only 4 columns)
                if(check[i][j] != 0 && check[i][j] == check[i][j+1] && check[i][j] == check[i][j+2] && check[i][j] == check[i][j+3]){ //if there are 4 in a row horizontally
                    winner = check[i][j]; //sets winner to x or o
                    //adds the 4 in a row to the winning buttons array
                    winningButtons[0] = gui.boxes[i][j];
                    winningButtons[1] = gui.boxes[i][j+1];
                    winningButtons[2] = gui.boxes[i][j+2];
                    winningButtons[3] = gui.boxes[i][j+3];
                }
            }
        }
        
        /*Check for the winner by column*/
        for (int i=0; i<=4; i++){
            for (int j =0; j <= 1; j++){ //checks up to row 1 (checks only 4 rows)
                if(check[j][i] != 0 && check[j][i] == check[j+1][i] && check[j][i] == check[j+2][i] && check[j][i] == check[j+3][i]){ //if there are 4 in a row vertically
                    winner = check[j][i]; //sets winner to x or o
                    //adds the 4 in a row to the winning buttons array
                    winningButtons[0] = gui.boxes[j][i];
                    winningButtons[1] = gui.boxes[j+1][i];
                    winningButtons[2] = gui.boxes[j+2][i];
                    winningButtons[3] = gui.boxes[j+3][i];
                }
            }
        }
        
        /*Check for the winner diagonally from left to right*/ 
        for (int i = 0; i <= 1; i++) { // Only row 0 and 1
            for (int j = 0; j <= 1; j++) { // Only column 0 and 1
                if (check[i][j] != 0 && check[i][j] == check[i+1][j+1] && check[i][j] == check[i+2][j+2] && check[i][j] == check[i+3][j+3]){ //if there are 4 in a row diagonally
                    winner = check[i][j]; //sets winner to x or o
                    //adds the 4 in a row to the winning buttons array
                    winningButtons[0] = gui.boxes[i][j];
                    winningButtons[1] = gui.boxes[i+1][j+1];
                    winningButtons[2] = gui.boxes[i+2][j+2];
                    winningButtons[3] = gui.boxes[i+3][j+3];
                }
            }
        }
        /*Check for the winner diagonally from right to left*/
        for (int i = 0; i <= 1; i++) { // Only row 0 and 1
            for (int j = 3; j <= 4; j++) { // Only column 4 and 5
                if (check[i][j] != 0 && check[i][j] == check[i+1][j-1] && check[i][j] == check[i+2][j-2] && check[i][j] == check[i+3][j-3]){ //if there are 4 in a row diagonally
                    winner = check[i][j]; //sets winner to x or o
                    //adds the 4 in a row to the winning buttons array
                    winningButtons[0] = gui.boxes[i][j];
                    winningButtons[1] = gui.boxes[i+1][j-1];
                    winningButtons[2] = gui.boxes[i+2][j-2];
                    winningButtons[3] = gui.boxes[i+3][j-3];
                }
            }
        }
        
        /*Displays the winner*/
        if(winner != 0){
            //Highlights the winning buttons
            for (JButton btn : winningButtons) {
                if (btn != null) {
                btn.setBackground(new Color(212,175,55)); //sets colour to gold
                }
            }
            
            if(winner == 1){ //if x wins
                JOptionPane.showMessageDialog(null, p1Name + " is the winner!"); //displays the winner
                xWins++; //adds to x wins
            }
            else{ //if o wins
               JOptionPane.showMessageDialog(null, p2Name + " is the winner!"); //displays the winner
                oWins++; //adds to o wins
            }
            updateScore(); //updates the score
            lockBoard(); //locks the board so no more moves can be made
        }    
        
        /*Checks for a tie*/
        else if ((clicks==25)) { //if all buttons have been clicked
            JOptionPane.showMessageDialog(null, "The game is a tie!"); //displays the tie
            ties++; //adds to ties
            updateScore(); //updates the score
            lockBoard(); //locks the board so no more moves can be made
        }
    }
    
    /*Displays the updated score*/
    void updateScore(){
        gui.WL.setText("  X Wins = " + xWins + " || " +"O Wins = " + oWins); //displays the wins
        gui.Ties.setText("  Ties = " + ties); //displays the ties
        gui.play.setEnabled(true); //enables the play button when game is over
    }
    
    /*Locks the board so no more moves can be made*/
    public void lockBoard() { 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (check[i][j] == 0) { //if button is not clicked
                    gui.boxes[i][j].setEnabled(false); //disables all the unclicked buttons
                    
                }
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
     
    }
}