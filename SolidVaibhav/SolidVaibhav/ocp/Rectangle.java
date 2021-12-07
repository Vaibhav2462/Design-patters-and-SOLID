package ocp.goodExample;

public class Rectangle implements Shape {

    double length = 5;
    double width= 10;

    public double calculateArea() {

        return length * width;
    }
}