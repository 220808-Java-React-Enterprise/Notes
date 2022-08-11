package com.revature.models;

public abstract class PerimeterCompare{
    public boolean isLessThan(Rectangle a, Rectangle b) {
        int perimA = a.getPerimeter();
        int perimB = b.getPerimeter();
        return perimA < perimB;

    }
}
