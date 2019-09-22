/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6Inheritance;

/**
 *
 * @author Student
 */
public class Car extends Vehicle{
    protected static final int maxPassengers = 5;
    protected double speed;

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
    
    public void accelerate(double accelerateby){
        this.speed = speed + accelerateby;
    }

    public Car() {
        super("1234may2018");
        System.out.println("car empty constructor");
    }

    public Car(double speed) {
        super("2121nov2019","black");
        this.speed = speed;
        System.out.println("car overloaded constructor speed: "+this.speed);
    }
    
}
