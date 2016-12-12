import flyweight.Enemy;
import flyweight.EnemyFactory;
import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Created by DobryninAM on 12.12.2016.
 */

public class Main {
    public static void main(String[] args) {
        EnemyFactory factory = new EnemyFactory();
        ArrayList<Pair<String, Integer>> enemySquad = new ArrayList<>();

        enemySquad.add(new Pair<String, Integer>("soldier", 1));
        enemySquad.add(new Pair<String, Integer>("soldier", 2));
        enemySquad.add(new Pair<String, Integer>("support", 1));
        enemySquad.add(new Pair<String, Integer>("support", 2));
        enemySquad.add(new Pair<String, Integer>("soldier", 1));
        enemySquad.add(new Pair<String, Integer>("sniper", 1));

        for (Pair value : enemySquad) {
            Enemy enemy = factory.getEnemy((String) value.getKey(), (int) value.getValue());
            enemy.printEnemy();
        }

        factory.getEnemy(enemySquad.get(4).getKey(), enemySquad.get(4).getValue()).printEnemy();
        factory.getEnemy(enemySquad.get(4).getKey(), enemySquad.get(4).getValue()).dealDamage(50);
        factory.getEnemy(enemySquad.get(4).getKey(), enemySquad.get(4).getValue()).printEnemy();
        factory.getEnemy(enemySquad.get(1).getKey(), enemySquad.get(1).getValue()).printEnemy();
        factory.getEnemy(enemySquad.get(0).getKey(), enemySquad.get(0).getValue()).printEnemy();

    }
}
