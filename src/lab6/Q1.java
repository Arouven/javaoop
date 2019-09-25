/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author arouven
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("testing c1");
        Circle c1 = new Circle();
        System.out.println("Area c1 is "+c1.computeArea());
        System.out.println("Location and radius c1:\n"+c1.locationAndRadius());       
        
        
        System.out.println("\n\ntesting c2");
        Circle c2 = new Circle(10);
        System.out.println("Area c2 is "+c2.computeArea());        
        System.out.println("Location and radius c2:\n"+c2.locationAndRadius());
        
        
        System.out.println("\n\ntesting c3");
        Circle c3 = new Circle(2,5,9);
        System.out.println("Area c3 is "+c3.computeArea());
        System.out.println("Location and radius c3:\n"+c3.locationAndRadius());
        
    }
    
}

class Point {
    protected float x;
    protected float y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public String location(){
        return "The location is("+x+", "+y+"). ";
    }
    
}

class Circle extends Point {
    protected float radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float radius, float x, float y) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    
    public float computeArea(){
        float area = (float) (Math.PI*radius*radius);
        return area;
    }
    
    public String locationAndRadius(){        
        return location()+"Radius: "+radius;
    }
    
}