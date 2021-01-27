// Use of yield(), stop(), sleep() methods
class ThreadA extends Thread{
    public void run(){
        System.out.println("Start Thread A ....");
        for(int i = 1; i<=5 ; i++){
            if(i==1) yield();
            System.out.println("From Thread A: i = "+i);
        }
        System.out.println("... Exit Thread A");
    }
}
class ThreadB extends Thread{
    public void run(){
        System.out.println("Start Thread B ....");
        for(int j = 1; j <=5; j++){
            System.out.println("From Thread B: j = "+ j);
            if(j == 2) stop();
        }
        System.out.println("...Exit Thread B");
    }
}

class ThreadC extends  Thread{
    public void run(){
        System.out.println("Start Thread C ....");
        for(int k =1; k<=5; k++){
            System.out.println("From Thread C k = "+ k);
            if(k == 3){
                try{
                    sleep(1000);
                }catch(Exception e){}
            }   
            
        }
        System.out.println("... Exit Thread C");
    }
}
class Demonstration_115{
    public static void main(String args[]){
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        ThreadC t3 = new ThreadC();
        t1.start();t2.start();t3.start();
        System.out.println("... End of Execution");
    }
}