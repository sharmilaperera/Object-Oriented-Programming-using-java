
package com.mycompany.exercise04;

class Circle extends Shape {
    private final double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

