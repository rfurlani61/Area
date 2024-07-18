package application;

import entities.Circle;
import entities.Rectangle;
import entities.AbstractShape;
import entities.enums.Color;
import org.w3c.dom.ls.LSOutput;

public class Program {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.RED, 3.0, 4.0);
        System.out.println("Circle color:" + s1.getColor());
        System.out.println("Circle area:" + s1.area());
        System.out.println("Rectangle color:" + s2.getColor());
        System.out.println("Circle color:" + s2.area());
    }
}
