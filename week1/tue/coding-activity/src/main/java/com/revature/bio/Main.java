package com.revature.bio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */

        /*
         * System out the Associate object behaviors and fields
         */

        Associate associate = new Associate("Thomas Guwor", "MBA", "Greece", new String[]{"coding", "writing", "reading"});

        /*
            //getter and setter methods for hobbies work perfect
            Associate associate = new Associate();
            associate.setHobbies(new String[]{"coding", "writing", "reading"});
            System.out.println(Arrays.toString(associate.getHobbies()));
         */


        System.out.println("Associate Name: " + associate.getName());
        System.out.println("Associate Degree: " + associate.getDegree());
        System.out.println("Associate Place of Interest: " + associate.getPOI() + "\n");

        System.out.println(associate.aboutMe() + "\n");

        System.out.println(associate.talent() + "\n");

        //call for loop to get associate hobbies
        System.out.println(associate.myHobbies());

    }
}
