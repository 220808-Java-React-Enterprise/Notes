package com.company;

public class Comparator2 {

    public boolean isLessThan(Rectangle rectangle1, Rectangle rectangle2){
        if (rectangle1.getPerimeter() < rectangle2.getPerimeter()) return true;
        else return false;
    }
}
