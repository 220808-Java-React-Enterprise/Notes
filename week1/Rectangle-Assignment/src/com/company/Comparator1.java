package com.company;

public class Comparator1 {

    public boolean isLessThan(Rectangle rectangle1, Rectangle rectangle2){
        if (rectangle1.getArea() < rectangle2.getArea()) return true;
        else return false;
    }
}
