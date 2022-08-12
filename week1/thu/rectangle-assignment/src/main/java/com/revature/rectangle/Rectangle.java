package com.revature.rectangle;

public class Rectangle {
    private String name;
    private int length;
    private int width;

    public int Perimeter(){
        return 2 * length + 2 * width;
    }

    public int Area(){
        return length * width;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;

    }
}
