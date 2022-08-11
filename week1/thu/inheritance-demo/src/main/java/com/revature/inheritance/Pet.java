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
    private String owner;
    private String breed;
    private String size;
    private int age;
    private double weight;

    public Pet() {

    }

    public Pet(String name, String owner, String breed, String size, int age, double weight) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void makeSound();

    public void love() {
        System.out.println(getName() + " loves you!");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
