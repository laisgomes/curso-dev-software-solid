package nonComplain;

public class Ellipse implements Shape {

    private double sizeA;
    private double sizeB;
    private double height;

    public Ellipse(double sizeA, double sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.height = Math.pow(sizeA - sizeB, 2) / Math.pow(sizeA + sizeB, 2);
    }

    public double area() {
        return Math.PI * sizeA * sizeB;
    }

    public double perimeter() {
        return Math.PI * (sizeA + sizeB) * (1 + (3 * height / (10 + Math.sqrt(4 - 3 * height))));
    }
}
