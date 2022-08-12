package com.revature.models;

// Calls and compares the areas of two Rectangle objects
public class AreaCompare{
    public boolean isLessThan(Rectangle a, Rectangle b) {
        int areaA = a.getArea();
        int areaB = b.getArea();
        // returns true of the area of Rectangle "a" is less than the area of Rectangle "b"
        return areaA < areaB;

    }
}
