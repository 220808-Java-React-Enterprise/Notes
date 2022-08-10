package com.revature.demo;

/* Start your application! */
public class Main {

    /* behavior */
    public static void main(String[] args) {
        /* data types (primitive) */
        byte a = 0; // 1 byte = 8 bits
        short b = 0; // 2 byte = 16 bits
        int c = 0; // 4 byte = 32 bits
        long d = 0; // 8 byte = 64 bits
        float e = 0.0f; // 4 byte = 32 bits
        double f = 0.0; // 8 byte = 64 bits
        char g = ' '; // 2 byte = 16 bits
        boolean h = false; // 4 byte = 32 bits

        System.out.println("Hello world!");

        Dog myDog1 = new Dog(3, "Aegon");
        System.out.println(myDog1); // shortcut -> sout

        User user =  new User("baoduong", "password");
        user.setUsername("username");
        user.setPassword("password");
    }
}
