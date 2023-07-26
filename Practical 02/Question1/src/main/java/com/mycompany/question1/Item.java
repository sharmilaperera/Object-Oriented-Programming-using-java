
package com.mycompany.Question1;

public class Item 
{
    //protected instance variables
    protected int location;
    protected String description;
    
    //constructor method
    public Item(int a,String b)
    {
        location=a;
        description=b;
    }
    
    //Getter method for location
    public int getlocation()
    {
        return location;
    }
    
    //setter method foe location
    public void setlocation(int a)
    {
        location=a;
    }
    
    //getter method for description
    public String grtdescription()
    {
        return description;
    }
    
    //setter method gor description
    public void setdescripyion(String b)
    {
        description=b;
    }
    
    
}
