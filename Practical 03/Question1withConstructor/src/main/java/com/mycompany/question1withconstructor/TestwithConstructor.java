
package com.mycompany.question1withconstructor;
public class TestwithConstructor
{
    private String name;
    private int age;
    private float salary;
    
    public TestwithConstructor(String name,int age,float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }
    
}
