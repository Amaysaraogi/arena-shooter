import java.awt.Graphics2D;

public class Player extends Entity {
    private int health;
    private double shootCooldownTimer;
    private double aimAngle;

    public Player(double x, double y) {
        // TODO: set position, radius, health
    }

    @Override
    public void update(double dt) {
        // TODO: apply movement from input, clamp to arena, tick cooldown
    }

    @Override
    public void draw(Graphics2D g) {
        // TODO: draw player shape rotated toward aimAngle
    }

    public void shoot(Game game) {
        // TODO: spawn a Bullet into game if cooldown allows
    }

    public void takeDamage(int amount) {
        // TODO: reduce health, mark dead at 0
    }
}
