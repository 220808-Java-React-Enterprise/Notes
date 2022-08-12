package com.revature.bio;

/*
 * Fill in this Associate class skeleton
 * Remember, all fields needs to be private!
 */
public class Associate {
    /*
     * Initialize fields: name, degree, POI (place of interest)
     */
    private String name;
    private String degree;
    private String poi;

    public Associate() {
        this("unknown");
    }

    public Associate(String name) {
        this(name, "unknown");
    }
    public Associate(String name, String degree) {
        this(name, degree, "unknown");
    }
    public Associate(String name, String degree, String poi) {
        this.name = name;
        this.degree = degree;
        this.poi = poi;
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

    public String getPoi() {
        return poi;
    }

    public void setPoi(String poi) {
        this.poi = poi;
    }


    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */

    @Override
    public String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", poi='" + poi + '\'' +
                '}';
    }

    public String aboutMe() {
        return "Name: " + this.name + ", Education: " + this.degree + ", PIO: " + this.poi;
    }
}
