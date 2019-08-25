package Practical2;

/**
Qu.2 (a) Design and implement a class Time1 in Java which contains the following:-
(i) fields hour, minute and second
(ii) a Time1 empty constructor to initialize all the instance variables to zero
(iii) a method setTime to set the new time value; this method will perform validity
checks on the data and sets invalid values to 0
(iv)
a method toUniversalString which takes no arguments and returns a String
value for the universal-time-format
(v)
a method toString that takes no arguments and returns a string value for the
standard-time-format (field hour takes value 12 for invalid data and is the default
value)
(b) Now design and implement a tester class for the above Time1 using the following:
1- data not set
2- data set to (13, 27, 6)
3- invalid data (99, 99, 99)
 */
public class Q2 {

    public static void main(String[] args) {
        Time1 t1 = new Time1();
        t1.setTime();
        System.out.println(t1.toUniversalString()+"\t"+ t1.toSTDString());
        
        Time1 t2 = new Time1();
        t2.setTime(13, 27, 6);
        System.out.println(t2.toUniversalString()+"\t"+ t2.toSTDString());
        
        
        Time1 t3 = new Time1();
        t3.setTime(99, 99, 99);
        System.out.println(t3.toUniversalString()+"\t"+ t3.toSTDString());
        

    }
    
}

class Time1{
    private int hour,minute,second;

    public Time1() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
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
