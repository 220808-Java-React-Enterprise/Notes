package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate leighton = new Associate("Leighton", 27, "Cleveland", "Sushi", "Bachelor's", "Neuroscience", "Cooking", "Video Games");
        /*
         * System out the Associate object behaviors and fields
         */

        leighton.aboutMe();
        leighton.myDegree();
        leighton.myHobbies();

        System.out.println(leighton);


    }
}
