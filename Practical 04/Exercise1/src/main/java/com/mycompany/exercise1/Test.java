
package com.mycompany.exercise1;
public class Test
{
     public static void main(String[] args) 
    {
        // Create Employee objects
        Employee bogdan = new Employee();
        Employee bird = new Employee();

        // Set values for Mr. Bogdan using setters
        bogdan.setempID(101);
        bogdan.setempName("Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        // Set values for Ms. Bird using setters
        bird.setempID(102);
        bird.setempName("Ms. Bird");
        bird.setEmpDesignation("Data Scientist");

        // Print the details using getters
        System.out.println("Mr. Bogdan Details:");
        System.out.println("Employee ID: " + bogdan.getempID());
        System.out.println("Employee Name: " + bogdan.getempName());
        System.out.println("Employee Designation: " + bogdan.getempDesignation());

        System.out.println("\nMs. Bird Details:");
        System.out.println("Employee ID: " + bird.getempID());
        System.out.println("Employee Name: " + bird.getempName());
        System.out.println("Employee Designation: " + bird.getempDesignation());
    }

}
