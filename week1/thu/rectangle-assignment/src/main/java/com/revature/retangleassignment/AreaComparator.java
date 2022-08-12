package com.revature.retangleassignment;

public class AreaComparator {
    public boolean isLessThan(Rectangle r1, Rectangle r2) {

        return ( r1.getArea() - r2.getArea() < 0 );

    }
}
