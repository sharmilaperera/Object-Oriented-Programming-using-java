
package com.mycompany.question1;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter Num1:");
        x=sc.nextInt();
        System.out.println("Enter Num2:");
        y=sc.nextInt();
        
        try
        {
           float z;
           z=x/y;
            System.out.println(z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by 0 error");
        }
        
    }
}
