/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q1answer;

import javax.swing.JOptionPane;

/**
 *
 * @author Oracle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mk1 = JOptionPane.showInputDialog("what is the make of the tv?");
        double pr1 = Double.parseDouble(JOptionPane.showInputDialog("what is the price of the tv?"));       
        TV t1 = new TV(mk1,pr1);
        
        JOptionPane.showMessageDialog(null, "make of tv: "+t1.getMake()+"\n"
                + "Price of TV: Rs "+t1.getPrice());
        
        String mk2 = JOptionPane.showInputDialog("what is the make of the tv?");
        double pr2 = Double.parseDouble(JOptionPane.showInputDialog("what is the price of the tv?"));  
        String sn2 = JOptionPane.showInputDialog("what is the serial number of the tv?");
        
        t1.setMake(mk2);
        t1.setPrice(pr2);
        t1.setSerialNumber(sn2);
        
        JOptionPane.showMessageDialog(null, "make of tv: "+t1.getMake()+"\n"
                + "Price of TV: Rs "+t1.getPrice()+"\n"
                + "Serial number of TV is: "+t1.getSerialNumber());
        
        
        System.exit(0);
    }
    
}
