/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical1;

/**
Qu.3 Write down a simple “atm” banking program which allows a user to 
perform the following transactions:-
(iii) credit his account,
(iv) withdraw money from his account
(v) check the current balance.
The program contains functions 'credit' to add money to the account,
'withdraw' to remove money from the account and 'check_balance' to 
view the current balance.
 */
public class Q3 {

    public static void main(String[] args) {
        Atm a1 = new Atm();
        a1.setBal(10000);
        a1.setCno(1562569453);
        a1.setUname("mr a");        
        
        a1.credit(100);
        a1.check_balance();
        a1.withdraw(10);
        a1.check_balance();
    }
    
}
class Atm {
    //members
    private int cno;
    private String uname;
    private double bal;
    
    //setters
    public void setCno(int cno) {
        this.cno = cno;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public void setBal(double bal) {
        this.bal = bal;
    }

    //getters
    public int getCno() {
        return cno;
    }
    public String getUname() {
        return uname;
    }
    public double getBal() {
        return bal;
    }
    
    //methods
    public void credit(double credit){
        this.bal = bal + credit;
    }
    public void withdraw(double withdraw){
        this.bal = bal - withdraw;
    }
    public void check_balance(){
        System.out.println("Your balance is "+bal);
    }
    
}
