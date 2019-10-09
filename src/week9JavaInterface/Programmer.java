/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9JavaInterface;

import week9JavaInterface.Employee;

/**
 *
 * @author Oracle
 */
public class Programmer extends Employee {
    public void writeCode(){
        System.out.println("i write code");
    }
            
    @Override
    public void calculateBonus() {
        double d1 = salary*0.25;
    }
    
}
