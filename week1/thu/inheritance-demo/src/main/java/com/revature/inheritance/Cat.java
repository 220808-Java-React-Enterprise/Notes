package com.revature.inheritance;

public class Cat extends Pet {
    public Cat() {
    }

    public Cat(String name, String owner, String breed, String size, int age, double weight) {
        super(name, owner, breed, size, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Meow meow!");
    }
}
