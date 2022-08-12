package com.revature.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();

        // initialize 10 triangles
        initializeRectangles(rectangles);

        // display 10 triangles attributes
        displayRectangles(rectangles);

        // find the triangle with the largest area
        Rectangle maxArea = findMax(rectangles, new RectangleAreaComparator());

        // find triangle with the largest perimeter
        Rectangle maxPerimeter = findMax(rectangles, new RectanglePerimeterComparator());

        System.out.println("\nRECTANGLE WITH LARGEST AREA");
        System.out.println(maxArea);

        System.out.println("\nRECTANGLE WITH LARGEST PERIMETER");
        System.out.println(maxPerimeter);
    }

    public static Rectangle findMax(List<Rectangle> list, RecComparator rCompare) {
        int largest = 0;
        for(int i = 0; i < list.size() - 1; i++) {
            if (rCompare.isLessThan(list.get(i), list.get(i+1))) {
                largest = i + 1;
            }
        }
        return list.get(largest);
    }

    public static void displayRectangles(List<Rectangle> rectangles) {
        System.out.println("ALL RECTANGLES INFO");
        System.out.println("================================================================");
        for (Rectangle r : rectangles) {
            System.out.println(r);
        }
        System.out.println("================================================================");
    }

    public static void initializeRectangles(List<Rectangle> rectangles) {
        for (int i = 1; i <= 10; i++) {
            int length = (int) (Math.random() * 50) + 100;
            int width = (int) (Math.random() * 50) + 50;

            Rectangle rec = new Rectangle("rectangle_" + i, length, width);
            rectangles.add(rec);
        }
    }
}
