package view;

import javax.swing.JPanel;

import controller.App;
import model.GameState;
import model.Marking;
import model.TicTacToeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class AppCanvas extends JPanel {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 100;

    public AppCanvas() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Comic Sans", Font.BOLD, 16));

        TicTacToeGame game = App.game;
        GameState gameState = game.getState();

        switch (gameState) {
            case INIT:
                g2.setColor(Color.PINK);
                g2.drawString("Press New Game to start!", 50, 50);
                break;
            case PLAYING:
                g2.setColor(Color.red);
                g2.drawString(game.getTurn() + " Turn!", 50, 50);
                break;
            case OVER:
                g2.setColor(Color.RED);

                if (game.getWinner() == Marking.U) {
                    g2.drawString("Draw! Game Over", 50, 50);
                } else {
                    g2.drawString(game.getWinner() + " Wins! Game Over", 50, 50);
                }
                break;
        }
    }
}
