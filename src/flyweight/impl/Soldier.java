package flyweight.impl;

import flyweight.Enemy;

/**
 * Created by User on 09.12.2016.
 */
public class Soldier extends Enemy {

    public Soldier(int x, int y) {
        super(x, y);
        health = 100;
        armor = 100;
        damage = 50;
    }

    @Override
    public void printEnemy() {
        System.out.println(String.format("Class: %s\nHealth: %s\nArmor: %s\nDamage: %s\nx: %s\ny: %s\n", Soldier.class.getSimpleName(), health, armor, damage, x, y));
    }
}
