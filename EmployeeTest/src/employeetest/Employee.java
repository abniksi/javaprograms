/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

/**
 *
 * @author bniksich
 */
public class Employee {
    //This class is not used in the updated code for this program for Lab 7 Task 2.
    
    //Variables created.
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    //Constructor to initialize the name, birth date, and hire date.
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }
    
    //Converting Employee to string format.
    public String toString()
    {
        return String.format("%s, %s  Hired: %s  Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
