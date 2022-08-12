package src.main.java.com.revature.rect.rectangle;

public class Rectangle {
    private String name;
    private int length, width;

    public Rectangle(){
    }

    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public static int getArea(int l, int w){
        //Area = length x width
        int area = l * w;

        return area;
    }

    public static int getPerimeter(int l, int w){
        //perimeter = 2(l+w)
        int perimeter = 2*(l + w);

        return perimeter;
    }
}
