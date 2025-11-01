/*
Programmer: Siddhi Patel
Date: April 25, 2025
Program Name: Tic Tac Toe Game
Program Description: This file creates the display for the game board
* Displays instructions for the game
* Displays a 5x5 grid of buttons that are alternately clicked to show X's and Y's for the game
* Sets background and button images and colours
 */
package tictac;

/**
 *
 * @author Siddhi 
 */

import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {
    TicTacEvent tictac = new TicTacEvent(this); //joins the two programs to work with each other
     JPanel row1 = new JPanel(); //creates the outline box
     JButton[ ] [ ] boxes = new JButton [5][5]; //creates 25 buttons in a 2D array that is 5x5
     JButton play = new JButton ("Play"); //creates play and reset button
     JTextField Player1 = new JTextField(); //creates text field for player 1 name
     JTextField WL = new JTextField(); //creates text field for displaying wins and loses
     JTextField Ties = new JTextField(); //creates text field for displaying ties
     JTextField Player2 = new JTextField(); //creates text field for player 2 name
     JOptionPane win = new JOptionPane("Winner"); //displays a popup window for announcing the winner
     ImageIcon back = new ImageIcon("cardback.jpg "); //back image for each button
     
    //Displays instructions for playing the game
     JLabel instructions1 = new JLabel("Instructions: Enter both player's names and click 'Play' to begin. Players take turns placing their X and O tokens. First to get 4 in a row wins!");
     JLabel instructions2 = new JLabel("Click the 'Play' button again to start a new game with an ongoing track of score.");
     
     /*Sets the frame title, size, layout, and close operation and adds all components to layout*/
     public TicTac() {
        super ("⚽ Sports Tic Tac Toe 🏀"); //creates the outer frame with the title 
        setSize (900,850); //sets the size of the outer frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the program to quit running when the window is closed
        FlowLayout layout = new FlowLayout(); //arranges components from left to right, centering components horizontally with a five pixel gap between them
        setLayout(layout);
        int name = 0; // Counter for naming buttons
        String newname;
        
        // Sets default text for player input fields
        Player1.setText("Player 1:");  
        Player2.setText("Player 2:");

        // Sets up the grid layout (6 rows x 6 columns with equal spacing)
        GridLayout layout1 = new GridLayout(6, 6, 10, 10); 
        row1.setLayout(layout1);
        row1.setBackground(new Color(0,100,0)); //sets background colour to dark green
        
        /* Creates and initializes 25 buttons for the 5x5 grid */
        for (int x=0; x<=4; x++){
            for (int y=0; y<=4; y++){
                name = name + 1; //increments the name for each button
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname); // creates button with label
                boxes[x][y].setIcon(back); //sets each button image to back
                boxes[x][y].setBackground(new Color (128,166,206)); //sets button colours to blue
                row1.add(boxes[x][y]); //adds buttons to the grid
            } 
        }
        
        /* Adds player text fields, score fields, and play button to the grid */
        row1.add(Player1);
        row1.add(WL);
        row1.add(play);
        row1.add(Ties);
        row1.add(Player2);
        
        /* Adds the complete grid and controls to the main window */
        add (row1);
        
        /* Adds the instructions under the game board */
        add(instructions1);
        add(instructions2); 
        
        // Adds event listener to the play button and all 25 game buttons so that the game can work
        play.addActionListener(tictac); 
        for (int x=0; x<=4; x++){
            for (int y=0; y<=4; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }

        setVisible(true); //makes the window visible
}
    public static void main(String[] arguments){
                    TicTac frame = new TicTac(); //displays the game frame
    }
}
