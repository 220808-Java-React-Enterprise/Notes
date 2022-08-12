package com.revature.rectanglehw;

public class LessArea implements Comparator{

    public boolean isLessThan(Rectangle rectOne, Rectangle rectTwo){
        return rectOne.getArea() < rectTwo.getArea();
    }
}
