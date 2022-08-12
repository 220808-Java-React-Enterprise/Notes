package com.revature.rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main {
    public static void findMax(List<Rectangle> list, Comparator comp){
        Rectangle max = null;
        for(Rectangle obj : list){
            if(max == null){
                max = obj;
            }
            else if(comp.isLessThan(max, obj)) {
                max = obj;
            }
        }

        System.out.println(comp.getType() + " - " + max);

    }

    public static void main(String[] args){
        List<Rectangle> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++){
            Rectangle r = new Rectangle(Character.toString((char) (i + 'a')), rand.nextInt(20), rand.nextInt(20));
            list.add(r);
            System.out.println(r);
        }

        findMax(list, new ComparatorArea());
        findMax(list, new ComparatorPerimeter());


    }
}
