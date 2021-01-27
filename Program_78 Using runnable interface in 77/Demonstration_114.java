class ThreadId implements Runnable{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId() +
            "is running");
        }catch(Exception e){
            //Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
public class Demonstration_114 {
    public static void main(String[] args){
        int n = 8; // Number of Threads
        for(int i=0;i<8;i++){
            Thread object =new Thread(new ThreadId());
            object.start();
        }
    }
}