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
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double monthlyCommissionEarned;

    public SalaryPlusCommissionEmployee(String firstName, String lastName, int employeeId, String department, double monthlyCommissionEarned, int salaryAmount) {
        super(firstName, lastName, employeeId, department, salaryAmount);
        this.monthlyCommissionEarned = monthlyCommissionEarned;
    }

    public double calculateMonthlyPayWithCommission() {
        return calculateMonthlyPay() + monthlyCommissionEarned;
    }
    
    public double getCommissionEarned() {
        return monthlyCommissionEarned;
    }

    public void setCommissionEarned(double commissionEarned) {
        this.monthlyCommissionEarned = commissionEarned;
    }
    
    
    
}
