import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/** Owns the game world and the state machine. No Swing window code lives here. */
public class Game {
    private GameState state = GameState.TITLE;
    private Player player;
    private final List<Enemy> enemies = new ArrayList<>();
    private final List<Bullet> bullets = new ArrayList<>();
    private final InputHandler input;
    private int score;
    private int wave;
    private double spawnTimer;

    public Game(InputHandler input) {
        this.input = input;
    }

    public void startNewGame() {
        // TODO: reset player, lists, score, wave; set state to PLAYING
    }

    public void update(double dt) {
        // TODO: dispatch on state; when PLAYING, update entities, spawn, collide, cleanup
    }

    public void draw(Graphics2D g) {
        // TODO: dispatch on state; draw world, HUD, or menu screens
    }

    public void addBullet(Bullet bullet) {
        // TODO: add to bullets list
    }

    private void spawnEnemies(double dt) {
        // TODO: spawn enemies at arena edges based on timer and wave
    }

    private void checkCollisions() {
        // TODO: bullet vs enemy, enemy vs player (circle-circle)
    }

    private void removeDeadEntities() {
        // TODO: remove entities where alive == false
    }

    private void drawHud(Graphics2D g) {
        // TODO: health, score, wave
    }
}
