package com.sckeedoo.certification;
import java.util.Random;
public class Problem5 {

    static class Player {
        String name;
        int age;
        int points;
    }


    public static void main(String[] args) {
        Player[] players = new Player[5];

        // Adding Diana
        players[0] = new Player();
        players[0].name = "Diana";
        players[0].age = 17;
        players[0].points = 200;

        // Adding Steven
        players[1] = new Player();
        players[1].name = "Steven";
        players[1].age = 14;
        players[1].points = 150;

        // Adding John
        players[2] = new Player();
        players[2].name = "John";
        players[2].age = 16;
        players[2].points = 250;

        // Adding Joe
        players[3] = new Player();
        players[3].name = "Joe";
        players[3].age = 15;
        players[3].points = 180;

        // Adding Anna
        players[4] = new Player();
        players[4].name = "Anna";
        players[4].age = 19;
        players[4].points = 270;

        /**
         * Increment the player's score by a random number between 10 and 20
        for(Player player: players) {}
        */
            for (int i=0; i< players.length; i++) {
                Random Val = new Random();
                int value = Val.nextInt(11) + 10;
                players[i].points = players[i].points + value;
                System.out.println(players[i].name + " has " + players[i].points + " points");
            }

    }
}
