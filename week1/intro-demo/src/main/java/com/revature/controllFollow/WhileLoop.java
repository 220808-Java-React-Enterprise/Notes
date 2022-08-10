package com.revature.controllFollow;

public class WhileLoop {
    public static void main(String[] args) {
        int price = 0;
        while (price < 6) {
            if (price > 4) {
                price += 2;
            }
            System.out.println("$" + price);
            price++;
        }

    }


}
