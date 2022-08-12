package com.revature.rectangle;

public class ComparatorPerimeter extends Comparator{
    @Override
    public String getType() {
        return "Perimeter";
    }

    public boolean isLessThan(Rectangle a, Rectangle b){
        return a.Perimeter() < b.Perimeter();
    }
}
