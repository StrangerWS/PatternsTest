package flyweight.impl;

import flyweight.Enemy;

/**
 * Created by User on 09.12.2016.
 */
public class Soldier extends Enemy {

    public Soldier(int id) {
        super(id);
        health = 100;
        armor = 100;
        damage = 50;
    }

    @Override
    public void printEnemy() {
        System.out.println(String.format("Class: %s\nHealth: %s\nArmor: %s\nDamage: %s\nID: %s\n", Soldier.class.getSimpleName(), health, armor, damage, id));
    }
}
