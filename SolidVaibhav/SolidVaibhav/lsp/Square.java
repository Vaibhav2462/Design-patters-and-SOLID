package lsp;

public class Square extends ShapeAbstract{
    int side;
    public Square(int side){
        this.side = side;
    }
    public int calculateArea(){
        return this.side * this.side;
    }
}
