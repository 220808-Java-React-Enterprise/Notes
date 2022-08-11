package com.revature.rectangle;

public class PerimeterComparator implements Comparator {
    @Override
    public boolean isLessThen(Rectangle a, Rectangle b) {
        return a.getPerimeter() < b.getPerimeter();
    }
}

