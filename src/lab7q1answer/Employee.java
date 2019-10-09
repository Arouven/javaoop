/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7q1answer;

/**
 *
 * @author Oracle
 */
public class Employee extends Person {
    private String office,  dateHired;
    private double salary;

    public Employee() {
    }

    
    public void setOffice(String office) {
        this.office = office;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public String getOffice() {
        return office;
    }

    public String getDateHired() {
        return dateHired;
    }

    public double getSalary() {
        return salary;
    }
    
    
    @Override
    public String toString() {        
        return "class name: "+this.getClass()+"\nperson name: "+this.getName();
    }
    
}
