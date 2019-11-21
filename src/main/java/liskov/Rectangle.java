package liskov;

public class Rectangle {

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
