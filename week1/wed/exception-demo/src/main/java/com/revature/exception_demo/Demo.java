package com.revature.exception_demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public void start() {
        /* An exception is an unwanted event that can disrupt the flow of our program. */
        /* This will throw an exception because you cannot convert a string animal into an integer. */

        int num = 0;
        int[] arr = {1, 2, 3, 4, 5};
        String willThrowException = "animal"; // Converting this into an integer will throw an exception.
        String willNotThrowException = "123"; // This is a valid conversion.

        /* Use a try-catch block to handle exceptions */
        try {
            num = Integer.parseInt(willNotThrowException);
        } catch (NumberFormatException e) {
            System.out.println("Exception thrown!");
        } finally {
            System.out.println("Finally block!");
        }

        System.out.println(num);

        /* We can catch multiple exceptions using multi try-catch blocks */
        try {
            System.out.println("array at index 4: " + arr[4]); // ArrayIndexOutOfBoundException
            num = Integer.parseInt(willThrowException); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException was thrown.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOOOBE was thrown.");
        }
    }
}
