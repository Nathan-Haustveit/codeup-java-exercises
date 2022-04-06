package Shapes;

public class Square extends Quadrilateral implements Measurable {
    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        double side = super.length;
        return 4 * side;
    }

    public double getArea() {
        double side = super.length;
        return side * side;
    }

    @Override
    public double getPerimeter(double l, double w) {
        return 0;
    }

    @Override
    public double getArea(double l, double w) {
        return 0;
    }





//    public Square(double side) {
//        super(side, side);
//
//    }
//

}
