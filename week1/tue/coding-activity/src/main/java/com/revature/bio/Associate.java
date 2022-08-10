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
    private String POI;

    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */

    public Associate()
    {
    }

    public Associate(String called, String profession,String place)
    {
        name=called;
        degree=profession;
        POI=place;
    }
    //SETTERS//
    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setPOI(String POI) {
        this.POI = POI;
    }
    //GETTERS//
    public String getName()
    {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public String getPOI() {
        return POI;
    }
    //Behaivors//
    public void toWalk()
    {
        System.out.println(this.name + " is walking!");
    }
    public void isSleepy()
    {
        System.out.println(this.name + " is starting to nod off!");
    }

    public void isReading()
    {
        System.out.println(this.name + " is reading!");
    }
    //ToString//
    @Override
    public String toString() {
        toWalk();
        isSleepy();
        isReading();

        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", POI='" + POI + '\'' +
                '}';


    }
}
