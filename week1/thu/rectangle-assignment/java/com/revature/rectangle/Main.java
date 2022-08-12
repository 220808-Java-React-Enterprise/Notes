package com.revature.rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void  main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<Rectangle>();
        for (int i = 0; i < 10; i++){
            rectangleList.add(new Rectangle(i));
        }
        System.out.println(rectangleList);

        // Find max Area
        findMax(rectangleList, "area");
        findMax(rectangleList, "perimeter");


    }

    public static Rectangle findMax(List<Rectangle> rectangleList, String type){
        int largest = 0;
        if (type == "area") {
            for (int i = 1; i < rectangleList.size(); i++) {
                if (new ComparePerimeter().isLessThan(rectangleList.get(largest),rectangleList.get(i))) {
                    largest = i;
                }
            }
        }
        else if(type == "perimeter"){
            for (int i = 1; i < rectangleList.size(); i++) {
                if (new CompareArea().isLessThan(rectangleList.get(largest),rectangleList.get(i))) {
                    largest = i;
                }
            }
        }
        System.out.println("The Rectangle with the largest "+ type + " is " + rectangleList.get(largest).getName());
        return rectangleList.get(largest);
    }

}
