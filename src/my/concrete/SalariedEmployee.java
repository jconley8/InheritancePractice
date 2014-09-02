/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Josh
 */
public class SalariedEmployee extends Employee {
    
    private final int MONTHS_IN_YEAR = 12;
    private int salaryAmount;

    public SalariedEmployee(int salaryAmount, String firstName, String lastName, int employeeId, String department) {
        super(firstName, lastName, employeeId, department);
        this.salaryAmount = salaryAmount;
    }
    
    public double calculateMonthlyPay () {
        return salaryAmount / MONTHS_IN_YEAR;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
    
    
}
