/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9JavaInterface;

import week9JavaInterface.BoardMember;

/**
 *
 * @author Oracle
 */
public class CEO extends Employee implements Interviewer, BoardMember {

    @Override
    public void calculateBonus() {
        double d1 = salary*0.75;
    }

    @Override
    public int conductInterview() {
        return numberInterview +=1;
    }

    @Override
    public int performAptitudeTest() {
        return numberAptitudeTest += 1;
    }

    @Override
    public void approveBonus() {
        System.out.println("bonus is approved");
    }

    @Override
    public void promoteEmployee() {
        System.out.println("employee is promoted");        
    }

    
    
}
