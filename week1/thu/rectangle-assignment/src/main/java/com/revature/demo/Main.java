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

        for (int i = 0; i < rectangles.size(); i++){

            System.out.println(rectangles.get(i));
        }



        private static void findMax(){

            


        }
/*        Rectangle r1 = new Rectangle("Rectangle 1", 10.0, 3.0);
        System.out.println(r1);

        Rectangle r2 = new Rectangle("Rectanle 2", 5.0, 4.0);
        System.out.println(r2);*/

    }

