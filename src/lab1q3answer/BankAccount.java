/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1q3answer;

/**
 *
 * @author Oracle
 */
public class BankAccount {
    private int accountId;
    private double accountBalance;
    
    public void credit(double dodo){
        accountBalance = accountBalance + dodo;
    }
    public void withdraw(double fofo){
        accountBalance = accountBalance - fofo;
    }
    public double viewAccountBalance(){
        return accountBalance;
    }
    
    
}
