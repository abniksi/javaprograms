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
public class Date {
    //Creating the integer variables
    private int month;
    private int day;
    private int year;
    
    private static final int[] daysPerMonth = 
    {0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    public Date(int month, int day, int year)
    {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        
        if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out of ranged for specified month");
        
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        
        if (year <= 1899 || year > 2018)
            throw new IllegalArgumentException("year (" + year + ") must be between 1900 & 2018");

        this.month = month;
        this.day = day;
        this.year = year;
        
        System.out.printf("Initial Date: %s%n", this);
    }

    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
    
    public void nextDay()
    {
        this.day++;
    }
    
    public void dayChecker()
    {
        if(day > daysPerMonth[month])
        {
            day = 1;
            month++;
        }
    }
    
    public void yearMonthChecker()
    {
        if(month == 13)
        {
            month = 1;
            year++;
        }
    }
}
