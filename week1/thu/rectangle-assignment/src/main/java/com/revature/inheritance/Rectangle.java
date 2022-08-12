package com.revature.inheritance;

import java.lang.reflect.Constructor;
import java.util.Comparator;

public class Rectangle implements Comparator<Rectangle> {
    // name, length and width
    private String name;
    private int length;
    private int width;

//    Constructor with three arguments to set the name, length and width of the rectangle object.
//    Getter and setter methods for the name, length and the width.
//    Get area and get perimeter functions.


    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public int compare(Rectangle rec1, Rectangle rec2) {
        return rec1.getArea() - rec2.getArea();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                '}';
    }
} // end Rectangle class
