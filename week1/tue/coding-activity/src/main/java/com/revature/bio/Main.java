package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */

        /*
         * System out the Associate object behaviors and fields
         */
        Associate associate = new Associate("Thomas Guwor", "MBA", "Greece");
        //associate.setName("Thomas");

        System.out.println("Associate Name: " + associate.getName());
        System.out.println("Associate Degree: " + associate.getDegree());
        System.out.println("Associate Place of Interest: " + associate.getPOI() + "\n");

        System.out.println(associate.aboutMe());

        System.out.println(associate.talent());
    }
}
