package main.java.com.revature.bio;

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
    public static void study(){
        System.out.println("Todd will do his best to keep up with class");
    }
    public static void troubleshoot(){
        System.out.println("Todd will eventually master the problem");
    }
    public static void hobbies(){
        System.out.println("Todd plays with his pets and video games in his free time");
    }

    @Override
    public String toString() {
        return "Associate{" +
                "name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", POI='" + POI + '\'' +
                '}';
    }
}
