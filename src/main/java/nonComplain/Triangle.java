package nonComplain;

public class Triangle {

    private double sizeA;
    private double sizeB;
    private double sizeC;
    private double height;


    public Triangle(double sizeA, double sizeB, double sizeC) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
        this.height = 2 * sizeA / sizeB;
    }

    public double perimeter() {
        return sizeA + sizeB + sizeC;
    }

    public double area() {
        return height * sizeB / 2;
    }

}
