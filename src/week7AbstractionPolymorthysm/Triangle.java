/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7AbstractionPolymorthysm;

/**
 *
 * @author Oracle
 */
public class Triangle extends Shape{
    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    
    
    public double calculateArea(){
        return getBase()*getHeight()*0.5;
    }
    
}
