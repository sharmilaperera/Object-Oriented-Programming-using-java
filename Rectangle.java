
package com.mycompany.calculate;
public class Rectangle implements Shape
{
   private int length,width,perimeter;
   private double area;
   
   public void setlength(int length)
   {
       this.length=length;
   }
   public void setwidth(int width)
   {
       this.width=width;
   }
   public int getlength()
   {
       return length;
   }
   public int getwidth()
   {
       return width;
   }
   
   @Override
   public double calculateArea()
   {
       area=length*width;
       return area;
   }
    @Override
   public double calculatePerimeter()
   {
       perimeter=(2*length)*(2*width);
       return perimeter;
   }
}
