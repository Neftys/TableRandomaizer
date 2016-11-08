package com.websystique.springmvc.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Ниф on 08.11.2016.
 */
public class Team {

    ArrayList<Player> defaultTeam = new ArrayList<Player>();
    ArrayList<Player> players = new ArrayList<Player>();

    private final int number = count++;
    private static int count = 1;

    public void addDefaultPlayer(Player player) {
        defaultTeam.add(player);
    }

    public void addPlayers() {
        players.addAll(defaultTeam);
    }

    public Player getPlayer() {
        Random rand = new Random();
        int randomNum = rand.nextInt((players.size() - 1) + 1) + 1;
        Player player = players.get(randomNum);
        players.remove(randomNum);

        return player;

    }

    public ArrayList<Player> getDefaultTeam() {
        return defaultTeam;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Team{");
        sb.append("defaultTeam=").append(defaultTeam);
        sb.append(", players=").append(players);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
