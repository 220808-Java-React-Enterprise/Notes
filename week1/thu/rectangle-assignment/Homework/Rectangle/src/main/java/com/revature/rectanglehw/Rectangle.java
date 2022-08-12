package com.revature.rectanglehw;

public class Rectangle {
    private String name;
    private int length;
    private int width;

    /*
    Constructor including setter constructors
    */
    public Rectangle() {
    }

    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }
    /*
    Getters
     */
    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    /*
    Setters
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    /*
    Get's object area.
     */
    public int getArea(){
        return this.length * this.width;
    }
    /*
    Get's objects perimeter.
     */
    public int getPerimeter(){
        return (2*this.length) + (2*this.width);
    }

    @Override
    public String toString() {
        return "Rectangle is called " + name + " has a length of: " + length + " a width of: " + width + " an area of: " + this.getArea() + " and a perimeter of: " + this.getPerimeter() + ".";
    }
}
