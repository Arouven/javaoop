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
public class MainBird1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parrot p1 = new Parrot();
        Eagle e1 = new Eagle();
        Bird b1 = new Bird();
        
        Bird[] myArray = new Bird[2];
        
        myArray[0] = p1;
        myArray[1] = e1;
        
        String input,output;
        
        for(int i = 0; i<myArray.length; i++){
            JOptionPane.showMessageDialog(null, "bird name: "+myArray[i].getClass());//plymorthism
            input = JOptionPane.showInputDialog("what does bird object eat?");
            output = myArray[i].eats(input);
            JOptionPane.showMessageDialog(null, "bird object eats: "+output);//plymorthism
        }
        
        
    }
    
}
