package com.revature.models;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setHeight(5);
        r.setWidth(3);

        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
