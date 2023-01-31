package org.example;

import java.util.Random;

public class SheildWood extends Shield {

    private int protect;

    public SheildWood(int pointOfProtect) {
        super(pointOfProtect);
        this.protect = protect;
    }

    @Override
    public String toString() {
        return "SheildWood{" +
                "pointOfProtect=" + pointOfProtect +
                '}';
    }

    public int getProtect() {
        return protect;
    }

    @Override
    public int protect() {
        return new Random().nextInt(0, pointOfProtect);
    }
}
