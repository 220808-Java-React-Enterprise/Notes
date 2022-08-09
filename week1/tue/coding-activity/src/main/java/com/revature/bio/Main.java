package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate newAssociate = new Associate("Nicholas Fielder","Aerospace Engineering","Florida");

        /*
         * System out the Associate object behaviors and fields
         */
        System.out.println(newAssociate.aboutMe());

        //Changing Associates Point of interest to a different location

        newAssociate.setPOI("Finland");

        System.out.println(newAssociate.aboutMe());
    }
}
