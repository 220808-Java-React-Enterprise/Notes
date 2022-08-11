package main.java;

public class AreaComparator implements Comparator{
    @Override
    public boolean isLessThan(Rectangle a, Rectangle b) {
        return a.getArea() < b.getArea();
    }
}
