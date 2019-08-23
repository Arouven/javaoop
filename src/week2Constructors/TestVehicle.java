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
public class TestVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        
        String input = JOptionPane.showInputDialog("Enter vehicle ID");
        int id1 = Integer.parseInt(input);                
        Vehicle v2 = new Vehicle(id1);
        
        String input2 = JOptionPane.showInputDialog("Enter vehicle TYPE");
        Vehicle v3 = new Vehicle(input2);
        
        String input3 = JOptionPane.showInputDialog("Enter vehicle ID");
        int id3 = Integer.parseInt(input3);
        String input4 = JOptionPane.showInputDialog("Enter vehicle TYPE");
        Vehicle v4 = new Vehicle(id3, input4);
        
        Vehicle v5 = new Vehicle(v4);
        
        JOptionPane.showMessageDialog(null,
                 "ID vehicle v1 : "+ v1.getId()+"    \t"+ v1.getType()+"\n"+
                 "ID vehicle v2 : "+ v2.getId()+"    \t"+ v2.getType()+"\n"+
                 "ID vehicle v3 : "+ v3.getId()+"    \t"+ v3.getType()+"\n"+
                 "ID vehicle v4 : "+ v4.getId()+"    \t"+ v4.getType()+"\n"+
                 "ID vehicle v5 : "+ v5.getId()+"    \t"+ v5.getType()+"\n"
                );
        
        
        System.exit(0);
    }
    
}
