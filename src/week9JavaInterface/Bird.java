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
public class Bird extends Animal implements Volant {
    private int numberWings;

    public int getNumberWings() {
        return numberWings;
    }

    public void setNumberWings(int numberWings) {
        this.numberWings = numberWings;
    }

    @Override
    public void eats() {
        System.out.println("i eat worms");
    }

    @Override
    public void fly() {
        System.out.println("i can fly at any attitude");
    }
    
    @Override
    public void sleep(){
        System.out.println("i sleep at times during night");
    }
}
