
package com.mycompany.calculate;
public class Circle implements Shape
{

    private int radius;
    private double area,perimeter;
    public void setRadius(int radius)
    {
        this.radius=radius;
    }
    public int getradius()
    {
        return radius;
    }
    @Override
    public double calculateArea()
    {
        area=Math.PI*radius*radius;
        return area;
    }
    @Override
    public double calculatePerimeter()
    {
        perimeter=2.0*Math.PI*radius;
        return perimeter;
    }
}
