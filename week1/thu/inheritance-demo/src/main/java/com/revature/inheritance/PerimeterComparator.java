package com.revature.inheritance;

public class PerimeterComparator implements Comparator{


    public boolean isLessThan(Rectangle a, Rectangle b){
        if(a.getPerimeter() < b.getPerimeter()){
            return true;
        }
        return false;
    }


}
