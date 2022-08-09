package com.revature.demo;

public class Dog extends Object {
    /* fields aka attributes */
    private int age;
    private String name;
    private String color;
    private int weight;
    private String hairLength;

    /* default constructor (construct objects) */
    /* overloading */
    public Dog() {

    }

    /* setter base constructor (set attributes and construct objects) */
    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public Dog(int age, String name, String color, int weight, String hairLength) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.hairLength = hairLength;
    }

    /* behaviors */
    /* getters and setters */
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String getHairLength() {
        return hairLength;
    }

    /* override toString() hashcode */
    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", hairLength='" + hairLength + '\'' +
                '}';
    }
}
