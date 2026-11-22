import java.awt.Graphics;
import javax.swing.JPanel;

/** Swing panel that runs the game loop and renders the Game. */
public class GamePanel extends JPanel implements Runnable {
    private Thread gameThread;
    private boolean running;
    private final InputHandler input = new InputHandler();
    private final Game game = new Game(input);

    public GamePanel() {
        // TODO: set preferred size, focusable, register input listeners
    }

    public void start() {
        // TODO: create and start gameThread
    }

    @Override
    public void run() {
        // TODO: fixed-timestep loop calling game.update(dt) and repaint()
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO: call super, cast to Graphics2D, enable antialiasing, game.draw(g2)
    }
}
