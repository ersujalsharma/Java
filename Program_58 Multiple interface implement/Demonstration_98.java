interface I1{
    int i = 123;
    void printI1();
}
interface I2{
    public static int j = 123;
    void printI2();
}
class A implements  I1, I2{
    public int aValue = 999;
    public void printI1(){
        System.out.println("I am from I1" + i);
    }
    public void printI2(){
        System.out.println("I am from I2" + j);
    }
    public void printA(){
        System.out.println("I am from A" + (aValue = i+j));
    }   
}
class Demonstration_98 {
    public static void main(String... asjdfi){
        A a = new A();
        a.printA();
        a.printI2();
        a.printI1();
    }
}