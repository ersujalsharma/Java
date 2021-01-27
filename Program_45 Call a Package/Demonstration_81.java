import java.lang.*;
class calculator{
    double i;
    double x;
    void p(){
        x=Math.sqrt(i);
    }
}
class Demonstration_81{
    public static void main(String[] sasd){
        calculator a = new calculator();
        a.i=20;
        a.p();
        System.out.print("square root of "+a.i+" is "+a.x);
        }
}
