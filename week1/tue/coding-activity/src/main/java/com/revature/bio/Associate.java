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

    public Associate() {
    }

    public Associate(String name, String degree, String POI) {
        this.name = name;
        this.degree = degree;
        this.POI = POI;
    }

    //Overloading
    public Associate(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", POI='" + POI + '\'' +
                '}';
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
    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */
    public void AboutMe(){
        System.out.println("My name is Randy Caballero, am from Cuba");
    }

    public void talent(){
        System.out.println("my talent is play baseball");
    }

    public int simpleMath(int a, int b){
        return a+b;
    }
}
