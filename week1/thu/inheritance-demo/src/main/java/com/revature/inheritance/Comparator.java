package com.revature.inheritance;

public class Comparator extends Rectangle{


    public boolean isAreaLessThan(Rectangle a, Rectangle b){

        boolean result;

        if (a.findArea(a) < b.findArea(b)){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }

    public boolean isPerimeterLessThan(Rectangle a, Rectangle b){

        boolean result;

        if (a.findPerimeter(a) < b.findPerimeter(b)){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }
}
