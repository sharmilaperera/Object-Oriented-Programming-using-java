
package com.mycompany.question4;
public class Question4 
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) 
        {
            if (x == 30)
            {
                break;    //continue
            }

            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");
    
    }
}


/* Output

10
20
I'm out of the Loop now

*/

/* After replacing "continue" for "break",the output results are

10
20
40
50
I'm out of the Loop now

*/

