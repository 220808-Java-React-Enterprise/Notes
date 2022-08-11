package com.revature.demo;

public class Rectangles  extends Object{

    private String name;
    private double length;
    private double width;
    private double area;

    private double perimeter;

    public Rectangles(){

    }

    public Rectangles(String name, double length, double width, double area, double perimeter) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Rectangles(String s, double v, double v1) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Rectangles{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
