/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Josh
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double biWeeklyCommissionEarned;

    public SalaryPlusCommissionEmployee(String firstName, String lastName, int employeeId, String department, double biWeeklyCommissionEarned, int salaryAmount) {
        super(firstName, lastName, employeeId, department, salaryAmount);
        this.biWeeklyCommissionEarned = biWeeklyCommissionEarned;
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
