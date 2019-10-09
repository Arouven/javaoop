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
public class CurrentAccount extends BankAccount{
    private double credit_limit;

    
    public CurrentAccount() {
        this.credit_limit = 0;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(double credit_limit) {
        this.credit_limit = credit_limit;
    }
    
    @Override
    public void setAccountType(String s){
        acc_type = s;
    }
}
