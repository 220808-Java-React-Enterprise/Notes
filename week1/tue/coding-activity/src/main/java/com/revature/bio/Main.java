package com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate as = new Associate();
        as.setName("Nathan Gilbert");
        as.setDegree("Computer Science");
        as.setPoi("Florida");
        as.setTalents(new String[]{"Programming", "Logic Design", "Language Arts"});
        as.setWeaknesses(new String[]{"Writing", "Public Speaking"});

        /*
         * System out the Associate object behaviors and fields
         */
        System.out.println("Name: " + as.getName());
        System.out.println("Degree: " + as.getDegree());
        System.out.println("POI: " + as.getPoi());
        System.out.print(as.aboutMe());
        System.out.print(as.talents());
        System.out.print(as.weaknesses());
    }
}
