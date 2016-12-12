package flyweight;

/**
 * Created by User on 09.12.2016.
 */
public abstract class Enemy {

    protected int id;
    protected double health;
    protected double armor;
    protected double damage;

    public Enemy(int id) {
        this.id = id;
    }

    public abstract void printEnemy();

    public void dealDamage(double value) {
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
