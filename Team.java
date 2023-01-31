package org.example;

import java.util.*;

public class Team<E extends Warrior> implements Iterable {
    private List<E> team = new ArrayList<>();

    public Team<E> addWarriorToTeam(E person) {
        team.add(person);
        return this;
    }


    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if(((Archer)item).shotRange() > maxRange) maxRange = ((Archer)item).shotRange();
            }
        }
        return maxRange;
    }

    public int maxTeamProtect() {
        int maxProtect = 0;
        for (E item : team) {
            if (item instanceof Swordman) {
                if(((Swordman)item).protectRange() > maxProtect) maxProtect = ((Swordman)item).protectRange();
            }
        }
        return maxProtect;
    }
}
