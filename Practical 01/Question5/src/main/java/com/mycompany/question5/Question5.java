
package com.mycompany.question5;

public class Question5
{
    public static void main(String[] args)
    {
       char grade = 'A';

        switch(grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

        System.out.println("Your grade is " + grade); 
    }
}

/*
Excellent!
Your grade is A
*/

/* after removing the "break" in the 13 line the output is :
Excellent!
You passed
Your grade is A
*/
