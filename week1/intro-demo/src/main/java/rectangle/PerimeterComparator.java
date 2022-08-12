package rectangle;

public class PerimeterComparator implements Comparator {
    @Override
    public boolean isLessThan(Rectangle a, Rectangle b) {
        return a.getArea() < b.getArea();
    }
}
