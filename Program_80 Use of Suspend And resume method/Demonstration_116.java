class Thread1 extends Thread {
    public void run(){
        try{
            System.out.println("First thread starts running");
            sleep(10000);
            System.out.println("First thread finishes running");
        }
        catch(Exception e){ }
    }
}

class Thread2 extends Thread {
    public void run(){
        try{
            System.out.println("Second thread starts running");
            System.out.println("Second thread is suspended itself");
            suspend();
            System.out.println("Second thread runs again");
        }
        catch(Exception e){ }
    }
}

class Demonstration_116 {
    public static void main(String... args){
        try{
            Thread1 first = new Thread1();
            Thread2 second= new Thread2();
            first.start();
            second.start();
            System.out.println("Revuve the second thread");
            second.resume();
            System.out.println("Second thread went for 10 second sleep");
            second.sleep(10000);
            System.out.println("Wake up second thread and finishes running");
        }
        catch(Exception e){}
    }
}