package com.revature.retangleassignment;

public class PerimeterComparator {

    public boolean isLessThan(Rectangle r1, Rectangle r2) {

        return ( r1.getPerimeter() - r2.getPerimeter() < 0 );

    }
}
