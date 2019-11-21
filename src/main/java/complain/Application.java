package complain;

import nonComplain.Ellipse;
import nonComplain.Triangle;

public class Application {
    public static void main(String[] args){
        Triangle triangle = new Triangle(3,7,9);
        Ellipse ellipse = new Ellipse(10, 20);

        printTriangle(triangle);
        printEllipse(ellipse);
    }


    private static void printTriangle(Triangle triangle) {
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
    }

    private static void printEllipse(Ellipse ellipse) {
        System.out.println(ellipse.area());
        System.out.println(ellipse.perimeter());
    }

}
