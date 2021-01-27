interface I1{
    public static final double PI=3.1413;
    static final double lambda = 0.04;
    // int x; //Declaration of any instance variable is NOT allowed.
    int x=100;//Initialization of variable is necessary.
    // private static final int p =444;
        //Error:Private/ protected is NOT allowed.
        //abstract public static void methodI1(); //Static method is not allowed.
    void methodI2(); // public abstract by default
}
class A1 implements I1{
    public int a1 = 555;
    public void methodI1(){
        System.out.println("From I1 "+PI);
    }
    public void methodI2(){
        System.out.println("Again from I1 "+lambda);
    }
}
//Here is the main class
public class Demonstration_93{
    public static void main(String... abcd){
        A1 a = new A1();
        a.methodI1();
        a.methodI2();
    }
}