package com.revature.bio;

import java.util.Comparator;
import java.util.Scanner;

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
        System.out.print("\u001B[?1049h\u001B[H");
        System.out.println("Name: " + as.getName());
        System.out.println("Degree: " + as.getDegree());
        System.out.println("POI: " + as.getPoi());
        System.out.print("\u001B[3;1H");
        System.out.print(as.aboutMe());
        System.out.print(as.talents());
        System.out.print(as.weaknesses());
        Scanner s = new Scanner(System.in);
        String r = s.nextLine();
        for (char c : r.toCharArray()) {
            System.out.print((byte)c);
        }
        System.out.println();
        System.out.print("\u001B[?1049l");
        Comparator<String> c;
    }
}
