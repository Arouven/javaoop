/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6q3answer;

/**
 *
 * @author Oracle
 */
public abstract class Loan {
    protected int loanID;
    protected String loanType;
    protected double amount;
    protected String customerName;

    public Loan() {
        this.amount = 0;
    }
    
    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getLoanID() {
        return loanID;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public abstract void displayLoanType();
}
