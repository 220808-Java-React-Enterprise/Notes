package com.revature.rectanglehw;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class main {


    public static void main(String[] args){
        List<Rectangle> rectList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Rectangle rectangle = new Rectangle("rect" + (i+1), (int)(Math.random() * 100 + 1), (int)(Math.random() * 100 + 1));
            System.out.println(rectangle);
            rectList.add(rectangle);
        }

        Rectangle maxArea = findMax(rectList, new LessArea());
        Rectangle maxPerimeter = findMax(rectList, new LessPerimeter());
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Rectangle with the max area is " + maxArea.getName() + " that is " + maxArea.getArea() + ".");
        System.out.println("Rectangle with the max perimeter is " + maxPerimeter.getName() + " that is " + maxPerimeter.getArea()+ ".");
        System.out.println("-------------------------------------------------------------------------------------------------------");


    }
    public static Rectangle findMax(List<Rectangle> rects, Comparator comparator){
        Rectangle maxRect = rects.get(0);
        for (Rectangle rectangle : rects) {
            if (comparator.isLessThan(maxRect, rectangle)) {
                maxRect = rectangle;
            }
        }
        return maxRect;
    }

}