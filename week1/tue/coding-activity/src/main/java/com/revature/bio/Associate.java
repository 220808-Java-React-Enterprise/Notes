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

    private String POI;

    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */
    public String getMyHobbies() {
        return "Some of my hobbies include: Hunting, Fishing, and Boating.";
    }
    /* default constructor (construct objects) */
    /* overloading */
//    public Associate (){
//
//    }

    public Associate(String name, String degree, String POI) {
        this.name = name;
        this.degree = degree;
        this.POI = POI;
    }
     /* Setter and Getter*/

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setDegree(String degree) {
//        this.degree = degree;
//    }
//
//    public void setPOI(String POI) {
//        this.POI = POI;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDegree() {
//        return degree;
//    }
//
//    public String getPOI() {
//        return POI;
//    }


    /* Overriding */

    @Override
    public String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", POI='" + POI + '\'' +
                '}';
    }

}
