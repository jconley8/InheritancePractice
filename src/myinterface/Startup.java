/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

import my.concrete.*;

/**
 *
 * @author Josh
 */
public class Startup {
    
    public static void main(String[] args) {
        HourlyEmployee hourlyEmp = new HourlyEmployee("Joshua", "Conley", 47329, "IT", 25, 40);
        SalaryPlusCommissionEmployee SalaryCommissionEmp = new SalaryPlusCommissionEmployee("George", "Boggs", 95539, "Marketing", 850, 75000);
        
        System.out.println("Employee: " + hourlyEmp.getFirstName() + " " + hourlyEmp.getLastName() +
                           "\nMonthly Pay: $" + hourlyEmp.calculateBiWeeklyPay());
        
        System.out.println("\nEmployee: " + SalaryCommissionEmp.getFirstName() + " " + SalaryCommissionEmp.getLastName() +
                           "\nMonthly Pay: $" + SalaryCommissionEmp.calculateBiWeeklyPayWithCommission());
    }
}
