package com.revature.demo;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        // Rectangle rectangle = new Rectangle();
        rectangles.add(new Rectangle("r1", 10.0, 5.0));
        rectangles.add(new Rectangle("r2", 20.0, 15.0));
        rectangles.add(new Rectangle("r3", 5.0, 2.0));
        rectangles.add(new Rectangle("r4", 40.0, 25.0));
        rectangles.add(new Rectangle("r5", 10.0, 4.0));
        rectangles.add(new Rectangle("r6", 12.0, 8.0));
        rectangles.add(new Rectangle("r7", 8.0, 2.0));
        rectangles.add(new Rectangle("r8", 4.0, 1.0));
        rectangles.add(new Rectangle("r9", 50.0, 30.0));
        rectangles.add(new Rectangle("r10", 18.0, 17.0));

        for (int i = 0; i < rectangles.size(); i++) {

            System.out.println(rectangles.get(i));
        }

        AreaComparator area = new AreaComparator();
        PerimeterComparator perimeter = new PerimeterComparator();

        Rectangle maxArea = findMax(rectangles , area);
        Rectangle maxPerimeter = findMax(rectangles , perimeter);

        System.out.println("--------------");
        System.out.println("Largest Area: ");
        System.out.println(maxArea);
        System.out.println("Area: ");
        System.out.println(maxArea.getArea());
        System.out.println("Largest Perimeter: ");
        System.out.println(maxPerimeter);
        System.out.println("Perimeter: ");
        System.out.print(maxPerimeter.getPerimeter());
        System.out.println();

    }
    private static Rectangle findMax(ArrayList<Rectangle> rectangles,  Comparator comparator) {
        //Implement

        Rectangle max = rectangles.get(0);

        for (int i = 0 ; i < rectangles.size(); i++ ){

            if ( comparator.isLessThan(max, rectangles.get(i))) {
                 max = rectangles.get(i);
            }

        }
        return max;


    }
}

