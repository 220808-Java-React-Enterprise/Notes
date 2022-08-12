public class Rectangle {
    int width;
    int length;
    String name;

    public Rectangle() {
    }

    public Rectangle(int width, int length, String name) {
        this.width = width;
        this.length = length;
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea()
    {
      return  this.length*this.width;

    }

    public int getPerimeter()
    {
        return (2*this.length + (2*this.width));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
