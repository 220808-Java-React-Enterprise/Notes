package com.revature.inheritance;

/*
 * For inheritance
 * Purpose of inheritance:
 * Code usability = all classes that extends Pet will inherit attributes and behaviors (less typing)
 * Cannot inherit multiple abstract class
 * Can set attributes with access modifiers and create methods with function body
 * Can also create abstract methods = contract methods (must implement and override)
 * Can be inherited by (1) abstract class and interface
 */
public abstract class Pet {
    /* Attributes */
    private String name;
    private String breed;
    private String color;
    private int age;

    /* Constructors */
    public Pet() {

    }

    public Pet(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    /* Getters and setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* Behaviors */

    /* abstract method = no function body. Will need to override this method */
    public abstract void makeSound();

    /* regular method = require function body */
    public void whine() {
        System.out.println(getName() + " is hungry!");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
