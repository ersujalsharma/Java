package myPackage1;
public class Y extends X{
    public Y(){
        System.out.println("I am constructor from class Y:");
        System.out.println("n="+n);
        //System.out.println("p=+p"); // Error p is a private
        //member of X. Not accessible outside X.
        System.out.println("q="+q); //protected is accessible becau inheritance
        System.out.println("r="+r); //public is accessible
    }
}
