package liskov;

public class AreaCalculator {
    public double getArea(Shape shape){
        return shape.getArea();
    }

    public static void main(String[] args){
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Square area:" + calculator.getArea(new Square(3)));
    }
}
