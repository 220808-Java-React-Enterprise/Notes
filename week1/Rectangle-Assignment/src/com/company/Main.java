package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //find max by area
    public static void findMax(List<Rectangle> rectangleList, Comparator1 c1){
        Rectangle maxRectangle = rectangleList.get(0);
        for (int i = 1; i < rectangleList.size(); i++){
            if (c1.isLessThan(maxRectangle, rectangleList.get(i))){
                maxRectangle = rectangleList.get(i);
            }
        }
        System.out.println("\nThe max rectangle by area is: " + maxRectangle);
    }

    //find max by perimeter
    public static void findMax(List<Rectangle> rectangleList, Comparator2 c2){
        Rectangle maxRectangle = rectangleList.get(0);
        for (int i = 1; i < rectangleList.size(); i++){
            if (c2.isLessThan(maxRectangle, rectangleList.get(i))){
                maxRectangle = rectangleList.get(i);
            }
        }
        System.out.println("\nThe max rectangle by perimeter is: " + maxRectangle);
    }

    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();

        for (int i = 1; i < 11; i++){
            Rectangle rectangle = new Rectangle("rectangle " + i, (int)(Math.random() * 10) + 1, (int)(Math.random()*10) + 1);
            rectangleList.add(rectangle);
        }

        for (Rectangle r: rectangleList){
            System.out.println(r);
        }

        Comparator1 c1 = new Comparator1();
        Comparator2 c2 = new Comparator2();

        findMax(rectangleList, c1);
        findMax(rectangleList, c2);

    }
}
