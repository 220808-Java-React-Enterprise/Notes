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
    private String degree;
    private String placeOfInterest;
    private String favoritePokemon;

    Associate(String name, String degree, String placeOfInterest){
        this.name = name;
        this.degree = degree;
        this.placeOfInterest = placeOfInterest;
        this.favoritePokemon = null;
    }

    Associate(String name, String degree, String placeOfInterest, String favoritePokemon){
        this.name = name;
        this.degree = degree;
        this.placeOfInterest = placeOfInterest;
        this.favoritePokemon = favoritePokemon;
    }

    public String getName() {
        return this.name;
    }

    public String tellAboutSelf(){
        if(favoritePokemon == null) {
            return "I am " + name + ". I have a degree in " + degree + ". I want to visit " + placeOfInterest + ".";
        }else{
            return  "I am " + name + ". I have a degree in " + degree + ". I want to visit " + placeOfInterest + ". My favorite Pokemon is " + favoritePokemon + ".";
        }
    }
    public String tellAboutSelf(String additionalInfo){
        return tellAboutSelf() + " Also, " + additionalInfo;
    }

    public int doTalent(int x, int y){
        return x + y;
    }

    public void chitChat(Associate friend){
        System.out.println(this.name + " chats with " + friend.getName() + ".");
    }
}
