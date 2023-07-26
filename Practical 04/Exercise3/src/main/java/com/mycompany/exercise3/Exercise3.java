
package com.mycompany.exercise3;
public class Exercise3
{
    public static void main(String[] args)
    {
      Student student = new Student();
        student.setName("John Doe");
        student.setID(12345);
        student.setCourse("Computer Science");

        // Create a Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Dr. Jane Smith");
        lecturer.setID(98765);
        lecturer.setProgramme("Data Science");

        // Print the details of the student and lecturer
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Course: " + student.getCourse());

        System.out.println("\nLecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getID());
        System.out.println("Programme: " + lecturer.getProgramme());
    }  
    
}
