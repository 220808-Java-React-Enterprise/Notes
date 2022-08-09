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

        Associate a = new Associate("John", "BS", "Las Vegas");

        System.out.println("Name: " + a.getName());
        System.out.println("Degree: " + a.getDegree());
        System.out.println("POI: " + a.getPoi());
    }
}
