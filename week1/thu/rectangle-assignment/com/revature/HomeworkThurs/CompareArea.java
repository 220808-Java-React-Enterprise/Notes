public class CompareArea implements Comparator {

    @Override
    public boolean isLessThan(Rectangle one, Rectangle two) {
        int first = one.getArea();
        int second = two.getArea();
        if (first > second || first == second)
            return false;
        else
            return true;

    }
}
