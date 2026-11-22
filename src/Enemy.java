import java.awt.Graphics2D;

public class Enemy extends Entity {
    private int health;
    private Player target;

    public Enemy(double x, double y, Player target) {
        // TODO: set position, radius, health, target
    }

    @Override
    public void update(double dt) {
        // TODO: move toward target
    }

    @Override
    public void draw(Graphics2D g) {
        // TODO: draw enemy shape
    }

    public void takeDamage(int amount) {
        // TODO: reduce health, mark dead at 0
    }
}
