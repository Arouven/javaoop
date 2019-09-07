/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q5;

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
        int ano1 = Integer.parseInt(JOptionPane.showInputDialog("what is the account number?"));
        String ana1 = JOptionPane.showInputDialog("what is the account name?");
        Account a1 = new Account(ano1,ana1);
        int input;
        do{
            input = Integer.parseInt(JOptionPane.showInputDialog("enter 1 to deposit money"
                    + "\nenter 2 to remove money"
                    + "\nenter 3 to view your account balance"
                    + "\nenter -1 to exit the bank system"                
            ));
            //choice = Interger.parseInt(input);
            switch(input){
                case 1:
                    String deposit = JOptionPane.showInputDialog("how much to deposit?");
                    double b5 = Double.parseDouble(deposit);
                    a1.credit(b5);
                    break;
                case 2:
                    String withdraw = JOptionPane.showInputDialog("how much to withdraw?");
                    double b6 = Double.parseDouble(withdraw);
                    a1.credit(b6);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"your balance is Rs "+a1.getAccountBalance());
                    break;
                case -1:
                    JOptionPane.showMessageDialog(null,"good bye");
                    System.exit(0);
                    break;    
                default:
                    JOptionPane.showMessageDialog(null,"wrong input please re-enter");
            }
            
        }while(input!=-1);
        System.exit(0);
    }
    
}
