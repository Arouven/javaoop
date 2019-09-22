/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6Inheritance;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c1 = new Car();
        String plate1 = JOptionPane.showInputDialog("what is the license plate?");
        String color1 = JOptionPane.showInputDialog("what is the color of car?");
        double speed1 = Double.parseDouble(JOptionPane.showInputDialog("what is the speed of car?"));
        
        c1.setLicensePlate(plate1);
        c1.setColor(color1);        
        c1.setSpeed(speed1);

        JOptionPane.showMessageDialog(null, "Car license plate: " + c1.getLicensePlate()
                +"\nColor of the car: "+c1.getColor()
                +"\nSpeed of the car: "+c1.getSpeed()
        );
        
        SportsCar c2 = new SportsCar();
        c2.setLicensePlate(plate1);
        c2.setColor(color1);
        c2.setSpeed(speed1);
        
        double accelerate2 = Double.parseDouble(JOptionPane.showInputDialog("how much to accelerate?"));
        c2.accelerate(accelerate2);
        
        String engine1 = JOptionPane.showInputDialog("which turbo engine?");
        c2.setTurboEngine(engine1);
        
        JOptionPane.showMessageDialog(null, "Sports car license plate: " + c2.getLicensePlate()
                +"\nColor of the sport car: "+c2.getColor()
                +"\nNew speed of the sport car: "+c2.getSpeed()
                +"\nEngine of the sport car: "+c2.getTurboEngine()
        );
        
        System.exit(0);
    }
    
}
