package lab2;

/**
Qu.6 (a) Write the definition of a class called ‘Point’ in Java. The class 
should contain the following:-
(i)Two integer variables x and y declared as protected.
(ii) The class Point has a public no-argument constructor to set the coordinates
at the Origin (0, 0).
(iii) A second constructor with 2 parameters to set the coordinates of the point
at the location defined by the parameters.
(iv) A public method to set the coordinates of the point at the location defined
by the global protected variables x and y.
(v) A public get method to return the x-coordinate.
(vi) A public get method to return the y-coordinate.
(vii) A public String method to return the location of the point.
 */
public class Q6 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Point{
    protected int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String location(){
        return "The location is ("+x+", "+y+").";
    }
    
}