public class Demonstration_118 extends Thread{
    public static int x;
    public void run(){
        for(int i =0;i<1000;i++){
            x=x+i;
            x=x-i;
        }
    }
    public static void main(String[] args){
        x=0;
        for(int i = 0;i<1000; i++){
            new Demonstration_118().start();
            System.out.println(x); // x is not always zero
        }
    }
}