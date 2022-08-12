package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate associate1 = new Associate("Randy", "Computer Engineer", "Cuba");
        Associate associate2 = new Associate("Jose");

        /*
         * System out the Associate object behaviors and fields
         */
        System.out.println(associate1);
        associate1.AboutMe();
        int sum = associate1.simpleMath(1,2);
        System.out.println(sum);


        associate2.setName("John");
        associate2.talent();
        System.out.println(associate2);
    }
}

