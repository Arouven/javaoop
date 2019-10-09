/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7q1answer;

/**
 *
 * @author Oracle
 */
public class Student extends Person {
    private String type;

    public Student() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
     @Override
    public String toString() {        
        return "class name: "+this.getClass()+"\nperson name: "+this.getName();
    }
}
