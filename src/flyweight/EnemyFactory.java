package flyweight;

import flyweight.impl.Sniper;
import flyweight.impl.Soldier;
import flyweight.impl.Support;


import java.util.HashMap;

/**
 * Created by User on 09.12.2016.
 */
public class EnemyFactory {
    private HashMap<Point2D, Soldier> soldiers = new HashMap<>();
    private HashMap<Point2D, Support> supports = new HashMap<>();
    private HashMap<Point2D, Sniper> snipers = new HashMap<>();

    public HashMap<Point2D, Sniper> getSnipers() {
        return snipers;
    }

    public HashMap<Point2D, Support> getSupports() {
        return supports;
    }

    public HashMap<Point2D, Soldier> getSoldiers() {
        return soldiers;
    }

    public Enemy getEnemy(String enemyClass, int x, int y) {
        Enemy enemy = null;
        switch (enemyClass) {
            case "soldier": {
                Soldier soldier = soldiers.get(new Point2D(x, y));
                if (soldier == null) {
                    soldier = new Soldier(x, y);
                    System.out.println("Creating new soldier\n");
                    soldiers.put(new Point2D(x, y), soldier);
                }
                enemy = soldier;
                break;
            }
            case "support": {
                Support support = supports.get(new Point2D(x, y));
                if (support == null) {
                    support = new Support(x, y);
                    System.out.println("Creating new support\n");
                    supports.put(new Point2D(x, y), support);
                }
                enemy = support;
                break;
            }
            case "sniper": {
                Sniper sniper = snipers.get(new Point2D(x, y));
                if (sniper == null) {
                    sniper = new Sniper(x, y);
                    System.out.println("Creating new sniper\n");
                    snipers.put(new Point2D(x, y), sniper);
                }
                enemy = sniper;
                break;
            }
        }

        return enemy;
    }
}