package com.revature.inheritance;

public class Dog extends Pet {

    public Dog() {
    }

    public Dog(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Woof woof!");
    }
}
