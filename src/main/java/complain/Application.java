package complain;

import nonComplain.Ellipse;
import nonComplain.Shape;
import nonComplain.Triangle;

public class Application {
    public static void main(String[] args){
        Triangle triangle = new Triangle(3,7,9);
        Ellipse ellipse = new Ellipse(10, 20);

        printShape(triangle);
        printShape(ellipse);
    }

    private static void printShape(Shape shape) {
        System.out.println(shape.area());
        System.out.println(shape.perimeter());
    }

}
