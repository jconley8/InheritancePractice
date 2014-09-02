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
public class SalariedEmployee implements Employee {

    private final int BI_WEEKLY = 2;
    private final int FORTY_HOURS = 40;
    private String firstName;
    private String lastName;
    private int employeeId;
    private String department;

    private final int MONTHS_IN_YEAR = 12;
    private int salaryAmount;

    public SalariedEmployee(String firstName, String lastName, int employeeId, String department, int salaryAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.department = department;
        this.salaryAmount = salaryAmount;
    }
    
    @Override
    public double calculateBiWeeklyPay () {
        return (salaryAmount / MONTHS_IN_YEAR) / BI_WEEKLY;
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

    @Override
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
    
    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
    
    
}
