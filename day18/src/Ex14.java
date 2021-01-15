
/*
    yield() : 다른 스레드가 동작하도록 순서를 양보함
 */

class Ex14Thread implements Runnable {
    volatile private boolean suspended =false;
    volatile private boolean stopped = false;

    Thread thread;

    public Ex14Thread(String name){
        thread = new Thread(this, name);
    }

    @Override
    public void run(){
        String name = thread.getName();

        while (!stopped){
            if(!suspended){
                System.out.println(" [" + Thread.currentThread().getName() + "] ");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(name + " - interrupted -> Thread sleep");
                }
            }
            else{
                Thread.yield();
            }
        }
        System.out.println(name + " - stopped");
    }

    public void suspend(){
        suspended = true;
        thread.interrupt();
        System.out.println(thread.getName()+ "- interrupted by suspend()");
    }

    public void resume(){
        suspended = false;
    }

    public void stop(){
        stopped = true;
        thread.interrupt();
        System.out.println(thread.getName() + " - interrupted by stop()");
    }

    public void start(){
        thread.start();
    }
}

public class Ex14 {
    public static void main(String[] args){
        Ex14Thread r1 = new Ex14Thread("▲");
        Ex14Thread r2 = new Ex14Thread("▲▲");
        Ex14Thread r3 = new Ex14Thread("▲▲▲");

        r1.start();
        r2.start();
        r3.start();

        Thread thread = new Thread(r1, "00");

        try {
            Thread.sleep(2000);
            r1.suspend();

            Thread.sleep(2000);
            r2.suspend();

            Thread.sleep(3000);
            r1.resume();

            Thread.sleep(3000);
            r1.stop();
            r2.stop();
            Thread.sleep(2000);
            r3.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
