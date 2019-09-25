/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
Qu.5 Write down the class TuitionFees to contain the following:-
- variables: fees_id, payment_date, amount_paid, amount_due
- set methods for variables: fees_id & payment_date
- get methods for variables: fees_id & payment_date
- method 'pay_tuition_fees' which takes an argument for the amount of fees to be
paid and updates both the variables amount_paid and amount_due
 */
public class Q5 {
    
    public static void main(String[] args) {
     
        LocalDate localDate = LocalDate.now();
        String date = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);

        TuitionFees t1 = new TuitionFees();
        t1.setFees_id (1);
        t1.setPayment_date (date);
        t1.pay_tuition_fees(10000.00, 5000.00);
        
        System.out.println("Fees_id is "+t1.getFees_id());
        System.out.println("Payment_date is "+t1.getPayment_date());
        System.out.println("Amount_paid is "+t1.getAmount_paid());
        System.out.println("Amount_due is "+t1.getAmount_due());
        
    }
    
}

class TuitionFees{
    //variables: 
    private int fees_id;
    private String payment_date;
    private double amount_paid;
    private double amount_due;
    
    //set methods
    public void setFees_id (int fi){
        this.fees_id = fi;
    }
    public void setPayment_date (String pd){
        this.payment_date = pd;
    }       

    //get methods
    public int getFees_id(){
        return fees_id;
    }
    public String getPayment_date(){
        return payment_date;
    }
    public double getAmount_paid(){
        return amount_paid;
    }
    public double getAmount_due(){
        return amount_due;
    }

    public void pay_tuition_fees(double atbp, double ap){
        this.amount_paid = ap;//setter
        this.amount_due = atbp - ap;//setter
    }


}
