package ocp.goodExample;

public class Circle implements Shape {

    public double radius = 5;

    public double calculateArea() {

        return 3.14 * radius * radius;
    }
}