package com.revature.rectangle.models;

import java.util.List;

public class Rectangle extends Shape{

    private String name;
    private int length;
    private int width;

    public Rectangle() {
    }

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

    @Override
    public int getArea() {
        return (this.length * this.width)/2;
    }

    @Override
    public int getPerimeter() {
         return (2*( this.length) + (2*this.width));
    }

    public Rectangle findMaxArea(List<Rectangle> listRectangle, CompareArea c){
        Rectangle rectangleMaxArea = new Rectangle();
        for (Rectangle r : listRectangle){
            if(c.isLessThan(rectangleMaxArea, r)) rectangleMaxArea = r;

        }
        return rectangleMaxArea;
    }

    public Rectangle findMaxPerimeter(List<Rectangle> listRectangle, ComparePerimeter c){
        Rectangle rectangleMaxPerimeter = new Rectangle();
        for (Rectangle r : listRectangle){
            if(c.isLessThan(rectangleMaxPerimeter, r)) rectangleMaxPerimeter = r;
        }
        return rectangleMaxPerimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
