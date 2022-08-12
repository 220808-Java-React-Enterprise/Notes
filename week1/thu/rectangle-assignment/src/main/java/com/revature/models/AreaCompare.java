package com.revature.models;
import java.util.Comparator;

// Calls and compares the areas of two Rectangle objects
public class AreaCompare implements Comparator<Rectangle> {
    boolean isLessThan(Rectangle a, Rectangle b) {
        int areaA = a.getArea();
        int areaB = b.getArea();
        // returns true of the area of Rectangle "a" is less than the area of Rectangle "b"
        return areaA < areaB;
    }

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return 0;
    }
}