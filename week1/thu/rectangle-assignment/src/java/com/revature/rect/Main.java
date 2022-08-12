package com.revature.rect;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Rectangle> findMax(List<Rectangle> rectList, int type) {
        List<Rectangle> maxOut = rectList;

        if (type==1) {
            while (maxOut.size() > 1) {
                areaCompare compareArea = new areaCompare(maxOut.get(0).getArea(), maxOut.get(1).getArea());
                if (compareArea.isLessThan() == true) {
                    maxOut.remove(1);
                } else {
                    maxOut.remove(0);
                }
            }
        } else if (type==2) {
            while (maxOut.size() > 1) {
                perimeterCompare comparePerimeter = new perimeterCompare(maxOut.get(0).getPerimeter(), maxOut.get(1).getPerimeter());
                if (comparePerimeter.isLessThan() == true) {
                    maxOut.remove(1);
                } else {
                    maxOut.remove(0);
                }
            }
        }



        //System.out.println(maxPerimeter);
        return maxOut;
    }

    public static void main(String[] args) {

        //Initialize List for Rectangles
        List<Rectangle> rectList = new ArrayList<>();

        //Generate List of Rectangles
        for (int j=0; j<10; j++) {
            Rectangle r = new Rectangle((String.valueOf(j+1)), (int)(Math.random()*(11)), (int)(Math.random()*(11)));
            rectList.add(r);
        }

        //Display Rectangles
        for (int i=0; i<10; i++) {
            System.out.println(rectList.get(i));
        }

        List<Rectangle> maxArea = findMax(rectList, 1);
        //System.out.println(maxArea);
        List<Rectangle> maxPerimeter = findMax(rectList, 2);
        //System.out.println(maxPerimeter);
        System.out.println("Rectangle number " + maxArea.get(0).getName() + " has the largest area.");
        System.out.println("Rectangle number " + maxPerimeter.get(0).getName() + " has the largest perimeter.");


    }


}
