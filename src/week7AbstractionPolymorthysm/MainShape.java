/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7AbstractionPolymorthysm;

import javax.swing.JOptionPane;

/**
 *
 * @author Oracle
 */
public class MainShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();
        
        Shape[] myShapeArray = new Shape[2];
        myShapeArray[0] = t1;
        myShapeArray[1] = c1;
        
        double base = Double.parseDouble(JOptionPane.showInputDialog("what is the base of the triangle?"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("what is the height of the triangle?"));
        double radius = Double.parseDouble(JOptionPane.showInputDialog("what is the radius of the circle?"));
        
        t1.setBase(base);
        t1.setHeight(height);
        c1.setRadius(radius);
        
        for(int i = 0; i<myShapeArray.length; i++){
            JOptionPane.showMessageDialog(null, "Area is: "+myShapeArray[i].calculateArea());//plymorthism
        }
    }
    
}
