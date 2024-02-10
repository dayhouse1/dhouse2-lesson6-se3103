package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import model.Marking;

public class BoardButton extends JButton{
    
    private int pos; // index position in game board

    public BoardButton(int pos) {
        this.pos = pos;
        setFont(new Font("Comic Sans", Font.BOLD, 84));
        setForeground(Color.MAGENTA);
        setMark(Marking.U);
    }

    public int getPos(){
        return pos;
    }

    public void setMark(Marking mark){
        String label = mark.name();
        if(mark == Marking.U){
            label = ".";
            setText(label);
        }
    }
}
