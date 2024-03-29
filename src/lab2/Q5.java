package lab2;

/**
Qu.5 Write the definition of a class called Account. An Account object should 
represent the record of a bank account. It should contain the following 
information: the account number, the name of the owner of the account, and the 
balance of the account.
In addition the following should be defined:-
(i)A constructor Account (num, name) that will create a new Account object with
account number ‘num’ and owner’s name ‘name’.
(ii)An instance method credit (amount) that will add the sum amount to the account.
(iii) An instance method debit (amount) that will subtract the sum amount from the
account. Whenever the resulting balance is negative, the sum of Rs10 should also be
subtracted from the account.
(iv) An instance method getBalance( ) that returns the balance of the account.
 */
public class Q5 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Account{
    private String accountNumber, ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    
    public void credit(double in){
        this.balance = balance + in;
    }
    
    public void dedit(double out){
        if(this.balance < 0){
            this.balance = balance - 10;
        }
        else{
            this.balance = balance - out;
        }
        
    }

    public double getBalance() {
        return balance;
    }
    
}