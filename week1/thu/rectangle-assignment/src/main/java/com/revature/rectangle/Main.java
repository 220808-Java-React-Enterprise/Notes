package com.revature.rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    static Rectangle findMax(Comparator c, List<Rectangle> list) {
        Rectangle max = list.get(0);
        for (Rectangle r : list) {
            if(c.isLessThen(max, r)) max = r;
        }
        return max;
    }

    public static void main(String[] args) {
        List<Rectangle> rects = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 1; i <= 10; i++) {
            rects.add(new Rectangle("Rect " + i, rnd.nextInt(20) + 1, rnd.nextInt(20) + 1));
        }
        for (Rectangle r : rects) {
            System.out.println(r);
        }
        System.out.println("MaxArea: " + findMax(new AreaComparator(), rects));
        System.out.println("MaxPerimeter: " + findMax(new PerimeterComparator(), rects));
    }
}
