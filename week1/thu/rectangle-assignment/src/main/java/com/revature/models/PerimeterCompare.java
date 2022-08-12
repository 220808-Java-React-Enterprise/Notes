package com.revature.models;

// Calls and compares the perimeters of two Rectangle objects
public class PerimeterCompare{
    public boolean isLessThan(Rectangle a, Rectangle b) {
        int perimA = a.getPerimeter();
        int perimB = b.getPerimeter();
        // returns true of the perimeter of Rectangle "a" is less than the perimeter of Rectangle "b"
        return perimA < perimB;

    }
}
