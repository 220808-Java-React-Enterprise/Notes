package com.revature.models;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        AreaCompare ac = new AreaCompare();
        PerimeterCompare pc = new PerimeterCompare();

        Rectangle maxArea = new Rectangle();
        Rectangle maxPerim = new Rectangle();

        for (int i = 0; i < 10; i++) {
            Rectangle r = new Rectangle();
            r.setName("Rectangle " + (i+1));
            r.setHeight(random.nextInt(20)+1);
            r.setWidth(random.nextInt(20)+1);
            rectangles.add(r);
        }

        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i) + " Area: " + rectangles.get(i).getArea() + " Perimeter: " + rectangles.get(i).getPerimeter());
        }

        System.out.println("\n------------------------------------------------------------------------------- \n");

        for (int i = 1; i < rectangles.size(); i++) {
            if ((ac.isLessThan(rectangles.get(i-1),rectangles.get(i))) && (ac.isLessThan(maxArea,rectangles.get(i)))) {
                maxArea = rectangles.get(i);
            }
        }

        for (int i = 1; i < rectangles.size(); i++) {
            if ((pc.isLessThan(rectangles.get(i-1),rectangles.get(i))) && (pc.isLessThan(maxPerim,rectangles.get(i)))) {
                maxPerim = rectangles.get(i);
            }
        }

        System.out.println(maxArea.name + " has the largest area with an area of " + maxArea.getArea());
        System.out.println("\n" + maxPerim.name + " has the largest perimeter with a perimeter of " + maxPerim.getPerimeter());
    }
}
