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
public class Fish extends Animal{
    private int numberGrills;

    public int getNumberGrills() {
        return numberGrills;
    }

    public void setNumberGrills(int numberGrills) {
        this.numberGrills = numberGrills;
    }
    
    @Override
    public void eats() {
        System.out.println("i eat algaes");
    }
    
    @Override
    public void sleep(){
        System.out.println("i do not sleep");
    }
}
