package shapes;

import util.Import;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.getDouble());

        double userRadius = input.getDouble();

        Circle circle = new Circle(userRadius);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
