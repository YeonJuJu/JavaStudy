class Ex15Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<300;i++){
            System.out.print(new String("◎"));
        }
    }
}

class Ex15Thread2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<300;i++){
            System.out.print(new String("●"));
        }
        System.out.println();
    }
}

public class Ex15 {
    static long startTime = 0;

    public static void main(String[] args){
        Ex15Thread1 thread1 = new Ex15Thread1();
        Ex15Thread2 thread2 = new Ex15Thread2();

        thread1.start();
        thread2.start();

        startTime = System.currentTimeMillis();

        try{
            // main thread 가 thread1 의 작업이 마칠 때까지 기다림
            thread1.join();

            // main thread 가 thread2 의 작업이 마칠 때까지 기다림
            thread2.join();
        }catch (InterruptedException e){

        }

        System.out.println("처리시간 : " + (System.currentTimeMillis()-startTime) +"m/s");
        System.out.println("프로그램 종료");
    }
}
