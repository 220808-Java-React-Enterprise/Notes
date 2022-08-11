package com.revature.bio;

/*
 * Fill in this Associate class skeleton
 * Remember, all fields and methods needs to be private!
 */
public class Associate {
    /*
     * Initialize fields: name, degree, POI (place of interest)
     */
    private String name;
    private int age;
    private String hometown;
    private String favoriteFood;
    private String degree;
    private String major;
    private String hobbyOne;
    private String hobbyTwo;


    // constructors

    public Associate() {

    }

    public Associate(String name, int age, String hometown, String favoriteFood, String degree, String major, String hobbyOne, String hobbyTwo) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.favoriteFood = favoriteFood;
        this.degree = degree;
        this.major = major;
        this.hobbyOne = hobbyOne;
        this.hobbyTwo = hobbyTwo;


    }

    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */

    public void aboutMe() {
        System.out.println("Hello world! My name is " + name + "! I'm a developer from " + hometown);
    }
    public void myHobbies() {
        System.out.println("My hobbies are " + hobbyOne + " and " + hobbyTwo);
    }

    public void myDegree() {
        System.out.println("I have a " + degree + " degree in " + major);
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getHobbyOne() {
        return hobbyOne;
    }

    public void setHobbyOne(String hobbyOne) {
        this.hobbyOne = hobbyOne;
    }

    public String getHobbyTwo() {
        return hobbyTwo;
    }

    public void setHobbyTwo(String hobbyTwo) {
        this.hobbyTwo = hobbyTwo;
    }

    @Override
    public String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", degree='" + degree + '\'' +
                ", major='" + major + '\'' +
                ", hobbyOne='" + hobbyOne + '\'' +
                ", hobbyTwo='" + hobbyTwo + '\'' +
                '}';
    }
}
