/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
Qu.6 Write down the class Book which contains the following:-
(i) attributes: book_isbn, book_name, book_author, book_price,
number_of_copies
(ii) set methods for each variable
(iii) get methods for each attribute
(iv) method 'reserve_book' which takes the book_name and today's date as
argument to create a reservation for a particular book
(v) method 'borrow_book' which allows a book to be borrowed by a student
if it is available
 */
public class Q6 {

    public static void main(String[] args) throws ParseException {
        Book b1 = new Book();
        b1.setBook_isbn(1111);
        b1.setBook_name("booktesting");
        b1.setBook_author("authortesting");
        b1.setBook_price(100);
        b1.setNumber_of_copies(10);            
        
        b1.reserve_book();
        System.out.println(b1.getNumber_of_copies()); 
    }
    
}


class Book{
    //attributes: 
    private String book_name, book_author;
    private float book_price;
    private int number_of_copies, book_isbn;
    private LocalDate dateOfRent;
    
    
    //getters
    public String getBook_name() {
        return book_name;
    }
    public String getBook_author() {
        return book_author;
    }
    public float getBook_price() {
        return book_price;
    }
    public int getNumber_of_copies() {
        return number_of_copies;
    }
    public int getBook_isbn() {
        return book_isbn;
    }
    public LocalDate getDateOfRent() {
        return dateOfRent;
    }

    
    //setters
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }
    public void setBook_price(float book_price) {
        this.book_price = book_price;
    }
    public void setNumber_of_copies(int number_of_copies) {
        this.number_of_copies = number_of_copies;
    }
    public void setBook_isbn(int book_isbn) {
        this.book_isbn = book_isbn;
    }
    public void setDateOfRent(LocalDate dateOfRent) {
        this.dateOfRent = dateOfRent;
    }
    
    
    //methods
    public String reserve_book() throws ParseException{
        //Date date = new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2015");
        this.dateOfRent = LocalDate.now();
        this.number_of_copies = number_of_copies - 1;
        return book_name+" is reserved on "+dateOfRent+" you have "+number_of_copies+" left";
        
    }
    
    public String borrow_book(){        
        if(number_of_copies >= 1){
            this.number_of_copies = number_of_copies - 1;
            return book_name+" is borrowed you have "+number_of_copies+" left. Return it on time.";
        }
        else{
            return "no book available";  
            
        }
                  
    }
    
}