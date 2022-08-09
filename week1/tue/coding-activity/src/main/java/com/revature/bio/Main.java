package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate associate1 = new Associate("Jahzah", "Bachelor's", "France");

        /*
         * System out the Associate object behaviors and fields
         */
        associate1.aboutMe();
        associate1.talent();
    }
}
