/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2Q1;

/**
 *
 * @author Oracle
 */
public class TV {
    private String make;
    private double price;
    private String serialNumber;

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public TV(String make, double price) {
        this.make = make;
        this.price = price;
    }
    
    
}
