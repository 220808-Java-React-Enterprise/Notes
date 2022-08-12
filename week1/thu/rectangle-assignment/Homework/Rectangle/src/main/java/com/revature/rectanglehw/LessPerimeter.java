package com.revature.rectanglehw;

public class LessPerimeter implements Comparator{

    public boolean isLessThan(Rectangle rectOne, Rectangle rectTwo){
        return rectOne.getPerimeter() < rectTwo.getPerimeter();
    }
}
