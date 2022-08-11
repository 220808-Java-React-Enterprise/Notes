package com.revature.inheritance;

public class AreaComparator implements Comparator {

public boolean isLessThan(Rectangle a, Rectangle b){
    if(a.getArea() < b.getArea()){
        return true;
    }
    return false;
}

}
