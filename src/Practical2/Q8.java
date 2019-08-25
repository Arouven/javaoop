package Practical2;

/**
Qu.8 (a) Write the definition of a class ‘Box’ in Java such that it contains the
following:- 
I. Three attributes width, length and height all of data types ‘double’.
II. A default constructor which initializes the box with default values 0 for 
all the three attributes declared.
III. Another constructor with the three attributes width, length and height if 
the user wants to create the box with known values.
IV. A constructor which takes only one value as argument to construct a cube,
i.e here the width equals the length and equals the height as well. 
V. A method that computes the volume of the box.
VI. A method which calculates the surface area of the box.
VII. Methods to set values for the width, length and height of the box.
VIII. Methods to return values of the width, length and height.
(b) Write a tester class to test the above program, and call it ‘BoxTest’, to 
request a user:-
I. To create a box with no dimensions specified.
II. To create a box with the following dimensions, width=30, length=40 and 
height=50.
III. To create a cube with sides having value 7.
IV. To set the width to 20, the length to 25 and the height to 15. 
V. To calculate the volume of the box.
VI. To calculate the total surface area of the box.
 */
public class Q8 {

    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.computeVolume());
        System.out.println(b1.surfaceArea());
         
        Box b2 = new Box(30,40,50);
        System.out.println(b2.computeVolume());
        System.out.println(b2.surfaceArea());
        
        Box cube = new Box(7);
        System.out.println(cube.computeVolume());
        System.out.println(cube.surfaceArea());
        
        Box b3 = new Box();
        b3.setWidth(20);
        b3.setLength(25);
        b3.setHeight(50);
        System.out.println(b3.computeVolume());
        System.out.println(b3.surfaceArea());
    }
    
}

class Box{
    private double width, length, height;

    public Box() {
        this.width = 0;
        this.length = 0;
        this.height = 0;
    }

    public Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    
    public Box(double cube) {
        this.width = cube;
        this.length = cube;
        this.height = cube;
    }
    
    public double computeVolume(){
        return width * height * length;
    }
    
    public double surfaceArea(){
        return (2 * height * width) + (2 * height * length) + (2 * width * length); 
    }

    //setter
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    //getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
    
    
}
