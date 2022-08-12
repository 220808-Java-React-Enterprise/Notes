package com.revature.retangleassignment;

public class Rectangle {

    //DATA FIELDS
    private String name;
    private int length;
    private int width;

    //CONSTRUCTORS
    public Rectangle() {
    }
    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    //GETTERS and SETTERS
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

    //METHODS
    public int getArea() { return this.length * this.width; }

    public int getPerimeter() { return 2 * (this.length + this.width); }

    //toString
    @Override
    public String toString() {
        return  name + ": " +
                "length = " + length +
                ", width = " + width ;
    }
}
