package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate employee = new Associate("Robert", "Computer Science","Europe");
        Associate newEmployee = new Associate("Jeff", "Graphics Design", "Japan");

        /*
         * System out the Associate object behaviors and fields
         */

        newEmployee.setHobbies("Drawing");
        newEmployee.setHobbies("Anime");
        newEmployee.setHobbies("D&D");

        System.out.println(newEmployee.toString());

        newEmployee.setPOI("Asia");

        System.out.println(newEmployee.toString());


        System.out.println(employee.toString());
        employee.setHobbies("Disc Golfing");
        System.out.println(employee.getHobby(1));
        System.out.println(employee.getHobby(2));
        System.out.println(employee.toString());
        employee.setHobbies("Shooting Billiards");
        employee.setHobbies("Motorcycling");


        System.out.println(employee.toString());
        System.out.println(employee.getName());
    }
}