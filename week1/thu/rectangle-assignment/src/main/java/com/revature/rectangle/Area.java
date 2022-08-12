public class Area implements Comparator{
    public boolean isLessThan(Rectangle one, Rectangle two){
        return one.getArea() < two.getArea();
    }
}