package view.statePattern;

import java.awt.Color;
import java.awt.Graphics2D;

import controller.App;
import model.Marking;
import view.AppWindow;

public class GameStateDone implements GameState{

    @Override
    public void goNext(AppWindow context) {
        context.setGameState(new GameStatePlaying());
    }

    @Override
    public void updateWindow() {
        for (var b : App.win.markingButtons) {
            b.setEnabled(false);
        }
        for (int i = 0; i < App.game.getBoard().length; i++) {
            App.win.markingButtons[i].setMark(App.game.getBoard()[i]);
            App.win.markingButtons[i].setEnabled(false);
        }
        App.win.newGameButton.setEnabled(true);
        App.win.vsComputerButton.setEnabled(true);
        App.win.vsHumanButton.setEnabled(true);
        App.win.vsSmartComputerButton.setEnabled(true);

        App.win.canvas.repaint();
    }

    @Override
    public void updateCanvas(Graphics2D g2) {
         g2.setColor(Color.RED);

                if (App.game.getWinner() == Marking.U) {
                    g2.drawString("Draw! Game Over", 50, 50);
                } else {
                    g2.drawString(App.game.getWinner() + " Wins! Game Over", 50, 50);
                }
    }
    
}
