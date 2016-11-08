package com.websystique.springmvc.model;


import java.util.ArrayList;

public class Player {
    private final int number=count++;
    private static int count=1;

    private int team;




    public int getNumber() {
        return number;
    }



    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("number=").append(number);
        sb.append(", team=").append(team);
        sb.append('}');
        return sb.toString();
    }
}
