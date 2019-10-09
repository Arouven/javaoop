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
public class CarLoan extends Loan{
    private int car_lien;

    public CarLoan() {
        this.loanID = 0;
        this.amount = 0.0;
        this.customerName = "";
    }

    public int getCar_lien() {
        return car_lien;
    }

    public void setCar_lien(int car_lien) {
        this.car_lien = car_lien;
    }

    @Override
    public void displayLoanType() {
        this.loanType = "Car Loan";
    }

    
   
    
}
