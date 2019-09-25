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
public class MainBird2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parrot p2 = new Parrot();
        Eagle e2 = new Eagle();
        Bird b2 = new Bird();//super
        Bird b3 = p2;
        Bird b4 = e2;
        
        //Parrot p3 = b2;
        
        Bird[] myArray2 = new Bird[5];
        myArray2[0]=b2;//no output
        myArray2[1]=p2;
        myArray2[2]=e2;
        myArray2[3]=b3;
        myArray2[4]=b4;
        
        String input,result;
        
        for(int i=0; i<myArray2.length; i++){
            input = JOptionPane.showInputDialog("what does this bird eats");
            result = myArray2[i].eats(input);
            JOptionPane.showMessageDialog(null, "birds eats: "+result);//plymorthism
        }
        
        p2.speaks();
        //b3.speaks();
    }
    
}
