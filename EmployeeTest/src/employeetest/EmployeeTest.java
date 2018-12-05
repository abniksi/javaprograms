/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

//Importing java scanner.
import java.util.Scanner;

/*
Braden Niksich
Lab 7 Task 2
11/6/18
This program allows users to enter a date. With that date, the program increments
the the date by one for forty times.
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input month: ");
        int userInputMonth = input.nextInt();
        
        System.out.print("Input day: ");
        int userInputDay = input.nextInt();
        
        System.out.print("Input year between 1900 & 2018: ");
        int userInputYear = input.nextInt();
        
        Date increment = new Date(userInputMonth,userInputDay,userInputYear);

        for(int x = 0; x < 40; x++){
            increment.nextDay();
            increment.dayChecker();
            increment.yearMonthChecker();
            System.out.printf("Increment Date: %s%n", increment);
        }
  
    }
    
}
