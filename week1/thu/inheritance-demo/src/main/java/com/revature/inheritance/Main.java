package com.revature.inheritance;


import java.util.*;

public class Main{
    public static void main(String[] args) {

        List<Rectangle> rects = new ArrayList<Rectangle>();
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            int length = random.nextInt(30-1) + 1;
            int width = random.nextInt(30-1)+1;
            rects.add(new Rectangle(String.valueOf(i),length,width));
        }

        Rectangle largeArea = findMax(rects,new AreaComparator());
        Rectangle largePerimeter = findMax(rects,new PerimeterComparator());

        System.out.println("Largest Area Rectangle: " + largeArea.toString());
        System.out.println("Largest Perimeter Rectangle: " + largePerimeter.toString());

    }

    public static Rectangle findMax(List<Rectangle> rectList, Comparator comp){
        Rectangle Largest = rectList.get(0);
        for(int i = 1; i < rectList.size();i++){
            if(comp.isLessThan(Largest,rectList.get(i))){
                Largest = rectList.get(i);
            }
        }
        return Largest;
    }


}
