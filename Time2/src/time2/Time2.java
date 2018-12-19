/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time2;

//Importing java scanner
import java.util.Scanner; 

/*
Braden Niksich
Lab 7 Task 1
11/6/18
This program allows users to input a time and then increment their time by 1 in either
seconds, minutes, or hours.
 */

public class Time2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter hour: ");
        int userInputHour = input.nextInt();
        System.out.println("Please enter minute: ");
        int userInputMinute = input.nextInt();
        System.out.println("Please enter seconds: ");
        int userInputSecond = input.nextInt();
        Time11_1 t1 = new Time11_1(userInputHour, userInputMinute, userInputSecond);
        displayTime("The time you entered: ", t1);
        System.out.println("1. Add 1 Second");
        System.out.println("2. Add 1 Minute");
        System.out.println("3. Add 1 Hour");
        System.out.println("4. Exit");
        int selection = input.nextInt();
        while(selection != 4)
        {
            switch(selection)
            {
                case 1:
                    t1.tick(); 
                case 2:
                    t1.incrementMinute(); 
                case 3:
                    t1.incrementHour();
                case 4:
                    break;
            }  
            displayTime("The time you entered: ", t1);
            System.out.println("1. Add 1 Second");
            System.out.println("2. Add 1 Minute");
            System.out.println("3. Add 1 Hour");
            System.out.println("4. Exit");
            selection = input.nextInt();
        }
    }
        private static void displayTime(String header, Time11_1 t){
            System.out.printf("%s%nUniversal Time: %s%nStandard Time: %s%n", header, t.toUniversalString(), t.toString());
        }
    }
    

