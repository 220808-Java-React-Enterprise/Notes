public class Perimeter implements Comparator{
    public boolean isLessThan(Rectangle one, Rectangle two){
        return one.getPerimeter() < two.getPerimeter();
    }
}
