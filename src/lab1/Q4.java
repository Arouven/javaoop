/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
Qu.4 Write down the class Student to contain the following:-
(i)data members: student_id, student_name, student_address, contact_number
(ii) set methods for each data member
(iii) get methods for each variable
 */
public class Q4 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudent_id(1);
        s1.setStudent_name("n");
        s1.setStudent_address("a");
        s1.setContact_number("+230 57777777");
        System.out.println("Student_id is "+s1.getStudent_id());
        System.out.println("Student_name is "+s1.getStudent_name());
        System.out.println("Student_address is "+s1.getStudent_address());
        System.out.println("Contact_number is "+s1.getContact_number());
        
    }
    
}


class Student{
    //members
    private int student_id;
    private String student_name, student_address,contact_number;
    
    //setters
    public void setStudent_id(int sid){
        this.student_id = sid;
    }
    public void setStudent_name(String sn){
        this.student_name = sn;
    }
    public void setStudent_address(String sa){
        this.student_address = sa;
    }
    public void setContact_number(String cn){
        this.contact_number = cn;
    }
    
    //getters
    public int getStudent_id(){
        return student_id;
    }
    public String getStudent_name(){
        return student_name;
    }
    public String getStudent_address(){
        return student_address;
    }
    public String getContact_number(){
        return contact_number;
    }
}