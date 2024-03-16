package view.statePattern;

import java.awt.Color;
import java.awt.Graphics2D;

import controller.App;
import view.AppWindow;

public class GameStateinit implements GameState {

    @Override
    public void goNext(AppWindow context) {
       context.setGameState(new GameStatePlaying());
    }

    @Override
    public void updateWindow() {
        for (var b : App.win.markingButtons) {
            b.setEnabled(false);
        }
        App.win.newGameButton.setEnabled(true);
        App.win.vsComputerButton.setEnabled(true);
        App.win.vsHumanButton.setEnabled(true);
        App.win.vsSmartComputerButton.setEnabled(true);

        App.win.canvas.repaint();
    }

    @Override
    public void updateCanvas(Graphics2D g2) {
        g2.setColor(Color.PINK);
        g2.drawString("Press New Game to start!", 50, 50);
    }
    
}
