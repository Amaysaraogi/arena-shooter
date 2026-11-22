import java.awt.Graphics2D;

/** Base class for everything that lives in the arena. */
public abstract class Entity {
    protected double x;
    protected double y;
    protected double vx;
    protected double vy;
    protected double radius;
    protected boolean alive = true;

    /** Advance this entity by dt seconds. */
    public abstract void update(double dt);

    /** Draw this entity. */
    public abstract void draw(Graphics2D g);
}
