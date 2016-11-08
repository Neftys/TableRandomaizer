package com.websystique.springmvc.model;


import java.util.ArrayList;

public class Player {
    private final int number=count;
    private int team;
    private static int count=1;

    public Player() {
        count++;
    }

    private ArrayList<Player> playerArrayList = new ArrayList<Player>();

    public int getNumber() {
        return number;
    }



    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public void addPlayer(Player player) {
        playerArrayList.add(player);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("number=").append(number);
        sb.append(", team=").append(team);
        sb.append(", playerArrayList=").append(playerArrayList);
        sb.append('}');
        return sb.toString();
    }
}
