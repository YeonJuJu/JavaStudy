class Ex16Thread extends Thread{
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    @Override
    public void run(){
        while (true) {
            try {
                Thread.sleep(10 * 1000);    //->10초 sleep
            } catch (InterruptedException e) {
                System.out.println("Awaken by interrupt()");
            }
            garbageCollect(); // garbage collection
            System.out.println("메모리 정리됨. 사용 가능한 메모리 : " + freeMemory());
            //System.out.println("사용중인 메모리 : " + usedMemory);
        }
    }

    public void garbageCollect(){
        usedMemory -= 300;
        if(usedMemory < 0){
            usedMemory = 0;
        }
    }

    public int totalMemory(){
        return MAX_MEMORY;
    }

    public int freeMemory(){
        return MAX_MEMORY - usedMemory;
    }
}

public class Ex16 {
    public static void main(String[] args){
        Ex16Thread thread = new Ex16Thread();
        thread.setDaemon(true);
        thread.start();

        int requiredMemory = 0;

        for(int i=0;i<20;i++){
            requiredMemory = (int) (Math.random()*10)*20;

            // 필요한 메모리가 사용할 수 잇는 양보다 크거나
            // 전체 메모리의 60% 이상을 사용한 경우
            // garbageCollect() 를 실행하는 thread 를 깨움
            // <-- WAITING 상태에서 RUNNABLE 상태로 만듦
            if(thread.freeMemory() < requiredMemory || thread.freeMemory() < thread.totalMemory()*0.4){
                thread.interrupt(); // <-- WAITING 상태에서 RUNNABLE 상태로 만듦
            }

            thread.usedMemory += requiredMemory;
            System.out.println("usedMemory : " + thread.usedMemory);
        }
    }

}
