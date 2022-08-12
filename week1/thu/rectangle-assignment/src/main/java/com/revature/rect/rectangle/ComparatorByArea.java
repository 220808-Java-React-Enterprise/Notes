package src.main.java.com.revature.rect.rectangle;

public class ComparatorByArea extends Main{

    //compare two rectangles and return a boolean
    public boolean isLessThan(int area1, int area2){
        boolean b = false;

        if (area1 == area2){
            b = true;
        }
        return b;
    }
}