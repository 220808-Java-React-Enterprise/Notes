package com.revature.rectangle.models;

public class ComparePerimeter {

    public boolean isLessThan(Rectangle r1, Rectangle r2){
        if(r1.getPerimeter() < r2.getPerimeter()) return true;
        else return false;
    }
}
