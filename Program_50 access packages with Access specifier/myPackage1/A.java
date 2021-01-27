package myPackage1;
import myPackage1.X;
public class A{
    public A(){
        X x= new X();
        System.out.println("Same package constructor.....");
        System.out.println("n from A"+x.n);
        // Default variable is accessible in the same package
        //System.out.println("p from A"+x.p); //Error
        System.out.println("q from A"+x.q); 
        //Protected is accesible by inheritance
        System.out.println("r from A"+x.r); // OK: public
    }
}