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
    
    private double biWeeklyCommissionEarned;

    public SalaryPlusCommissionEmployee(String firstName, String lastName, int employeeId, String department, double monthlyCommissionEarned, int salaryAmount) {
        super(firstName, lastName, employeeId, department, salaryAmount);
        this.biWeeklyCommissionEarned = monthlyCommissionEarned;
    }

    public double calculateBiWeeklyPayWithCommission() {
        return calculateBiWeeklyPay() + biWeeklyCommissionEarned;
    }
    
    public double getCommissionEarned() {
        return biWeeklyCommissionEarned;
    }

    public void setCommissionEarned(double commissionEarned) {
        this.biWeeklyCommissionEarned = commissionEarned;
    }
    
    
    
}
