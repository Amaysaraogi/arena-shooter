import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/** Collects keyboard and mouse state so the game can poll it each frame. */
public class InputHandler extends MouseAdapter implements KeyListener {
    public boolean up;
    public boolean down;
    public boolean left;
    public boolean right;
    public boolean shooting;
    public int mouseX;
    public int mouseY;

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO: set movement flags (WASD), pause key
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO: clear movement flags
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // not needed
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO: start shooting
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO: stop shooting
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO: track mouse position
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO: track mouse position while button held
    }
}
