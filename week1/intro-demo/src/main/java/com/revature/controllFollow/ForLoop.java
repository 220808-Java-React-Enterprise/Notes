package com.revature.controllFollow;

public class ForLoop {
    public static void main(String[] args) {


        //Normal for loop
        int numbers[] = {1, 6, 5, 4, 8, 3, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }


        //Advanced for loop
        System.out.println();
        System.out.println("Advanced for loop");
        String names[] = {"Mahmoud", "Osman", "John", "Dow"};
        for (String name : names) {
            System.out.println(name);
        }


    }
}
