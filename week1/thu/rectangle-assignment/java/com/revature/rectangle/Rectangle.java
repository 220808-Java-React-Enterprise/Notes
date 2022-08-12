package com.revature.rectangle;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Rectangle {
    private String name;
    private int length;
    private int width;

    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public Rectangle(int recIndex) {
        this.name = "Rectangle " + String.valueOf(recIndex);
        this.length = ThreadLocalRandom.current().nextInt(2,11);
        this.width = ThreadLocalRandom.current().nextInt(2,11);
    }

    public int getArea(){
        return (this.length * this.width);
    }

    public int getPerimeter(){
        return (2 * (this.length + this.width));
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
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                "}\n";
    }
}
