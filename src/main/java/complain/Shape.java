package complain;

public class Shape {
    private double sizeA;
    private double sizeB;
    private double sizeC;

    public Shape(double sizeA, double sizeB, double sizeC) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    public double triangleHeight(){
        return 2 * sizeA / sizeB;
    }

    public double trianglePerimeter(){
        return sizeA + sizeB + sizeC;
    }

    public double triangleArea(){
        return triangleHeight() * sizeB / 2;
    }

    public double ellipseHeight(){
        return Math.pow(sizeA - sizeB, 2) / Math.pow(sizeA + sizeB, 2);
    }

    public double ellipseArea(){
        return Math.PI * sizeA * sizeB;
    }

    public double ellipsePerimeter(){
        double h = ellipseHeight();
        return Math.PI * (sizeA + sizeB) * (1 + (3 * h /(10 + Math.sqrt(4-3  * h))));
    }


}