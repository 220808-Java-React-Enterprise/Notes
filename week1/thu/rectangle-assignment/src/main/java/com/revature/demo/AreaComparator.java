package com.revature.demo;

public class AreaComparator extends Object{

    public boolean isLessThan(Rectangle r1, Rectangle r2){

        double r1Area = r1.getArea();
        double r2Area = r2.getArea();

        if(r1Area < r2Area){

            return true;

        }else {return false;}

    } 

}
