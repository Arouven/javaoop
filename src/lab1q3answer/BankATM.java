/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q3answer;

import javax.swing.JOptionPane;

/**
 *
 * @author Oracle
 */
public class BankATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        int choice;
        do{
        String input = JOptionPane.showInputDialog("Type 1 to credit your bank account\n"
        + "Type 2 to withdraw money\nType 3 to view account balance\n"
        +"Type -1 to exit");
        choice = Integer.parseInt(input);
        String amount;
        
            switch(choice){
                case -1:
                    JOptionPane.showMessageDialog(null, "goodbye");
                    System.exit(0);
                    break;
                case 1: 

                    amount = JOptionPane.showInputDialog("how much money to deposit");
                    double d1 = Double.parseDouble(amount);
                    account.credit(d1);
                    break;
                case 2:
                    amount = JOptionPane.showInputDialog("how much money to withdraw");
                    double d2 = Double.parseDouble(amount);
                    account.withdraw(d2);
                    break;
                case 3:
                    double currentBalance = account.viewAccountBalance();
                    JOptionPane.showMessageDialog(null, "current balance = Rs"+currentBalance);
                    break;
                default :
                    JOptionPane.showMessageDialog(null, "wrong input please retype");
                    //break;

            }
        }while(choice!=-1);
            
        
        
        System.exit(0);
    }
    
}
