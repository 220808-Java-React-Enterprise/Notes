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
    public String aboutMe(){

        return "Hi, my name is " + name + ", I went back to school after being in property management \n" +
                "for about 10 years.  I wanted something different and more challenging.  " + degree + " was for sure it!\n" +
                "I've enjoyed going back to school.  I enjoy going to the gym and running.  And I also love to cook and read.\n" +
                "I would love to visit " + POI + " someday!\n" +
                "I'm excited for this new adventure brought to me by Revature!";
    }

    public String myDog(){
        return "I have a dog named Max.  He's the sweetest.  I've had him about 7 years.  He's a pitbull mix.\n" +
                "He tried to eat other dogs so I have to be careful, but my little nieces and nephews climb all\n" +
                "over him and he is so patient and sweet.  I couldn't ask for a better dog";
    }
}
