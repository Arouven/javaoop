/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6q3answer;

import javax.swing.JOptionPane;

/**
 *
 * @author Oracle
 */
public class MainLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeLoan h1 = new HomeLoan();
        CarLoan c1 = new CarLoan();
        
        c1.setCustomerName("john jean");
        c1.setAmount(3000000);
        c1.setLoanID(3);
        c1.setCar_lien(123535);
        
        h1.setCustomerName("paul polo");
        h1.setAmount(5000000);
        h1.setLoanID(5);
        h1.setTitle_deed(1654798);
        
        JOptionPane.showMessageDialog(null, "car loan id: "+c1.getLoanID()
                + " Amount of car loan Rs "+c1.getAmount()
        );
        JOptionPane.showMessageDialog(null, "home loan id: "+h1.getLoanID()
                + " Amount of home loan Rs "+h1.getAmount()
        );
       
    }
    
}
