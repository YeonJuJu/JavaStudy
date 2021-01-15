
//  volatile -> 메인 메모리에 저장하고 메인 메모리에서 직접 참조

class Ex13Thread implements Runnable {
    volatile boolean suspended =false;
    volatile boolean stopped = false;

    @Override
    public void run(){
        while(!stopped){
            if(!suspended) {
                System.out.println(" [" + Thread.currentThread().getName() + "] ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(" [" + Thread.currentThread().getName() +"] ==> Stopped");
    }

    public void suspend(){
        suspended = true;
    }

    public void resume(){
        suspended = false;
    }

    public void stop(){
        stopped = true;
    }
}

public class Ex13 {
    public static void main(String[] args){
        Ex13Thread r1 = new Ex13Thread();
        Ex13Thread r2 = new Ex13Thread();
        Ex13Thread r3 = new Ex13Thread();

        Thread thread1 = new Thread(r1, "■");
        Thread thread2 = new Thread(r2, "■■");
        Thread thread3 = new Thread(r3, "■■■");

        thread1.start();
        thread2.start();
        thread3.start();

        try{
            Thread.sleep(2000);
            r1.suspend();
            Thread.sleep(2000);
            r2.suspend();
            Thread.sleep(2000);
            r3.suspend();

            r1.resume();
            r2.resume();
            Thread.sleep(2000);
            r3.resume();

            r1.stop();
            r2.stop();
            Thread.sleep(2000);
            r3.stop();
        }catch (Exception e){}
    }
}
