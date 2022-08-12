package com.revature.rectangle;

abstract class Comparator {
    public abstract String getType();
    public abstract boolean isLessThan(Rectangle a, Rectangle b);
}
