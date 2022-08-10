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
    private String poi;
    private String talents;
    private String weaknesses;

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

    public String getPoi() {
        return poi;
    }

    public void setPoi(String poi) {
        this.poi = poi;
    }

    public void setTalents(String[] talents) {
        this.talents = toStringList(talents);
    }

    public void setWeaknesses(String[] weaknesses) {
        this.weaknesses = toStringList(weaknesses);
    }

    private String toStringList(String[] items) {
        if (items.length == 0) return "<none>";
        StringBuilder sb = new StringBuilder();
        sb.append(items[0]);
        if (items.length == 2) {
            sb.append(" and ");
            sb.append(items[1]);
        }
        else {
            for (int i = 1; i < items.length; i++) {
                sb.append(", ");
                if (i == items.length - 1) sb.append("and ");
                sb.append(items[i]);
            }
        }
        return sb.toString();
    }
    /*
     * Create some standard associate behaviors AKA methods (i.e. about me, talent, etc)
     */
    public String aboutMe() {
        return "My name is " + getName() + ".\n"
             + "I have a degree in " + getDegree() + ".\n"
             + "I would like to visit " + getPoi() + ".\n";
    }
    public String talents() {
        return "My talents include: " + talents + ".\n";
    }

    public String weaknesses() {
        return "My weaknesses include: " + weaknesses + ".\n";
    }
}
