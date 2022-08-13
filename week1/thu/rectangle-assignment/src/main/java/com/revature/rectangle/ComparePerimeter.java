package com.revature.rectangle;

public class ComparePerimeter {

    public boolean isLessThan(Rectangle one, Rectangle two) {

        if (one.getArea() <= two.getArea()){
            return true;
        } else {
            return false;
        }

    }
}
