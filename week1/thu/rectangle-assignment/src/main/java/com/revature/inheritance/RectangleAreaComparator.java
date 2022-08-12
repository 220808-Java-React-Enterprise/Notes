package com.revature.inheritance;

import java.util.Comparator;

public class RectangleAreaComparator implements RecComparator {

    public boolean isLessThan(Rectangle rec1, Rectangle rec2) {
        return rec1.getArea() < rec2.getArea();
    }
}
