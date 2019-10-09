/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9JavaInterface;

import week9JavaInterface.Employee;

/**
 *
 * @author Oracle
 */
public class ITManager extends Employee implements Interviewer {

    @Override
    public void calculateBonus() {
        double d1 = salary * 0.5;
    }

    int numberInterview=0,numberAptitudeTest=0;
    @Override
    public int conductInterview() {
       return numberInterview +=1;
    }

    @Override
    public int performAptitudeTest(){
        return numberAptitudeTest +=1;
    }
    
}
