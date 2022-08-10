package com.revature.bio;

import java.lang.*;

/*
 * Fill in this Associate class skeleton
 * Remember, all fields needs to be private!
 */
public class Associate {

    /*
     * Initialize fields: name, degree, POI (place of interest)
     */
    private String name = "";
    private String degree = "";
    private String POI = "";


    //Constructors
    public Associate() {
    }

    public Associate(String name, String degree, String POI) {
        this.name = name;
        this.degree = degree;
        this.POI = POI;
    }


    //Getters and setters
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


    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */

    public String aboutMe() {
        return (String) "Name: " +  name + "\nDegree: " + degree + "\nPlace of Interest: " + POI;
    }

    public String talent() {
        return "Reading...";
    }

    @Override
    public java.lang.String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", POI='" + POI + '\'' +
                '}';
    }
}
