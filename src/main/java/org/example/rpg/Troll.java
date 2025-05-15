package org.example.rpg;

import java.util.Random;

public class Troll extends Monster implements Bleedable,Poisonable{
    private double bleedChance= 0.3;
    private double poisonChance= 0.2;
    private Random random = new Random();

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }
    @Override
    public double bleed() {
        if (random.nextDouble() < bleedChance) {
            System.out.println(getName() + " kanatıyor!");
            return getDamage() * 0.25;
        }
        return 0.0;
    }

    @Override
    public double poison() {
        if (random.nextDouble() < poisonChance) {
            System.out.println(getName() + " zehirliyor! "+getDamage() * 0.3);
            return getDamage() * 0.3;
        }
        return 0.0;
    }

}
