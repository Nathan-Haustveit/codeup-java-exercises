package Shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);

    }
    public int getPerimeter() {
        int side = super.length;
        return 4 * side;
    }
    public int getArea() {
        int side = super.length;
        return side * side;
    }
}
