package org.example;

import org.example.Weapons.Bow;
import org.example.Weapons.Sword;

public class Swordman extends Warrior {
    public Swordman(String name, int healthPoint, Sword sword, Shield shield) {
        super(name, healthPoint, sword, shield);
    }

    @Override
    public String toString() {
        return "Swordman, " + super.toString();
    }

    public int protectRange() {
        return ((Shield)getProtect()).getPointOfProtect();
    }
}
