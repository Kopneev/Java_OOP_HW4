package org.example;

import java.util.Random;

public class SteelSheild extends Shield {


    private int protect;

    public SteelSheild(int pointOfProtect) {
        super(pointOfProtect);
        this.protect = protect;
    }

    @Override
    public String toString() {
        return "SteelSheild{" +
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
