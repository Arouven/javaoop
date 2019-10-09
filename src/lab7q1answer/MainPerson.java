/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7q1answer;

import javax.swing.JOptionPane;

/**
 *
 * @author Oracle
 */
public class MainPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Student s1 = new Student();
        e1.setName("will smith");
        s1.setName("tom smith");
        JOptionPane.showMessageDialog(null, "employee: "+e1.getName()+"\nclass name: "+e1.toString());
        JOptionPane.showMessageDialog(null, "student: "+s1.getName()+"\nclass name: "+s1.toString());
    }
    
}
