package Practical2;

/**
Qu.1 (a) Write a class TV which satisfy the following requirements:-
(i) it contains the fields make, price and serial number
(ii) it contains a parameterized constructor for the fields make and price
(iii) it has a set method for the make
(iv) it has a set method for the price
(v) it has access methods to return the make, price and serial number of the TV
Now write a tester class for the program and explain the possible outputs.
 */
public class Q1 {

    public static void main(String[] args) {
        TV tv1 = new TV ("tvmake", 12000);
        System.out.println(tv1.getTMake());
        System.out.println(tv1.getPrice());
        
    }
    
}

class TV{
    private String tMake;
    private double price;
    private String sNumber;

    //constructor
    public TV(String tMake, double price) {
        this.tMake = tMake;
        this.price = price;
    }

    //setter
    public void setTMake(String tMake) {
        this.tMake = tMake;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //getter
    public String getTMake() {
        return tMake;
    }

    public double getPrice() {
        return price;
    }

    public String getsNumber() {
        return sNumber;
    }
    

}