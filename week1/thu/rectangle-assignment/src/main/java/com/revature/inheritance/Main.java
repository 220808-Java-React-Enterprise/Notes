package com.revature.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Rectangle> rectangles = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int length = (int) (Math.random() * 50) + 100;
            int width = (int) (Math.random() * 50) + 50;

            Rectangle rec = new Rectangle("rectangle_" + i, length, width);
            rectangles.add(rec);
        }

        for (Rectangle r : rectangles) {
            System.out.println(r);
        }

        Rectangle maxArea = findMax(rectangles, new RectangleAreaComparator());
        Rectangle maxPerimeter = findMax(rectangles, new RectanglePerimeterComparator());

        System.out.println("\nRectangle with largest area");
        System.out.println(maxArea);

        System.out.println("\nRectangle with largest perimeter");
        System.out.println(maxPerimeter);
    }

    public static Rectangle findMax(List<Rectangle> list, RecComparator rCompare) {
        int largest = 0;
        for(int i = 0; i < list.size() - 1; i++) {
            if (!rCompare.isLessThan(list.get(i), list.get(i+1))) {
                largest = i;
            }
        }
        return list.get(largest);
    }
}
