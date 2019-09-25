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
public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }    
    
    public double calculateArea(){
        return Math.PI * getRadius() * getRadius() ;
    }
}
