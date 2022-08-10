package com.revature.bio;

/*
 * Fill in this Associate class skeleton
<<<<<<< HEAD
 * Remember, all fields and methods needs to be public!
=======
 * Remember, all fields needs to be private!
>>>>>>> b3aa9a1f61005c2a324d2e7f44ddcef7a18c9a49
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


    @Override
    public String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", POI='" + POI + '\'' +
                '}';
    }


    //About me
    public void aboutMe() {
        System.out.println("About Me!");
        System.out.println("My name is Mahmoud Osman. I live in MN.");

    }

    //Talent
    public void talent() {
        System.out.println("My Talent");
        System.out.println("1. HTML\n" + "2. CSS\n"
                + "3. Java\n" + "4. JavaScript" + "Angular\n" + "PHP\n");
    }


    public void education() {
        System.out.println("Education");
        System.out.println("1. Associate's Degree - Computer Systems Management.\n " +
                "2. Bachelor's Degree - Computer Science ");
    }


}


