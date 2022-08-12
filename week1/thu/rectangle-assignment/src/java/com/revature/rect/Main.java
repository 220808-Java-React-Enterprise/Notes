package com.revature.rect;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<List<Rectangle>> findMax(List<Rectangle> rectList) {
        List<Rectangle> maxArea = rectList;
        List<Rectangle> maxPerimeter = rectList;
        while (maxArea.size() > 1) {
            areaCompare compareArea = new areaCompare(maxArea.get(0).getArea(), maxArea.get(1).getArea());
            if (compareArea.isLessThan() == true) {
                maxArea.remove(1);
            } else {
                maxArea.remove(0);
            }
        }
        while (maxPerimeter.size() > 1) {
            perimeterCompare comparePerimeter = new perimeterCompare(maxPerimeter.get(0).getPerimeter(), maxPerimeter.get(1).getPerimeter());
            if (comparePerimeter.isLessThan() == true) {
                maxPerimeter.remove(1);
            } else {
                maxPerimeter.remove(0);
            }
        }
        List<List<Rectangle>> maxValues = new ArrayList<>();
        maxValues.add(maxArea);
        maxValues.add(maxPerimeter);
        return maxValues;
    }

    public static void main(String[] args) {

        //Initialize List for Rectangles
        List<Rectangle> rectList = new ArrayList<>();

        //Generate List of Rectangles
        for (int j=0; j<10; j++) {
            Rectangle r = new Rectangle((String.valueOf(j+1)), (int)(Math.random()*(101)), (int)(Math.random()*(101)));
            rectList.add(r);
        }

        //Display Rectangles
        for (int i=0; i<10; i++) {
            System.out.println(rectList.get(i));
        }

        List<List<Rectangle>> maxValues = findMax(rectList);
        System.out.println("Rectangle number " + maxValues.get(0).get(0).getName() + " has the largest area.");
        System.out.println("Rectangle number " + maxValues.get(1).get(0).getName() + " has the largest perimeter.");


    }


}
