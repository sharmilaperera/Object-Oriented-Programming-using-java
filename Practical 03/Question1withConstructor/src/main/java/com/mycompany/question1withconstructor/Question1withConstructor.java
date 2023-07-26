
package com.mycompany.question1withconstructor;
public class Question1withConstructor 
{
    public static void main(String[] args) 
    {
        TestwithConstructor emp = new TestwithConstructor ("John Doe", 30, 50000);

        // Get values using getters
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
    }
}
