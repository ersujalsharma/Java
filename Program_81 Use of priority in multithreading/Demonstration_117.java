class ThreadA extends Thread {
    public void run(){
        System.out.println("Start Thread A ....");
        for(int i = 1;i<=5;i++){
            System.out.println("From Thread A: i= "+i);
        }
        System.out.println("Exit Thread A");
    }
}
class ThreadB extends Thread {
    public void run(){
        System.out.println("Start Thread B ....");
        for(int j = 1;j<=5;j++){
            System.out.println("From Thread B: j= "+j);
        }
        System.out.println("Exit Thread B");
    }
}
class ThreadC extends Thread {
    public void run(){
        System.out.println("Start Thread C ....");
        for(int k = 1;k<=5;k++){
            System.out.println("From Thread C: k= "+k);
        }
        System.out.println("Exit Thread C");
    }
}

class Demonstration_117 {
    public static void main(String args[]){
        Thread t1 = new ThreadA();
        Thread t2 = new ThreadB();
        Thread t3 = new ThreadC();
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(t2.getPriority()+1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("... End of Execution");
    }
}