package com.revature.rectangle;

public class CompareArea {

    public boolean isLessThan(Rectangle one, Rectangle two) {

        if (one.getPerimeter() <= two.getPerimeter()){
            return true;
        } else {
            return false;
        }

    }
}
