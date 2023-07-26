
package com.mycompany.question2;
public class Question2
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee("Bogdan", 50000.0, 10000.0);

        // Display Employee information and calculated Bonus Amount
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount());
    }
    }
}
