package com.revature.rectangle;

public class ComparatorArea extends Comparator{

    @Override
    public String getType() {
        return "Area";
    }

    public boolean isLessThan(Rectangle a, Rectangle b){
        return a.Area() < b.Area();
    }
}
