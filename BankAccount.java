
package com.mycompany.bank;
public abstract class BankAccount
{
    private int accountNumber;
    private double balance;
    
    public void setName(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    public int getName()
    {
        return accountNumber;
    }
    public double getbalance()
    {
        return balance;
    }
    
    public abstract double calculateInterest();
    
          
}
