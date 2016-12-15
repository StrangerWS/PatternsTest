import flyweight.Enemy;
import flyweight.EnemyFactory;
import flyweight.Point2D;
import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Created by DobryninAM on 12.12.2016.
 */

public class Main {
    public static void main(String[] args) {
        EnemyFactory factory = new EnemyFactory();
        ArrayList<Pair<String, Point2D>> enemySquad = new ArrayList<>();

        enemySquad.add(new Pair<String, Point2D>("soldier", new Point2D(1, 2)));
        enemySquad.add(new Pair<String, Point2D>("soldier", new Point2D(2, 3)));
        enemySquad.add(new Pair<String, Point2D>("support", new Point2D(-3, 3)));
        enemySquad.add(new Pair<String, Point2D>("support", new Point2D(1, 3)));
        enemySquad.add(new Pair<String, Point2D>("soldier", new Point2D(1, 2)));
        enemySquad.add(new Pair<String, Point2D>("sniper", new Point2D(-3, 4)));

        for (Pair<String, Point2D> value : enemySquad) {
            Enemy enemy = factory.getEnemy(value.getKey(), value.getValue().getX(), value.getValue().getY());
            enemy.printEnemy();
        }

        new Spell().fireballStrike(1, 1, factory);
        System.out.println("Fireball!!!\n");

        for (Pair<String, Point2D> value : enemySquad) {
            Enemy enemy = factory.getEnemy(value.getKey(), value.getValue().getX(), value.getValue().getY());
            enemy.printEnemy();
        }



    }
}
