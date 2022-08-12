package com.revature.retangleassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Getting user input for total number of rectangles.
        int totalRectangles = 10;

       /* Testing
       System.out.println("How many rectangles would you like to generate?" +
                "\nEnter: ");
        totalRectangles = new Scanner(System.in).nextInt();
        */



        //Creating rectangles and adding rectangles to list
        List<Rectangle> list = new ArrayList<>();

        for(int i = 0; i < totalRectangles ; i++) {

            String rName = "Rectangle " + i;
            int rLength = (int) (Math.random() * 10);
            int rWidth = (int) (Math.random() * 10);

            if( rWidth == rLength ) { rName = "Square " + i; }

            list.add( new Rectangle( rName, rLength, rWidth ) );

        }

        //Printing rectangles to console
        for(Rectangle r: list) {

            System.out.println(r);

        }

        //Calling findMax function
        findMax(list);


    }

    public static void findMax(List<Rectangle> list) {

        //Instantiating area and perimeter comparators.
        AreaComparator compareArea = new AreaComparator();
        PerimeterComparator comparePerimeter = new PerimeterComparator();

        //Finding rectangle with the largest area.
        int mAIndex = 0;
        for( int i = 0; i < list.size() - 1; i++ ) {

            Rectangle r1 = list.get( mAIndex );
            Rectangle r2 =list.get( i );
            boolean checkArea = compareArea.isLessThan( r1 , r2 );
            if(checkArea) { mAIndex = i; }

        }


        //Finding rectangle with the largest perimeter.
        int mPIndex = 0;
        for( int i = 0; i < list.size() - 1; i++ ) {

            Rectangle r1 = list.get( mPIndex );
            Rectangle r2 = list.get( i );
            boolean checkPerimeter = comparePerimeter.isLessThan( r1 , r2 );
            if(checkPerimeter) { mPIndex = i; }

        }

        //Printing out largest rectangles.
        System.out.println();
        System.out.println( "Largest Area:\t" + list.get(mAIndex));
        System.out.println( "Largest Perimeter:\t" + list.get(mPIndex));


    }
}
