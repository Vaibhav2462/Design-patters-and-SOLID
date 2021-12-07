package lsp;

import ocp.goodExample.Shape;

public class ClassMain {
    public static void main(String[] args) {
        ShapeAbstract shape1 = new Rectangle(5,6);
        System.out.println(shape1.calculateArea());
        shape1 = new Square(8);
        System.out.println(shape1.calculateArea());
    }
}
