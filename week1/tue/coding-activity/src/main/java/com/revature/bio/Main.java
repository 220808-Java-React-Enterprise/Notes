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
        Associate chris = new Associate("Chris", "Computer Science", "a friendly post-scarcity society", "Mewtwo");
        System.out.println(chris.tellAboutSelf("I can hold my breath for a long time."));

        System.out.println(chris.getName() + "'s talent: " + chris.doTalent(40, 2));
        Associate alex = new Associate("Alex", "Computer Science", "Japan");
        System.out.println(alex.tellAboutSelf());

        chris.chitChat(alex);
    }
}
