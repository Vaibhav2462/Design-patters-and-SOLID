package lsp;

public class Rectangle extends ShapeAbstract{
    int height;
    int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public  int calculateArea(){
        return this.length * this.height;
    }
}
