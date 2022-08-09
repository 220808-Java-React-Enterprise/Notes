package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate daniel = new Associate();

        /*
         * System out the Associate object behaviors and fields
         */
        System.out.println(daniel);
        System.out.println(daniel.myTalent(true));
        /*
        daniel.addFavoriteGames("Elden Ring");
        daniel.addFavoriteGames("Valorant");
        daniel.addFavoriteGames("Guild Wars 2");
        daniel.addFavoriteGames("Multiversus");
        */
        daniel.favoriteGames();
    }
}
