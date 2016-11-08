package com.websystique.springmvc.Main;

import com.websystique.springmvc.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by tu_gevelav on 08.11.2016.
 */
public class Main {

    public static int randInt( int max) {

        Random rand =new Random();
        int randomNum = rand.nextInt((max - 1) + 1) + 1;
        return randomNum;
    }


    public static void main(String[] args) {


        int playerInTeam = 4;
        int tables = 10;
        int team = 1;
        int gameCount=10;
        ArrayList<Player> playersNotPuted = new ArrayList<Player>();


        for (int i = 0; i < 100; i++) {
            Player player = new Player();
            player.setTeam(team);
            playerInTeam--;
            playersNotPuted.add(player);
            if (playerInTeam == 0) {
                team++;
                playerInTeam = 4;
            }
        }

        System.out.println("Player count is " + playersNotPuted.size());
        System.out.println("Player in one team "+playerInTeam);
        System.out.println("Total games is"+gameCount);



        HashMap<Integer, ArrayList<Player>> hashMap = new HashMap<Integer, ArrayList<Player>>();

        for (int i = 0; i < tables; i++) {
            ArrayList<Player> playTable = new ArrayList<Player>();
            hashMap.put(i + 1, playTable);
        }
        System.out.println("Table count is "+hashMap.size());









    }
}
