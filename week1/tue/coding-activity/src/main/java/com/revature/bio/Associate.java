package com.revature.bio;

import java.sql.Array;
import java.util.ArrayList;

/*
 * Fill in this Associate class skeleton
 * Remember, all fields and methods needs to be private!
 */
public class Associate {
    /*
     * Initialize fields: name, degree, POI (place of interest)
     */
    private String name = "Daniel Mulligan";
    private String degree = "Psychology";
    private String POI = "Ireland";
    private ArrayList<String> favoriteGames = new ArrayList<>();

    /* Constructor*/

    public Associate()
    {
    }

    public Associate(String name, String degree, String POI)
    {
        this.name = name;
        this.degree = degree;
        this.POI = POI;

    }
    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */

    public String getName()
    {
        return name;
    }

    public ArrayList<String> getFavoriteGames()
    {
        return favoriteGames;
    }

    public void addFavoriteGames(String favoriteGame)
    {
        this.favoriteGames.add(favoriteGame);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDegree()
    {
        return degree;
    }

    public void setDegree(String degree)
    {
        this.degree = degree;
    }

    public String getPOI()
    {
        return POI;
    }

    public void setPOI(String POI)
    {
        this.POI = POI;
    }

    @Override
    public String toString()
    {
        return "Hello, I'm " + this.name + " and I graduated with a degree in " + this.degree + "." +
                "\nI'd really like to go to " + this.POI + "!";
    }
    public String myTalent(boolean Sleeping)
    {
        if (Sleeping == true)
        {
            return "I don't have much talent when I'm sleeping.";
        }
        else
        {
            return "I'm a very good listener!";
        }
    }
    public void favoriteGames()
    {
        if (this.favoriteGames.size() == 0)
        {
            System.out.println("I guess I quit cold turkey...");
        }
        else
        {
            System.out.println("Currently I've been playing:");
        }
        for( String n : this.favoriteGames)
        {
            System.out.println(n);
        }
    }

}