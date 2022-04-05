package Shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape1 = new Rectangle(4, 5);
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape1.getArea());

        Measurable myShape2 = new Square(5);
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
