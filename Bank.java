
package com.mycompany.bank;

public class Bank 
{

    public static void main(String[] args)
    {
        SavingsAccount s1 =new SavingsAccount();
        s1.setbalance(200000);
        s1.calculateInterest();
        
        CheckingAccount c1=new CheckingAccount();
        c1.setbalance(1000000);
        s1.calculateInterest();
        
    }
}
