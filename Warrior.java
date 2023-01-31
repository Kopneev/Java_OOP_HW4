package org.example;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    private Protectable protect;

    public Warrior(String name, int healthPoint, Weaponable weapon, Protectable protect) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.protect = protect;
    }


    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weaponable getWeapon() {
        return weapon;
    }
    public Protectable getProtect() {
        return protect;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", healthPoint=" + healthPoint +
                ", weapon=" + weapon + ",protect=" +protect+
                '}';
    }
}
