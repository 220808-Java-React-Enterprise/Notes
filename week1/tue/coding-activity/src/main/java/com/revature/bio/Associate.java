package com.revature.bio;

/*
 * Fill in this Associate class skeleton
 * Remember, all fields and methods needs to be private!
 */
public class Associate {

    public Associate(){

    }

    //parameterized constructor
    public Associate(String name, String degree, String POI){
        this.name = name;
        this.degree = degree;
        this.POI = POI;
    }


    /*
     * Initialize fields: name, degree, POI (place of interest)
     */
    private String name = " ";
    private String degree = " ";
    private String POI = " ";


    //setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setPOI(String POI) {
        this.POI = POI;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getPOI() {
        return POI;
    }
    public String getDegree() {
        return degree;
    }

    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */
    public void aboutMe(){
        System.out.println("My name is " + getName() + ". " + "I am interested in going to " + getPOI() + ". " + "I have a " + getDegree() + " degree.");
    }

    public void talent(){
        System.out.print("My talent is basic piano playing.");
    }

}
