/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1Q1Answer;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer c1 = new Customer();
        Item burger = new Item();
        Item fries = new Item();
        Item spicyPiece = new Item();
        Meal comboMeal = new Meal();
        Order o1 = new Order();
        burger.setItemCost(100.50);
        fries.setItemCost(50);
        spicyPiece.setItemCost(25);
        
        double payment;
        payment=burger.getItemCost()+ fries.getItemCost()+spicyPiece.getItemCost();
        JOptionPane.showMessageDialog(null, payment);
        System.exit(0);
    }
    
}
