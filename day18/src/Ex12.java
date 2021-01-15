/*
    suspend() : WAITING
    resume()  : RUNNABLE
    stop()    : TERMINATED
 */

class Ex12Thread extends Thread{
    @Override
    public void run(){
        while(true){
            try {
                sleep(1000);
                System.out.println(" [" + Thread.currentThread().getName() +"] ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Ex12 {
    public static void main(String[] args){
        Ex12Thread r = new Ex12Thread();
        Thread thread1 = new Thread(r, "★");
        Thread thread2 = new Thread(r, "★★");
        Thread thread3 = new Thread(r, "★★★");
        Thread thread4 = new Thread(r, "★★★★");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(2000);
            thread1.suspend();

            Thread.sleep(2000);
            thread2.suspend();

            Thread.sleep(2000);
            thread3.suspend();

            Thread.sleep(2000);
            thread4.suspend();

            thread1.resume();
            Thread.sleep(2000);

            thread2.resume();
            Thread.sleep(2000);

            thread3.resume();
            Thread.sleep(2000);

            thread4.resume();
            Thread.sleep(2000);

            thread1.stop();
            thread2.stop();
            thread3.stop();
            thread4.stop();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
