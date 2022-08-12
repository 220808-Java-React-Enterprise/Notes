package rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //findMax method

    Rectangle findMax(Comparator c, List<Rectangle> recList) {
        Rectangle max = recList.get(0);
        for (Rectangle reg : recList) {
            for (int i = 0; i < recList.size(); i++) {
                System.out.println(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        ArrayList<Rectangle> recList = new ArrayList<Rectangle>();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Max area: " + i);
        }


    }
}
