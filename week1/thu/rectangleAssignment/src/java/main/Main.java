
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        for(int i = 0; i < 10; i++){
            rectangles.add(new Rectangle("rectangle " + (i+1), (int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1)));
            System.out.println(rectangles.get(i));
        }
        Rectangle biggestRectangle = findMax(rectangles, new AreaComparator());
        System.out.println("\nThe largest rectangle by area is : " + biggestRectangle + " with area of " + biggestRectangle.getArea());
        biggestRectangle = findMax(rectangles, new PerimeterComparator());
        System.out.println("The largest rectangle by perimeter is : " + biggestRectangle + " with perimeter of " + biggestRectangle.getPerimeter());
    }

    private static Rectangle findMax(List<Rectangle> rectangles, Comparator comparator){
        Rectangle biggestRectangle = rectangles.get(0);
        for(Rectangle rectangle : rectangles){
            if(comparator.isLessThan(biggestRectangle, rectangle)){
                biggestRectangle = rectangle;
            }
        }
        return biggestRectangle;
    }
}