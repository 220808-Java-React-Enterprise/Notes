package com.revature.rectangle.ui;

import com.revature.rectangle.models.CompareArea;
import com.revature.rectangle.models.ComparePerimeter;
import com.revature.rectangle.models.Rectangle;
import com.revature.rectangle.models.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Rectangle> listRectangle = new ArrayList<>();

        for(int i = 0; i<=10; i++){
            Rectangle rectangle = new Rectangle("Rectangle" + i, (int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
            listRectangle.add(rectangle);
        }
        for (Rectangle rectangle: listRectangle){
            System.out.println(rectangle);
        }
        System.out.println("\nRectangle max area: " + new Rectangle().findMaxArea(listRectangle, new CompareArea()));
        System.out.println("\nRectangle max perimeter: " + new Rectangle().findMaxPerimeter(listRectangle, new ComparePerimeter()));
    }

    }

