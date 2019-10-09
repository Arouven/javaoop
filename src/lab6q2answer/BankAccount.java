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
public abstract class BankAccount {
    protected int acc_id;
    protected String acc_name;
    protected double balance;
    protected String acc_type;

    public BankAccount() {
        this.balance = 500;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }
    
    public int getAcc_id() {
        return acc_id;
    }

    public String getAcc_name() {
        return acc_name;
    }
    
    public abstract void setAccountType(String s);
    
}
