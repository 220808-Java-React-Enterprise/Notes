package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate employee = new Associate("Robert", "Computer Science","Europe");

        /*
         * System out the Associate object behaviors and fields
         */

        employee.setHobbies("Disc Golfing");
        System.out.println(employee.getHobby(1));
        System.out.println(employee.getHobby(2));
        employee.setHobbies("Shooting Billiards");
        employee.setHobbies("Motorcycling");


        System.out.println(employee.aboutMe());
        System.out.println(employee.getName());
    }
}