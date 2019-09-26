package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean xTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
        // INSERT YOUR CODE HERE

        if (xTurn==true){
            System.out.println("It is X's turn. To place an X on the board, Please enter a row number followed by a space then a column number.");
        }

        else if (xTurn==false){
            System.out.println("It is 0's turn. To place an X on the board, Please enter a row number followed by a space then a column number.");
        }
            String input=keyboard.nextLine();  
            String[] splitinput=input.split(" ");
            int row=Integer.parseInt(splitinput[0]);
            int col=Integer.parseInt(splitinput[1]);
            TicTacToeMove nextMove=new TicTacToeMove(row, col);
            return nextMove;

        
    }

    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
