/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6q2answer;

import javax.swing.JOptionPane;

/**
 *
 * @author Oracle
 */
public class MainBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        CurrentAccount c1 = new CurrentAccount();
        s1.creditAccInterest(2000);
        c1.setCredit_limit(-1000);
        s1.creditAccInterest(3500);
        JOptionPane.showMessageDialog(null, "Savings Account Balance: Rs "
                + s1.getAcc_interest());
        JOptionPane.showMessageDialog(null, "Current Account Balance: Rs "
                + c1.getCredit_limit());
        
    }
    
}
