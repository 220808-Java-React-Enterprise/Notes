package com.revature.rectangle.models;

public class CompareArea {

    public boolean isLessThan(Rectangle r1, Rectangle r2){
            if(r1.getArea() > r2.getArea()){
                return true;
            }else{
                return false;
            }

        }
    }

