package com.revature.rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        CompareArea ca = new CompareArea();
        ComparePerimeter cp = new ComparePerimeter();
        Random rand = new Random();
        List<Rectangle> rectangleList = new ArrayList<>();
        List<Integer> listArea = new ArrayList<>();
        List<Integer> listPerimeter = new ArrayList<>();

        //my testing
        /*Rectangle r1 = new Rectangle("Little guy", 10, 5);
        System.out.println(r1.toString());
        System.out.println(r1.getName() + "'s perimeter = " + r1.getPerimeter());
        System.out.println(r1.getName() + "'s area = " + r1.getArea());

        Rectangle r2 = new Rectangle("Chowsky", 20, 15);
        System.out.println(r2.toString());
        System.out.println(r2.getName() + "'s perimeter = " + r2.getPerimeter());
        System.out.println(r2.getName() + "'s area = " + r2.getArea());

        System.out.println("Is " + r1.getName() + "'s area less than + " + r2.getName() + "? " +ca.isLessThan(r1,r2));

        System.out.println("Is " + r1.getName() + "'s perimeter less than + " + r2.getName() + "? " +cp.isLessThan(r1,r2));
        System.out.println("\n");*/

        //Assignment
        //Create list of Rectangles
        for (int i = 0; i < 10; i++) {
            int length = rand.nextInt(100) + 1;
            int width = rand.nextInt(100) + 1;
            String name = "R" + String.valueOf(i+1);
            Rectangle temp = new Rectangle(name, length, width);
            rectangleList.add(temp);

            System.out.println(temp.toString());
        }
        System.out.println();

        //Create listArea and listPerimeter
        for (int i = 0; i< rectangleList.size(); i++){
            listArea.add(rectangleList.get(i).getArea());
            listPerimeter.add(rectangleList.get(i).getPerimeter());
        }

        int maxArea = findMax(listArea);
        int maxPerimeter = findMax(listPerimeter);
        String maxARec = "";
        String maxPRec = "";

        for (int i = 0; i< rectangleList.size(); i++){
            if(rectangleList.get(i).getArea() == maxArea){
                maxARec = rectangleList.get(i).getName();
            }
            if(rectangleList.get(i).getPerimeter() == maxPerimeter){
                maxPRec = rectangleList.get(i).getName();
            }
        }

        System.out.println("And the Rectangle with the largest Area is....." + maxARec + "!!! \n" +
                "At a whopping Area of " + maxArea + "!!! Congrats!!\n");
        System.out.println("And the Rectangle with the largest Perimeter is....." + maxPRec + "!!! \n" +
                "At a whopping Perimeter of " + maxPerimeter + "!!! Congrats!!\n");

    }

    public static int findMax(List<Integer> list){
        int max = 0;

        for (int i = 0; i < list.size(); i++){
            if(list.get(i)> max){
                max = list.get(i);
            }
        }
        return max;
    }
}
