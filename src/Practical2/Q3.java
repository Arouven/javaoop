/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2;

/**
Qu.3 (a) Design and implement a class Time2 which contains the following:-
(i) fields hour, minute and second
(ii) a Time2 constructor which initializes all the variables to zero
(iii) a Time2 constructor to supply only the hour with minute and second 
defaulted to zero
(iv)a Time2 constructor to supply only the hour and minute with second defaulted
to zero
(v)a Time2 constructor to supply all the variables- hour + minute + second 
(vi) a Time2 constructor to instantiate a Time2 object
(vii) a method setTime to set the new time value; this method will perform 
validity checks on the data and sets invalid values to 0
(viii) a method toUniversalString which takes no arguments and returns a String
value for the universal-time-format
(ix) a method toString that takes no arguments and returns a string value for 
the standard-time-format (field hour takes value 12 for invalid data and is 
the default value)
(b) Now design and implement a tester class for the above Time2 program.
 */
public class Q3 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Time2{
    private int hour,minute,second;
    
    public Time2() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time2(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public Time2(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public Time2(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Time2(Time2 time2) {
        this.hour = time2.hour;
        this.minute = time2.minute;
        this.second = time2.second;
    }
    
    public void setTime(int hour,int minute,int second){
        if(hour>24 || hour<0 || minute>60 || minute<0 || second>60 || second<0 ){
            this.hour = 0;
            this.minute = 0;
            this.second = 0; 
            System.out.println("invalid");
        }
        else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;            
        }
    }
    public void setTime(){
        System.out.println("not set");
        
        
    }
    
    public String toUniversalString(){
        return "universal time format "+ 
                hour + " : "+
                minute + " : "+
                second;
    }
    
    public String toSTDString(){
        if(hour>12){
            int hr = hour -12;
            return "standard time format "+ 
                    hr + " : "+
                    minute + " : "+
                    second;
                
        }
        else {
            return "standard time format "+ 
                    hour + " : "+
                    minute + " : "+
                    second;
        }
    }
    
    
}
