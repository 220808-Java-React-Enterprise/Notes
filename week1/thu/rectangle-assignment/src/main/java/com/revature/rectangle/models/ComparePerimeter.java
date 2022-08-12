package com.revature.rectangle.models;

public class ComparePerimeter {

    public boolean isLessThan(Rectangle r1, Rectangle r2){
        if(r1.getPerimeter() > r2.getPerimeter()){
            System.out.println(r2 + "perimeter is less than" + r1 + "perimeter");
            return true;
        }else{
            System.out.println(r1 + "perimeter is less than" + r2 + "perimeter");
            return false;
        }

    }
}
