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
    private String degree;
    private String poi;

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

    public String getPoi() {
        return poi;
    }

    public void setPoi(String poi) {
        this.poi = poi;
    }

    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */
    public String aboutMe() {
        return "My name is " + getName() + ".\n"
             + "I have a degree in " + getDegree() + ".\n"
             + "I would like to visit " + getPoi() + ".\n";
    }
}
