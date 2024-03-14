package view.statePattern;

import view.AppWindow;
import java.awt.Graphics2D;

public interface GameState {
    void goNext(AppWindow context);
    void updateWindow();
    void updateCanvas(Graphics2D g2);

}
