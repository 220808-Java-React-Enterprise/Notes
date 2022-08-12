package src.main.java.com.revature.rect.rectangle;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //find the largest rectangle by area and display the result
        ComparatorByArea comparatorByArea = new ComparatorByArea();
        comparatorByArea.findMax(-1,-5);

        //find the largest rectangle by perimeter and display the result
        ComparatorByPerimeter comparatorByPerimeter = new ComparatorByPerimeter();
        comparatorByPerimeter.findMax(10,0);

        //create ten random rectangle objects and add them to a list
        //Display a list of all the rectangles (one rectangle per line)
        findMax(0,0);
    }

    //function compares two numbers and return maximum value
    //if both values are zeros, then create rectangle objs
    //and display a list of rectangle obj values per line
    public static void findMax(int value1, int value2){
        int maxValue = 0;
        boolean maxValueExist = false;

        int[][] mArray = new int[10][2]; // obj to hold random length and height values
        //Integer[][] mArray = new Integer[10][2];

        //check input values for zeros
        if (value1 == 0 && value2 == 0){
            int l = 0;
            int w = 0;
            //List<int[][]> list = new ArrayList<>(); // to hold mArray values
            int length_position = 0; //length index - all l values are place at o index
            int width_position = 1; // height index - all h values are place at o index

            for (int i = 0; i < 10; i++){
                l = (int)((Math.random()*20)+1); //random length fr 1 to 20
                w = (int)((Math.random()*50)+21); //random height fr 21 to 50
                mArray[i][length_position] = l;
                mArray[i][width_position] = w;
                //list.add(i, mArray);
                System.out.print(mArray[i][length_position] + " ");
                System.out.print(mArray[i][width_position] + " \n");
            }
        } else {
            maxValue = Math.max(value1, value2);
            maxValueExist = true;
        }

        //System.out.println(list.get(0)[0][0]);

        if (maxValueExist){
            System.out.println("Largest value: " + maxValue);
        } else {
            System.out.println(Arrays.deepToString(mArray));
        }
    }

}
