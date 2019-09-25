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
public class Bird {
    protected int wings;
    protected String name;
    protected String color;

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWings() {
        return wings;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    
    public String eats(String eat){
        return "";
    }
    
}
