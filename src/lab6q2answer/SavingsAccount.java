/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6q2answer;

/**
 *
 * @author Oracle
 */
public class SavingsAccount extends BankAccount {
    private double acc_interest;
    
    public SavingsAccount(){
        acc_interest = 0;
    }

    public void creditAccInterest(double amount){
        acc_interest = acc_interest + amount;
    }
    
    public double getAcc_interest() {
        return acc_interest;
    }
    
    @Override
    public void setAccountType(String s){
        acc_type = s;
    }
    
}
