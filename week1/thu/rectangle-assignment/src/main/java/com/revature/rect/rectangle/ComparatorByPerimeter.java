package src.main.java.com.revature.rect.rectangle;

public class ComparatorByPerimeter extends Main{

    //compare two rectangles by perimeter
    // and return a boolean
    public boolean isLessThan(int p1, int p2){
        boolean b = false;

        if (p1 == p2){
            b = true;
        }
        return b;
    }
}