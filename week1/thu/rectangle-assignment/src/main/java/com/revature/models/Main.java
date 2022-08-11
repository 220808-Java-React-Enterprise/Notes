package com.revature.models;

import java.awt.geom.Area;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setHeight(5);
        r.setWidth(3);

        Rectangle s = new Rectangle(4,6);

        AreaCompare compare = new AreaCompare();

        System.out.println(compare.isLessThan(r,s));

    }
}
