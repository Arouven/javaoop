/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import static java.lang.System.out;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
Qu.7 Now write down an application to perform the following transactions:-
(vi) create students: zico, jojo, bobo
(vii) zico pays an amount of Rs 12,000, jojo pays an amount of Rs 24,000 
and bobo pays an amount of 25,000 respectively for tuition fees. The 
total amount of fees to be paid is Rs 25,000 per semester. Display 
appropriate messages to show the amount paid and amount still pending
(viii)Create books: 'Harry Potter' and 'L' Etoile de Ton Marko' with the 
following details
(a) book_isbn: 101101
book_name: Harry Potter
book_author: Percy Tomasson
book_price: Rs 125/
number_of_copies: 12
(b) book_isbn: 102102
book_name: L'Etoile de Ton Marko
book_author: Ras Babyjaby
book_price: Rs 1,500/
number_of_copies: 8
(vii) zico makes a reservation for book Harry Potter
(viii) jojo borrows the book L'Etoile de Ton Marko
(ix) bobo borrows the book Harry Potter
Display appropriate messages for each of the transactions.
 */
public class Q7 {

    public static void main(String[] args) throws ParseException {
        LocalDate localDate = LocalDate.now();
        String date = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);
        
        Student s2 = new Student();
        s2.setStudent_id(2);
        s2.setStudent_name("zico");
        s2.setStudent_address("mauritius");
        s2.setContact_number("+230 52222222");
        System.out.println("Student_id is "+s2.getStudent_id());
        System.out.println("Student_name is "+s2.getStudent_name());
        System.out.println("Student_address is "+s2.getStudent_address());
        System.out.println("Contact_number is "+s2.getContact_number());
        
        TuitionFees t2 = new TuitionFees();
        t2.setFees_id (2);
        t2.setPayment_date (date);
        t2.pay_tuition_fees(25000.0, 12000.0);
        System.out.println("Fees_id is "+t2.getFees_id());
        System.out.println("Payment_date is "+t2.getPayment_date());
        System.out.println("Amount_paid is "+t2.getAmount_paid());
        System.out.println("Amount_due is "+t2.getAmount_due());
        System.out.println(s2.getStudent_name()+" has to pay "+t2.getAmount_due());
        
        
        
        System.out.println("\n\n");
        Student s3 = new Student();
        s3.setStudent_id(3);
        s3.setStudent_name("jojo");
        s3.setStudent_address("brazil");
        s3.setContact_number("+230 53333333");
        System.out.println("Student_id is "+s3.getStudent_id());
        System.out.println("Student_name is "+s3.getStudent_name());
        System.out.println("Student_address is "+s3.getStudent_address());
        System.out.println("Contact_number is "+s3.getContact_number());
     
        TuitionFees t3 = new TuitionFees();
        t3.setFees_id (3);
        t3.setPayment_date (date);
        t3.pay_tuition_fees(25000.0, 24000.0);
        System.out.println("Fees_id is "+t3.getFees_id());
        System.out.println("Payment_date is "+t3.getPayment_date());
        System.out.println("Amount_paid is "+t3.getAmount_paid());
        System.out.println("Amount_due is "+t3.getAmount_due());
        System.out.println(s3.getStudent_name()+" has to pay "+t3.getAmount_due());
        
        
        
        System.out.println("\n\n");
        Student s4 = new Student();
        s4.setStudent_id(4);
        s4.setStudent_name("bobo");
        s4.setStudent_address("rodrigues");
        s4.setContact_number("+230 54444444");
        System.out.println("Student_id is "+s4.getStudent_id());
        System.out.println("Student_name is "+s4.getStudent_name());
        System.out.println("Student_address is "+s4.getStudent_address());
        System.out.println("Contact_number is "+s4.getContact_number());
    
        TuitionFees t4 = new TuitionFees();
        t4.setFees_id (4);
        t4.setPayment_date (date);
        t4.pay_tuition_fees(25000.0, 12000.0);
        System.out.println("Fees_id is "+t4.getFees_id());
        System.out.println("Payment_date is "+t4.getPayment_date());
        System.out.println("Amount_paid is "+t4.getAmount_paid());
        System.out.println("Amount_due is "+t4.getAmount_due());
        System.out.println(s4.getStudent_name()+" has to pay "+t4.getAmount_due());
        
        
        
        Book b2 = new Book();
        b2.setBook_isbn(101101);
        b2.setBook_name("Harry Potter");
        b2.setBook_author("Percy Tomasson");
        b2.setBook_price(125);
        b2.setNumber_of_copies(12);
        
        Book b3 = new Book();
        b3.setBook_isbn(102102);
        b3.setBook_name("L'Etoile de Ton Marko");
        b3.setBook_author("Ras Babyjaby");
        b3.setBook_price(1500);
        b3.setNumber_of_copies(8);

        System.out.println("\n\n");
        String str1 = s2.getStudent_name()+". "+b2.reserve_book();
        System.out.println(str1);
        String str2 = s3.getStudent_name()+". "+b3.borrow_book();
        System.out.println(str2);
        String str3 = s4.getStudent_name()+". "+b2.borrow_book();
        System.out.println(str3);
        
    }
    
}
