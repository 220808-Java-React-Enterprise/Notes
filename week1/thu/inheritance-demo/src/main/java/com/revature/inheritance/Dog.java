package com.revature.inheritance;

public class Dog extends Pet implements Animal, WarmBlood {
    public Dog() {
    }

    public Dog(String name, String owner, String breed, String size, int age, double weight) {
        super(name, owner, breed, size, age, weight);
    }

    @Override
    public void shake() {

    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Woof woof!");
    }

    @Override
    public void hot() {

    }
}
