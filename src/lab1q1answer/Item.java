/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q1answer;

/**
 *
 * @author Student
 */
public class Item {
    //vars
    private String itemName;
    private double itemCost;
    
    //settter
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    //getters
    public String getItemName() {
        return itemName;
    }

    public double getItemCost() {
        return itemCost;
    }
    
}
