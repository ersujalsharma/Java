// Case 2: Example of "Extends" with "implements"
class A{
    protected int j = 1000;
    void print(){
        System.out.println("I am from A"+j);
    }
}
interface I {
    public static int i = 555;
    void printInterface();
}
class B extends A implements I {
    public int aValue = 999;
    public void printInterface(){
        System.out.println("I am from I"+i);
    }
    public void printB(){
        super.print();
        printInterface();
    }
}
public class Demonstration_99{
    public static void main(String... ajn){
        B b =new B();
        b.printB();
    }
}

