package com.revature.models;
import java.util.Comparator;

// Calls and compares the perimeters of two Rectangle objects
public class PerimeterCompare implements Comparator<Rectangle> {
    boolean isLessThan(Rectangle a, Rectangle b) {
        int perimA = a.getPerimeter();
        int perimB = b.getPerimeter();
        // returns true of the perimeter of Rectangle "a" is less than the perimeter of Rectangle "b"
        return perimA < perimB;

        }

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return 0;
    }
}
