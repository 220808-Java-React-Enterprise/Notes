package com.revature.models;

public class AreaCompare{
    public boolean isLessThan(Rectangle a, Rectangle b) {
        int areaA = a.getArea();
        int areaB = b.getArea();
        return areaA < areaB;

    }
}
