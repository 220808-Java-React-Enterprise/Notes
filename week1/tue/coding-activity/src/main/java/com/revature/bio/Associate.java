package com.revature.bio;

/*
 * Fill in this Associate class skeleton
 * Remember, all fields and methods needs to be private!
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

    public Associate(){

    }

    public Associate(String name, String degree, String POI){
        this.name = name;
        this.degree = degree;
        this.POI = POI;
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

    @java.lang.Override
    public java.lang.String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", POI='" + POI + '\'' +
                '}';
    }
}
