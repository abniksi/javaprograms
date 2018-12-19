/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time2;

/**
 *
 * @author bniksich
 */
public class Time11_1 {
    private int hour;
    private int minute;
    private int second;
    public Time11_1(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public Time11_1(int hour){
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }
    public Time11_1(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    public Time11_1(int hour, int minute, int second){
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if(second < 0 || second > 59){
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time11_1(Time11_1 time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("minute must be 0-59");
        }
        
        if(second < 0 || second > 59){
            throw new IllegalArgumentException("second must be 0-59");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
    }
    public void setHour(int hour){
        if (hour < 0 || hour > 23){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour = hour;
    }
    public void setMinute(int minute){
        if (minute < 0 || minute > 59){
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minute;
    }
    public void setSecond(int second){
        if (second < 0 || second > 59){
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.second = second;
    }
    
    //Returns hour value.
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    public String toString(){
        //Makes sure to correctly add AM or PM depending on the inital time entered.
        return String.format("%d:%02d:%02d %s", (( hour == 0 || hour == 12) ? 12 : hour % 12),minute,second,(hour < 12 ? "AM" : "PM"));
    }
    public void tick()
    { 
        this.second++;
        this.minute = this.minute - 1;
        this.hour = this.hour - 1;
        this.hour = this.hour + 1; 
        if (second == 60)
        {
            minute += 1;
            second = 0;
        }
    }
    public void incrementMinute()
    {
        this.minute++;
        this.hour = this.hour - 1;
        if (minute == 60)
        {
            hour += 1;
            minute = 0;
        }
    }
    public void incrementHour()
    { 
        this.hour++;
        if (hour == 24)
        {
            hour = 0;
        }
    }  
}
