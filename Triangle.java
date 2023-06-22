
package com.mycompany.calculate;
public class Triangle implements Shape
{
    private int base,height,s1,s2,perimeter;
    private double area;
    public void setbase(int base)
    {
        this.base=base;
    }
    public void setheight(int height){
        this.height=height;
    }
    public void setside1(int s1)
    {
        this.s1=s1;
    }
    public void setside2(int s2)
    {
        this.s2=s2;
    }
    public int getbase()
    {
        return base;
    }
    public int getheight()
    {
        return height;
    }
    public int getside1()
    {
        return s1;
    }
    public int getside2()
    {
        return s2;
    }
    
    @Override
    public double calculateArea()
    {
        area=(base*height)/2;
        return area;
    }
    @Override
    public double calculatePerimeter()
    {
        perimeter=base+s1+s2;
        return perimeter;
    }
    
       
}
