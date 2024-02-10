package controller;

import javax.swing.JFrame;

import model.TicTacToeGame;
import view.AppWindow;

public class App {
    

    public static AppWindow win = new AppWindow();
    public static TicTacToeGame game = new TicTacToeGame();

    public static void main(String[] args){
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.init();
        win.setLocation(800, 350);

        win.pack();
        win.setVisible(true);
    }

}
