package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
        // INSERT YOUR CODE HERE

        if (isXTurn==true){
            System.out.println("It is X's turn. To place an X on the board, Please enter a row number followed by a space then a column number.");
            String input=keyboard.nextLine();  
            String[] splitinput=input.split(" ");
            int row=parseInt(splitinput[0]);
            int col=parseInt(splitinput[1]);
            TicTacToeMove nextMove=new TicTacToeMove(row, col);
            return nextMove;

        }
        if (isXturn==false){
            System.out.println("It is O's turn. To place an 0 on the board, Please enter a row number followed by a space then a column number.");
            String input=keyboard.nextLine();  
            String[] splitinput=input.split(" ");
            int row=parseInt(splitinput[0]);
            int col=parseInt(splitinput[1]);
            TicTacToeMove nextMove=new TicTacToeMove(row, col);
            return nextMove;
        }
        

        return null; // remove this line later!

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
