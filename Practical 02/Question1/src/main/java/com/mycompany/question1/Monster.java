
package com.mycompany.Question1;
public class Monster extends Item
{
    //constructoe method for the monster class
    public Monster(int a, String b)
    {
        //call the constructor of the base class
        super(a, b);
        this.location=a;
        this.description=b;
    
    }
}
