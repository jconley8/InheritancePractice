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
public class HourlyEmployee implements Employee {
    
    private final int FORTY_HOURS = 40;
    private String firstName;
    private String lastName;
    private int employeeId;
    private String department;

    private double payRate;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, int employeeId, String department, double payRate, int hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculateBiWeeklyPay () {
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

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
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
