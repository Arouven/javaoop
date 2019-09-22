/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6Inheritance;

/**
 *
 * @author Student
 */
public class SportsCar extends Car {
    private String turboEngine;

    public String getTurboEngine() {
        return turboEngine;
    }

    public void setTurboEngine(String turboEngine) {
        this.turboEngine = turboEngine;
    }

    public SportsCar() {
        super(80.5);
        System.out.println("Sports car empty constructor");
    }

    public SportsCar(String turboEngine) {
        super(75.5);
        this.turboEngine = turboEngine;
        System.out.println("Sports car overload constructor turbo engine: "+this.turboEngine);
    }
    
    
}
