
package com.mycompany.exercise04;

class Rectangle extends Shape {
    private final double length;
    private final double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculateArea() {
        return length * width;
    }
}

