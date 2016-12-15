import flyweight.Enemy;
import flyweight.EnemyFactory;
import flyweight.Point2D;

/**
 * Created by DobryninAM on 15.12.2016.
 */
public class Spell {

    public void fireballStrike(int x, int y, EnemyFactory enemyFactory) {
        Enemy enemy;
        double damage = 20;
        for (int i = x - 5; i <= x + 5; i++) {
            for (int j = y - 5; j <= y + 5; j++) {
                if ((enemy = enemyFactory.getSnipers().get(new Point2D(i, j))) != null) {
                    enemy.takeDamage(damage);
                }
                if ((enemy = enemyFactory.getSoldiers().get(new Point2D(i, j))) != null) {
                    enemy.takeDamage(damage);
                }
                if ((enemy = enemyFactory.getSupports().get(new Point2D(i, j))) != null) {
                    enemy.takeDamage(damage);
                }
            }
            damage -= 3;
        }
    }
}
