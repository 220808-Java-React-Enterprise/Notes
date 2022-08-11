package com.revature.rectangle;

public class AreaComparator implements Comparator {
    @Override
    public boolean isLessThen(Rectangle a, Rectangle b) {
        return a.getArea() < b.getArea();
    }
}
