package com.revature.inheritance;

import java.util.Comparator;

public class RectanglePerimeterComparator implements RecComparator{

    public boolean isLessThan(Rectangle rec1, Rectangle rec2) {
        return rec1.getPerimeter() < rec2.getPerimeter();
    }
}