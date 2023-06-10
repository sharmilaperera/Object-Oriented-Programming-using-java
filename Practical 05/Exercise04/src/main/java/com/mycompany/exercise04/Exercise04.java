
package com.mycompany.exercise04;

public class Exercise04 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double circleArea = circle.calculateArea();
        System.out.println("Circle Area: " + circleArea);
        circle.display();
        
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);
        rectangle.display();
    }
}
