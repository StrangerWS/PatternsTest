package flyweight;

/**
 * Created by User on 09.12.2016.
 */
public abstract class Enemy {

    protected int x;
    protected int y;
    protected double health;
    protected double armor;
    protected double damage;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void printEnemy();

    public void takeDamage(double value) {
        if (health < value && armor < value / 1.67) {
            health = 0;
            armor = 0;
        } else if (armor < value / 1.67) {
            health -= value;
            armor = 0;
        } else {
            health -= value / 1.67;
            armor -= value / 1.67;
        }
    }
}
