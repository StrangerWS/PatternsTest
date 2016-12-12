package flyweight;

import flyweight.impl.Sniper;
import flyweight.impl.Soldier;
import flyweight.impl.Support;

import java.util.HashMap;

/**
 * Created by User on 09.12.2016.
 */
public class EnemyFactory {
    private HashMap<Integer, Soldier> soldiers = new HashMap<>();
    private HashMap<Integer, Support> supports = new HashMap<>();
    private HashMap<Integer, Sniper> snipers = new HashMap<>();

    public Enemy getEnemy(String enemyClass, int id) {
        Enemy enemy = null;
        switch (enemyClass) {
            case "soldier": {
                Soldier soldier = soldiers.get(id);
                if (soldier == null) {
                    soldier = new Soldier(id);
                    System.out.println("Creating new soldier\n");
                    soldiers.put(id, soldier);
                }
                enemy = soldier;
                break;
            }
            case "support": {
                Support support = supports.get(id);
                if (support == null) {
                    support = new Support(id);
                    System.out.println("Creating new support\n");
                    supports.put(id, support);
                }
                enemy = support;
                break;
            }
            case "sniper": {
                Sniper sniper = snipers.get(id);
                if (sniper == null) {
                    sniper = new Sniper(id);
                    System.out.println("Creating new sniper\n");
                    snipers.put(id, sniper);
                }
                enemy = sniper;
                break;
            }
        }

        return enemy;
    }
}