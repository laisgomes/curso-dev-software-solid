package liskov;

import nonComplain.Ellipse;
import nonComplain.Triangle;

public class AreaCalculator {
    public double getArea(Rectangle rectangle){
        return rectangle.getLength() * rectangle.getWidth();
    }

    public static void main(String[] args){
        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(3);
        rectangle.setWidth(2);

        System.out.println("Rectangle area:" + calculator.getArea(rectangle));

        Square square = new Square();
        square.setWidth(2);
        square.setLength(3);
        System.out.println("Rectangle area:" + calculator.getArea(rectangle));
    }
}
