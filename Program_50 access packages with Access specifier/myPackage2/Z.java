package myPackage2;
import myPackage1.*;
public class Z extends myPackage1.X{
    public Z(){
        System.out.println("I am  constructor from class Z:");
        //System.out.println("n from Z"+n);//Error;
        //Default is not accessible outside its a package.
        //System.out.println("p from z"+p);// Error; private of x
        //Protected member is accessible by inheritance 
        System.out.println("r from z"+r);
        //public is accessible   
    }
} 