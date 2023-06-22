
package com.mycompany.bank;
public class CheckingAccount extends BankAccount
{
    private final double interest=0.12;
    double x;

    @Override
    public double calculateInterest() 
    {
         x=getbalance()*interest;
        return x;
    }


}
