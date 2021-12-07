package ocp.goodExample;

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        System.out.println(s.calculateArea());
        s = new Rectangle();
        System.out.println(s.calculateArea());
        s = new Rhombus();
        System.out.println(s.calculateArea());
    }
}
