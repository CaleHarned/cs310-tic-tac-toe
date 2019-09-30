package edu.jsu.mcis;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import edu.jsu.mcis.TicTacToeModel.Result;

public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;
    boolean xTurn=true;

    
    /* CONSTRUCTOR */

    public TicTacToeController(int width) {
        
        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
        view = new TicTacToeView(this, width);
    }

    public String getMarkAsString(int row, int col) {       
        return (model.getMark(row, col).toString());       
    }
   
    public TicTacToeView getView() {       
        return view;       
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton button = (JButton)event.getSource();
        int row = Character.getNumericValue(button.getName().charAt(6));
        int col = Character.getNumericValue(button.getName().charAt(7));

        model.makeMark(row, col);
        view.updateSquares();

        if(model.getResult()!=Result.NONE)
        {
            view.disableSquares();                        
        }

        view.showResult(model.getResult().toString());

    }    }


