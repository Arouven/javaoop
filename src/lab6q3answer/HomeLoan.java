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
public class HomeLoan extends Loan {
    private int title_deed;
    
    public HomeLoan() {
        this.loanID = 0;
        this.amount = 0.0;
        this.customerName = "";
    }   

    public int getTitle_deed() {
        return title_deed;
    }

    public void setTitle_deed(int title_deed) {
        this.title_deed = title_deed;
    }

    @Override
    public void displayLoanType() {
        this.loanType = "Home Loan";
    }
    
}
