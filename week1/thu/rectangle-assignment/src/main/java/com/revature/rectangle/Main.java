import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"Rectangle","Not a Square","Parallelogram","Rhombus",
                "Kite","Definitely not a Circle", "Not 3D","For Sure a Shape","Out of Ideas","Spent to Long on Names"};
        List<Rectangle> myList = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++){
            Rectangle temp = new Rectangle(names[i], r.nextInt(100) + 1, r.nextInt(100) + 1);
            myList.add(temp);
            System.out.println(temp.toString());
        }

        Area area = new Area();
        System.out.print("\nMax Area: " + findMax(area,myList).toString());

//        System.out.println("\n");
//        myList = new ArrayList<>();
//        for (int i = 0; i < 10; i++){
//            Rectangle temp = new Rectangle(names[i], r.nextInt(100) + 1, r.nextInt(100) + 1);
//            myList.add(temp);
//            System.out.println(temp.toString());
//        }

        Perimeter perm = new Perimeter();
        System.out.println("\nMax Perimeter: " + findMax(perm,myList).toString());
    }

    public static Rectangle findMax(Comparator comp, List<Rectangle> ls){
        Rectangle max = ls.get(0);

        for (int i = 1; i < ls.size(); i++){
            if (comp.isLessThan(max,ls.get(i)))
                max = ls.get(i);
        }

        return max;
    }
}
