package Practical2;

/**
Qu.9 Write the definition of a class called ‘Rectangle’. It contains the 
following data members and methods:-
(i) two attributes length and width, both of data type double
(ii) a default constructor, i.e. a no-argument constructor which initializes the
length and width to zero.
(iii) another constructor which initializes the length and width with values 
specified by the user
(iv)It contains set methods: one to set the length of the rectangle and the 
other to set the width
(v) It contains get methods to return values for the length and width
(vi) It contains a method to calculate the perimeter of the rectangle
(vii) A method to compute the area of the rectangle
Now write a tester class for a user to test the above program as follows:-
(i)to create a rectangle object, call it ‘smallRectangle’, with no values 
specified for length and width
(ii)to create another object, call it ‘bigRectangle’, with values 15 for length
and 10 for the width
(iii)to output the perimeter and area of the small rectangle. Use 
System.out.println to output directly on the command prompt
(iv)to output the perimeter and area of the big rectangle. Here again use
System.out.println.
(v)to set both the length and width of the small rectangle to value 12.25 to 
output the perimeter and area of the small rectangle a second time to check the
difference from part(iii) above.
 */
public class Q9 {

    public static void main(String[] args) {
        Rectangle smallRectangle = new Rectangle();        
        System.out.println(smallRectangle.perimeter());
        System.out.println(smallRectangle.area());
        
        Rectangle bigRectangle = new Rectangle(15, 10);
        System.out.println(bigRectangle.perimeter());
        System.out.println(bigRectangle.area());
        
        smallRectangle.setLength(12.25);
        smallRectangle.setWidth(12.25);
        System.out.println(smallRectangle.perimeter());
        System.out.println(smallRectangle.area());
    }
    
}

class Rectangle{
    
    private double length, width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    public double perimeter(){
        return 2*(length + width);
    }
    
    public double area(){
        return length * width;
    }
}