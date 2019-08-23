/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2Constructors;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class Vehicle {
    private int id;


    private String type;

    
        public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    //default
    public Vehicle() {
        JOptionPane.showMessageDialog(null, "good day empty constructor");
        //this.color = "vert";
        //this("vert",4);
        
    }
    //overload
    public Vehicle(int id) {
        this.id = id;
    }
    public Vehicle(String type) {
        this.type = type;
    }
 
    
    public Vehicle(int id,String type) {
        this.id = id;
        this.type = type;
    }
    public Vehicle(Vehicle vehi) {
        this.id = vehi.id;
        this.type = vehi.type;
    }
}
