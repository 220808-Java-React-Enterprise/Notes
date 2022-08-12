package com.revature.demo;

public class PerimeterComparator extends Object {

    public boolean isLessThan(Rectangle r1, Rectangle r2){

        double r1Perimeter = r1.getPerimeter();
        double r2Perimeter = r2.getPerimeter();

        if(r1Perimeter < r2Perimeter){

            return true;

        }else {return false;}

    }
}
