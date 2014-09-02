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
public interface Employee {
    
    public abstract double calculateBiWeeklyPay ();
    
    // Getters and setters    
    public abstract void setFirstName(String firstName);
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract void setLastName(String lastName);
    public abstract int getEmployeeId();
    public abstract void setEmployeeId(int employeeId);
    public abstract String getDepartment();
    public abstract void setDepartment(String department);

}
