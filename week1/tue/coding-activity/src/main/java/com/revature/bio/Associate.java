package com.revature.bio;

import java.util.Arrays;

/*
 * Fill in this Associate class skeleton
 * Remember, all fields needs to be private!
 */
public class Associate {
    /*
     * Initialize fields: name, degree, POI (place of interest)
     */

    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */
    private String name;
    private  String degree;
    private String POI;

    private String[] hobbies;

    public Associate(){

    }

    public Associate(String name, String degree, String POI, String[] hobbies){
        this.name = name;
        this.degree = degree;
        this.POI = POI;
        this.hobbies = hobbies;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPOI() {
        return POI;
    }

    public void setPOI(String POI) {
        this.POI = POI;
    }

    @Override
    public String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", POI='" + POI + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }

    /*
    @java.lang.Override
    public java.lang.String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", POI='" + POI + '\'' +
                '}';
    }
     */

    public String aboutMe(){
        /*
        System.out.println("My name is: " + name + ". " + "I have " + degree + " degree. "
        + "And my point of interest is " + POI);
         */
        return "My name is " + name + ". " + "I have " + degree + " degree. " + "And my point of interest is " + POI + ".";
    }

    public String talent(){
        return "My talents include coding, debugging and testing applications.";
    }

    /*
    public boolean myHobbies(){
        System.out.println("My hobbies include: ");
        for (int i = 0; i < hobbies.length; i++){
            System.out.println(hobbies[i]);
        }
        return false;
    }
     */

    //method to associate hobbies
    public String myHobbies(){
        System.out.println("My hobbies include: ");
        for (int i = 0; i < hobbies.length; i++){
            System.out.println(hobbies[i]);
        }
        return "";
    }

}
