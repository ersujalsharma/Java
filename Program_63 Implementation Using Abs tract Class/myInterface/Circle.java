package myInterface;
import myInterface.*;
// Extending Geometry for Circle
public class Circle extends Geometry {
    public double r;
    public Circle (){
        r=1.0;
    }
    public Circle(double r){
        this.r=r;
    }
    public double area(){
        return PI*r*r;
    }
    public double circumference(){
        return 2*PI*r;
    }
    public double getRadius(){
        return r;
    }
}