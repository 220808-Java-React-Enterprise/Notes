import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args)
    {
        //Names Stored in Array and While C
        String[] name={"Ruby","Sapphire", "Diamond","Amber","Amethyst","Emerald","Garnet","Jade"} ;

        //name counter outside of While loop that generates and adds Rectangles to RecList
        int amount=0;
ArrayList<Rectangle>recList=new ArrayList<>();

while(amount<10)
{
    amount++;
    Random width=new Random();
    Random length=new Random();
    Random namer=new Random();

            recList.add(new Rectangle(width.nextInt(20-1)+1, length.nextInt(20-1)+1,name[namer.nextInt(name.length)] ));
}

        for(Rectangle rec:recList)
        {
           System.out.println(rec.toString());
        }

        //Compare
        Comparator area=new CompareArea();
        Comparator perimeter=new ComparePerimeter();
            //static method because static cannot call instance



        findMax(recList,area);
        findMax(recList,perimeter);


    }

   public static void findMax(ArrayList<Rectangle> rectangle, Comparator compare)
    {
        int i=0;
        Rectangle chadRectangle=rectangle.get(0);
        for(i=0;i<rectangle.size()-1;i++) {
            if (compare.isLessThan(chadRectangle, rectangle.get(i + 1)))
                chadRectangle = rectangle.get(i+1);
        }

        //BadPractice to use instanceOf but use it for KISS principle
if (compare instanceof CompareArea)
System.out.println("AreaChad incoming! LOOK it's " + chadRectangle.toString());

if (compare instanceof ComparePerimeter)
    System.out.println("PerimeterChad incoming! LOOK it's " + chadRectangle.toString());
    }


}
