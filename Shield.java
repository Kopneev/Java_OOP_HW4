package org.example;

public abstract class Shield implements Protectable {

    public int pointOfProtect;


    public Shield(int pointOfProtect) {
        this.pointOfProtect = pointOfProtect;
    }

    public int getPointOfProtect() {
        return pointOfProtect;
    }
}
