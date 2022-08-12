public class Rectangle{
    private String name;
    private int length;
    private int width;

    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter();
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
}
