
package com.mycompany.exercise4;
public class Dogs extends Animal 
{
    public static void main(String[] args)
    {
      Animal a = new Animal();
      Mammal m = new Mammal();
      Dogs d = new Dogs();
      System.out.println(a instanceof Animal);
      System.out.println(m instanceof Mammal);
      System.out.println(d instanceof Animal);
   }

    
}
