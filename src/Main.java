import flyweight.Enemy;
import flyweight.EnemyFactory;
import flyweight.impl.Soldier;

/**
 * Created by User on 09.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        EnemyFactory factory = new EnemyFactory();
        String[] enemySquad = {"soldier", "soldier", "support", "soldier", "sniper"};

        for (String value: enemySquad){
            Enemy enemy = factory.getEnemy(value);
            enemy.printEnemy();
        }
    }
}
