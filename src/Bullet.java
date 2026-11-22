import java.awt.Graphics2D;

public class Bullet extends Entity {
    private double lifetime;

    public Bullet(double x, double y, double angle) {
        // TODO: set position, velocity from angle, lifetime
    }

    @Override
    public void update(double dt) {
        // TODO: move, tick lifetime, die when expired or off screen
    }

    @Override
    public void draw(Graphics2D g) {
        // TODO: draw bullet
    }
}
