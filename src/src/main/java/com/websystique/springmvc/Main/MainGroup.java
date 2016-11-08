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

        int groupsCount =25;
        int tableCount=10;
        int playerInTeam=4;
        ArrayList<Team> teamArrayList =new ArrayList<Team>();
        Player player;
        Team team;


        for (int i=1;i<=groupsCount;i++){
            team=new Team();

            for (int l=0;l<playerInTeam;l++){

                player=new Player();
                player.setTeam(i);
                team.addDefaultPlayer(player);
            }
            teamArrayList.add(team);

        }


        System.out.println(teamArrayList);




    }

}
