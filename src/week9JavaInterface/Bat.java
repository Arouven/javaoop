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
public class Bat extends Animal implements Mammal, Volant {
    private int fingerWings;

    public int getFingerWings() {
        return fingerWings;
    }

    public void setFingerWings(int fingerWings) {
        this.fingerWings = fingerWings;
    }

    @Override
    public void eats() {
        System.out.println("i eat fruits");
    }

    @Override
    public void setHairColor(String hairColor) {
        System.out.println("hair color is "+hairColor);
    }

    @Override
    public void fly() {
        System.out.println("i can fly low attitude");
    }
    
    @Override
    public void sleep(){
        System.out.println("i sleep during day");
    }
}
