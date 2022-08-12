package com.revature.rect;

public class areaCompare {

    private int rect1;
    private int rect2;

    public areaCompare(Rectangle rectangle, Rectangle rectangle1) {

    }

    public areaCompare(int rect1, int rect2) {
        this.rect1 = rect1;
        this.rect2 = rect2;
    }

    public boolean isLessThan() {
        boolean compared = (rect1>rect2);
        return compared;
    }

}
