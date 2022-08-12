public class ComparePerimeter implements Comparator {
    public boolean isLessThan(Rectangle one, Rectangle two)
    {
        int  first=one.getPerimeter();
        int second= two.getPerimeter();
        if (first>second || first==second)
            return false;
        else return true;

    }

}
