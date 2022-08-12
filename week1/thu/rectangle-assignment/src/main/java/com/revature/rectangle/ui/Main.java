package com.revature.rectangle.ui;

import com.revature.rectangle.models.CompareArea;
import com.revature.rectangle.models.ComparePerimeter;
import com.revature.rectangle.models.Rectangle;
import com.revature.rectangle.models.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle("r1", 1, 2);
        Rectangle r2 = new Rectangle("r1", 3, 5);
        Rectangle r3 = new Rectangle("r1", 10, 2);
        Rectangle r4 = new Rectangle("r1", 54, 2);
        Rectangle r5 = new Rectangle("r1", 100, 20);
        Rectangle r6 = new Rectangle("r1", 10, 25);
        Rectangle r7 = new Rectangle("r1", 13, 20);
        Rectangle r8 = new Rectangle("r1", 200, 2);
        Rectangle r9 = new Rectangle("r1", 140, 4);
        Rectangle r10 = new Rectangle("r1", 34, 7);

        List<Rectangle> listRectangle = new ArrayList<>();
        listRectangle.add(r1);
        listRectangle.add(r2);
        listRectangle.add(r3);
        listRectangle.add(r4);
        listRectangle.add(r5);
        listRectangle.add(r6);
        listRectangle.add(r7);
        listRectangle.add(r8);
        listRectangle.add(r9);
        listRectangle.add(r10);

        System.out.println("My rectangle List!!");
        for (int i=0; i<listRectangle.size(); i++){
            Rectangle rectangle = listRectangle.get(i);
            System.out.println(rectangle);
        }

        CompareArea compareArea = new CompareArea();
        ComparePerimeter comparePerimeter = new ComparePerimeter();

        System.out.println("");

        List<Rectangle> listSort = new ArrayList<>();
        for(int i = 0; i<listRectangle.size();i++){


            }
        }

    }

