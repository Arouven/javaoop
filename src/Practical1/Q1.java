/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical1;

/**
Qu.1 “La Bonne Marmite Resto” in the capital city offers a variety of meals to customers for
breakfast, lunch and dinner. Menu items may be sold independently though. A customer
places his/her order and pays at the check-out counter before being served all the food
items bought. Perform the following operations:-
(i) place an order for a lunch combo meal which contains: a chicken burger, french
fries, a chicken salad pasta, a soft drink and a chicken spicy piece.
(ii) calculate & display the total cost to be paid by the customer.
 */
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Welcome to La Bonne Marmite Resto");
        CustomerOrder c1 = new CustomerOrder();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Customer name: ");
        String cName = sc.nextLine();
        c1.setCustomerName(cName);
        c1.setSum(0.0);
        
        System.out.println("\nPlace your order "+ c1.getCustomerName());
        System.out.println("1. Chicken Burger\t\t2. French Fries");
        System.out.println("3. Chicken Salad Pasta\t\t4. Soft Drink");
        System.out.println("5. Chicken Spicy Piece\t\t0. Bill\n");
        
        System.out.println("Orders: ");
        int input;
        do{
            input = sc.nextInt();
            c1.placeOrder(input);
        }while(input!=0);
        
        System.out.println("\n\nYour bill is: "+c1.getSum());
        System.out.println("thank you.");
        System.out.println("Bon Appetit "+c1.getCustomerName());
    }    
}

class CustomerOrder {    
    //vars
    private String customerName;
    private double sum;
    
    // Getter methods
    public String getCustomerName() {
            return customerName;
    }
    public double getSum(){
        return sum;
    }

    // Setter methods
    public void setCustomerName(String cn) {
            this.customerName = cn;
    }
    public void setSum(double s) {
            this.sum = s;
    }

    //functions
    public double placeOrder(int input){
        switch(input){
            case 0:
                break;
            case 1:
                sum=sum+1;
                break;
            case 2:
                sum=sum+2;
                break;
            case 3:
                sum=sum+3;
                break;
            case 4:
                sum=sum+4;
                break;
            case 5:
                sum=sum+5;
                break;
            default:
                System.out.println("There is an error!!!");
                System.exit(0);
                break;
        }
        return sum;
    }
}
