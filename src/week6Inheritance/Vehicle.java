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
public class Vehicle {
    protected String licensePlate;
    protected String color;

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getColor() {
        return color;
    }

    public Vehicle() {
        System.out.println("vehicle empty constructor");
    }
    
    
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        System.out.println("vehicle overloaded constructor license plate: "+this.licensePlate);
    }

    public Vehicle(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
        System.out.println("vehicle overloaded constructor 2 parameters");
    }

    
}
