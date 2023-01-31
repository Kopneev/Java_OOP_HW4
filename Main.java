package org.example;

import org.example.Shield;
import org.example.Weapons.*;


public class Main {
    public static void main(String[] args) {
        Team<Swordman>team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Jupiter",150,new Sword(15), new SteelSheild(25)))
                        .addWarriorToTeam(new Swordman("Mars", 175, new Sword(25), new SheildWood(10)));
        for (Object swordman: team1) {
            System.out.println(swordman);
        }

        Team<Archer>team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Sun", 100, new Bow(100, 25), new SheildWood(20)))
                .addWarriorToTeam(new Archer("Moon", 125, new Bow(125,50), new SteelSheild(35)));
        for (Object archer: team2) {
            System.out.println(archer);
        }
        System.out.println("team1 maxTeamRange \n"+team1.maxTeamRange());
        System.out.println("team2 maxTeamRange \n"+team2.maxTeamRange());

        System.out.println("team1 maxTeamProtect \n"+team1.maxTeamProtect());
        System.out.println("team1 maxTeamProtect \n"+team2.maxTeamProtect());
    }
}