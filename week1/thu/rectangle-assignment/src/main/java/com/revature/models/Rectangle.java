package com.revature.models;

public class Rectangle {
    public String name;
    public int height;
    public int width;

    // Constructors

    public Rectangle() {

    }

    public Rectangle(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;

    }

    public Rectangle (int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        int area = height * width;
        return area;
    }

    public int getPerimeter() {
        int perimeter = (2 * height) + (2 * width);
        return perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
