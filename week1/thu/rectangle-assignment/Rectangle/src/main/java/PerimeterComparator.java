package main.java;

public class PerimeterComparator implements Comparator{
    @Override
    public boolean isLessThan(Rectangle a, Rectangle b) {
        return a.getPerimiter() < b.getPerimiter();
    }
}