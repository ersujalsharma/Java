package myPackage2;
import myPackage1.*;
public class B{
    public B(){
        myPackage1.X x = new myPackage1.X();
        //create an object of class x;
        System.out.println("I am  constructor from B of myPackage2");
        //System.out.println("n from B of myPackage2"+x.n);//Error;
        //Default variable but it is not accessible here.
        //System.out.println("p from B of myPackage2"+x.p);// Error; private of x
        //Protected member is accessible by inheritance
        //System.out.println("q from B of myPackage2"+x.q);  
        //Error protection
        System.out.println("r from B of myPackage2"+x.r);
        //public is accessible   

    }
}