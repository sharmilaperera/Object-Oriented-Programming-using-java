
package com.mycompany.question2;
public class Employee 
{
    private String name;
    private double basicSalary;
    private double bonus;

    // Constructor with bonus parameter
    public Employee(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Method to calculate Bonus Amount
    public double calculateBonusAmount() {
        return basicSalary + bonus;
    }
}
