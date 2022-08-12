package com.revature.inheritance;

public class Rectangle {
    public String name;
    public int length, width;


    public Rectangle(){
        this.name = "name";
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(String n, int l, int w){
        this.name = n;
        this.length = l;
        this.width = w;
    }

    public String getName(){
        return name;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int findArea(Rectangle r){
        int area = this.length * this.width;

        return area;
    }

    public int findPerimeter(Rectangle r){
        int perimeter = (this.length*2)+(this.width*2);

        return perimeter;
    }
}
