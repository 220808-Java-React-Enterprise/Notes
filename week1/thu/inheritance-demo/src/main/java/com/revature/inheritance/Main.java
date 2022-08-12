package com.revature.inheritance;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    findMAX();
    }

    public static String findMAX(){
        Scanner input = new Scanner(System.in);
        int i;
        ArrayList<Rectangle> rectangleList = new ArrayList();
        int length;
        int width;
        for(i=0;i<10;i++){
            System.out.println("Enter a random integer: ");
            length = input.nextInt();
            System.out.println("Enter another random integer: ");
            width = input.nextInt();
            rectangleList.add(new Rectangle("rectangle",length, width));


        }
        System.out.println(rectangleList);

        int ar = 0;
        int per = 0;

        int x;
        for(x=0;x<rectangleList.size();x++){
           Rectangle r1 = rectangleList.get(x);
           if(r1.findArea(r1) > ar){
               ar = r1.findArea(r1);
           }
           if(r1.findPerimeter(r1) > per){
               per = r1.findPerimeter(r1);
           }


        }
        return "The largest area is "+ar+" and the largest perimeter is "+per;
    }
}
