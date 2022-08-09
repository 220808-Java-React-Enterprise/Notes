package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate leighton = new Associate();
        /*
         * System out the Associate object behaviors and fields
         */
        leighton.setName("Leighton");
        leighton.setAge(27);
        leighton.setFavoriteFood("Pizza");
        leighton.setHometown("Cleveland");
        leighton.setDegree("Neuroscience");
        leighton.setHobbyOne("Video Games");
        leighton.setHobbyTwo("Cooking");

        System.out.println(leighton);
    }
}
