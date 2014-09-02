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
public class HourlyEmployee extends Employee {
    
    private final int FORTY_HOURS = 40;
    private double payRate;
    private int hoursWorked;

    public HourlyEmployee(double payRate, int hoursWorked) {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    private double calculateBiWeeklyPay (double payRate, int hoursWorked) {
        double amountEarned;
        double overTimeHours;
        
        if (hoursWorked <= FORTY_HOURS) {
            amountEarned = payRate * hoursWorked;
        }
        else {
            overTimeHours = hoursWorked - 40;
            amountEarned = ((payRate * FORTY_HOURS) + ((payRate * 1.5) * overTimeHours));            
        }
        
        return amountEarned;            
    }
    
    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }    
    
    
    
}
