package com.revature.bio;

import java.util.*;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

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
    private List<String> hobbies;

    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */

    public Associate(){
        this.name = "";
        this.degree = "";
        this.POI = "";
        this.hobbies = new ArrayList<>();
    }
    public Associate(String name, String degree, String POI){
        this.name = name;
        this.degree = degree;
        this.POI = POI;
        this.hobbies = new ArrayList<>();
    }
    public String getHobby(int i){
        try{
            return hobbies.get(i - 1);
        }
        catch(Exception ExceptionOutOfBounds){
            return ("Index out of bounds max index is " + (hobbies.size()));
        }
    }
    public void setHobbies(String hobbies) {
        this.hobbies.add(hobbies);
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

    private String getAllHobbies(){
        StringBuilder myString = new StringBuilder();

        for (String s : hobbies)
            if (!s.equals(hobbies.get(hobbies.size() - 1)))
                myString.append(s).append(", ");
            else
                myString.append("and ").append(s);

        return myString.toString();
    }
    public String aboutMe(){
        return "My name is " + name + ". I have a " + degree + " degree. I enjoy " + getAllHobbies() +
                " in my free time. I'm interested " + POI + ".";
    }
}
