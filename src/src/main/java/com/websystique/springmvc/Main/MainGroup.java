package com.websystique.springmvc.Main;

import com.websystique.springmvc.model.Player;
import com.websystique.springmvc.model.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by tu_gevelav on 08.11.2016.
 */
public class MainGroup {

    public static int randInt(int max) {

        Random rand = new Random();
        int randomNum = rand.nextInt((max - 1) + 1) + 1;
        return randomNum;
    }


    public static void main(String[] args) {

        int groupsCount = 25;
        int tableCount = 10;
        int playerInTeam = 4;
        int gameCount = 10;
        ArrayList<Team> teamArrayList = new ArrayList<Team>();
        ArrayList<Team> usedTeamArrayList = new ArrayList<Team>();
        Player player;
        Team team;
        ArrayList<ArrayList<Player>> roundLists = new ArrayList<ArrayList<Player>>();
        ArrayList<Player> playersInTable = new ArrayList<Player>();


        //Create Group of Team
        for (int i = 1; i <= groupsCount; i++) {
            team = new Team();

            for (int l = 0; l < playerInTeam; l++) {

                player = new Player();
                player.setTeam(i);
                team.addDefaultPlayer(player);
            }
            teamArrayList.add(team);
        }


        //Start

        usedTeamArrayList.addAll(teamArrayList);

        for (int i = 0; i < tableCount; i++) {

            for (int l = 0; l < 10; l++) {

                int randomTeam = randInt(usedTeamArrayList.size());
                team = usedTeamArrayList.get(randomTeam);
                player = team.getPlayer();
                if (team.isEmpty()) {
                    usedTeamArrayList.remove(team);
                }


            }
        }

    }

}
