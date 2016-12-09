package flyweight;

import flyweight.impl.Sniper;
import flyweight.impl.Soldier;
import flyweight.impl.Support;

import java.util.HashMap;

/**
 * Created by User on 09.12.2016.
 */
public class EnemyFactory {
    private HashMap<String, Enemy> enemies = new HashMap<>();

    public Enemy getEnemy(String enemyClass) {
        Enemy enemy = enemies.get(enemyClass);
        if (enemy == null) {
            switch (enemyClass) {
                case "soldier": {
                    enemy = new Soldier();
                    break;
                }
                case "support": {
                    enemy = new Support();
                    break;
                }
                case "sniper": {
                    enemy = new Sniper();
                    break;
                }
            }
            enemies.put(enemyClass, enemy);
        }
        return enemy;
    }
}
