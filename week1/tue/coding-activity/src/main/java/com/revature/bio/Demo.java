package com.revature.demo;

import java.sql.SQLOutput;

/* Start your application! */
public class Demo {

    public void start(){

        int num = 0;
        int [] arr = {1, 2, 3, 4, 5};

        String willThrowException = "animal";
        String willNotThrowException = "123";

        System.out.println(num);

        try {

            num = Integer.parseInt(willThrowException);
        } catch (NumberFormatException e) {
            e.printStackTrace();

        }
        System.out.println(num);


    }
}
