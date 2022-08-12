package com.company;

public class Rectangle {
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

    // getter methods
    public String getName() {
        return name;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

    //setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public int getArea(){
        return getLength() * getWidth();
    }

    public int getPerimeter(){
        return (2 + (getLength() + getWidth()));
    }


}
