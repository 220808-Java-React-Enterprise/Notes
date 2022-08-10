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

        Associate mahmoud = new Associate();
        mahmoud.setName("Mahmoud Osman");
        mahmoud.setDegree("BS Degree");
        mahmoud.setPOI("Mt Place of Interest is: Turkey");
        System.out.println(mahmoud);


// System.out.println(  mahmoud.toString());
        System.out.println();
        mahmoud.aboutMe();
        mahmoud.talent();
        System.out.println();
        mahmoud.education();

    }
}
