package com.revature.bio;

import java.util.*;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

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
    private final List<String> hobbies;

    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */
    // Non-Default Constructor
    public Associate(String name, String degree, String POI){
        this.name = name;
        this.degree = degree;
        this.POI = POI;
        this.hobbies = new ArrayList<>();
    }

    // Pre: A instance of associate need to be instantiated
    // Post: A String value of a hobby is returned
    // Purpose: To get a hobby from the ListArray
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

    // Pre: getAllHobbies is called from another method
    // Post: A String is returned containing all the hobbies separated by a comma
    // Purpose: To convert the ListArray into a single string for output
    private String getAllHobbies(){
        // Used to build a string in a loop setting
        StringBuilder myString = new StringBuilder();

        for (String s : hobbies)
            // Check if only one item exists in the list
            if (hobbies.size() == 1)
                myString.append(s);
            // Check if we are at the last item in the list
            else if (!s.equals(hobbies.get(hobbies.size() - 1)))
                myString.append(s).append(", ");
            // Means we are at the list item
            else
                myString.append("and ").append(s);

        return myString.toString();
    }

    // Pre: A instance of Associate must be created
    // Post: A String is returned with a description of the associate
    // Purpose: To return a string that gives a description of the associate
    @Override
    public String toString(){
        String myString = "My name is " + name + ". I have a " + degree + " degree.";

        // Check if hobbies in empty, if so skip printing it
        if (!getAllHobbies().equals(""))
            myString += " I enjoy " + getAllHobbies() + " in my free time.";

        myString += " I'm interested in visiting " + POI + ".";

        return myString;
    }
}
