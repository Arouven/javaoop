/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9JavaInterface;

/**
 *
 * @author Oracle
 */
public abstract class Animal {
    protected String name,color;
    protected double size;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }
    
    public abstract void eats();
    
    public void sleep(){
        System.out.println("i sleep at night");
    }
}
