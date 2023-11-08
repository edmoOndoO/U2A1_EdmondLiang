/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.EmployeeArraylist;


/**
 *
 * @author edmon
 */
public class EmployeeArraylist {
    
    private String employeeID;
    
    private String FIRSTNAME;
    
    private String LASTNAME;
    
    private String Salary;
    
    private String startDate;
    
    public EmployeeArraylist(String employeeID, String FIRSTNAME, String LASTNAME, String Salary, String startDate){
        this.employeeID = employeeID;
        
        this.FIRSTNAME = FIRSTNAME;
        
        this.LASTNAME = LASTNAME;
        
        this.Salary = Salary;
        
        this.startDate = startDate;
    }

    public String getEmployeeID() {
        
        return employeeID;
    }

    public String getFirstName() {
        
        return FIRSTNAME;
    }

    public String getLastName() {
        
        return LASTNAME;
    }

    public String getSalary() {
        
        return Salary;
    }

    public String getStartDate() {
        
        return startDate;
    }
    
    @Override
    public String toString() {
     
        return employeeID +" " +FIRSTNAME +" " + LASTNAME +" " + Salary +" " + startDate;
    }
}
