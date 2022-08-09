package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate associate = new Associate("Bobby", "Information Systems", "Australia");

        System.out.println(associate);
        System.out.println(associate.getMyHobbies());
        /*
         * System out the Associate object behaviors and fields
         */
    }

}
