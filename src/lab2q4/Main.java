/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q4;

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
       PrintCard p1 = new PrintCard();
       String cno1=JOptionPane.showInputDialog("what is the card number?");
       String sn1=JOptionPane.showInputDialog("what is the student name?");
       JOptionPane.showMessageDialog(null, "Sheets available: "+p1.getSheets());
              
       int pass1=Integer.parseInt(JOptionPane.showInputDialog("how many pages to print for assignment?"));
       int ppro1=Integer.parseInt(JOptionPane.showInputDialog("how many pages to print for project?"));
    
       JOptionPane.showMessageDialog(null, "printing begins");
       for(int counter1=1;counter1<=pass1;counter1++){
           p1.printOne();
       }
       
       JOptionPane.showMessageDialog(null, "Sheets still available: "+p1.getSheets());
       for(int counter2=1;counter2<=ppro1;counter2++){
           p1.printOne();
       }
       
       JOptionPane.showMessageDialog(null, "Sheets still available: "+p1.getSheets());
    
    }
    
}
