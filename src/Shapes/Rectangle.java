package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);


    }

//    @Override
//    void setLength(double length) {
//
//    }
//
//    @Override
//    void setWidth(double width) {
//
//    }

    @Override
    public double getPerimeter(double l, double w) {
        return 0;
    }

    @Override
    public double getArea(double l, double w) {
        return 0;
    }

//    protected double length;
//    protected double width;


//}
//
//    public double getPerimeter() {
//        return 2 * (length + width);
//    }
//
//    public double getArea() {
//        return length * width;
//    }
}