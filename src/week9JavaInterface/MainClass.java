/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9JavaInterface;

/**
 *
 * @author Oracle
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fish f1 = new Fish();
        Bird b1 = new Bird();
        Bat ba1 = new Bat();
        
        Animal a1 = f1;
        Animal a2 = b1;
        Animal a3 = ba1;
        
        Mammal m1 = ba1;
        
        Volant v1 = b1;
        Volant v2 = ba1;
        
        System.out.println("using subclass objects");
        f1.eats();
        b1.fly();
        ba1.fly();
        
        System.out.println("using subclass reference");
        a1.eats();
        a2.eats();
        a3.eats();
        
        System.out.println("object time to sleep");
        f1.sleep();
        b1.sleep();
        ba1.sleep();
                
        System.out.println("objects superclass reference time to sleep");
        a1.sleep();
        a2.sleep();
        a3.sleep();
        
        /*
        method sleep not available inside mammal and volant
        m1.sleep();
        v1.sleep();
        v2.sleep();
*/
    }
    
}
