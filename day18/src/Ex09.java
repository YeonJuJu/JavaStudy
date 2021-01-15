/*
    Thread 의 상태

    NEW     : Thread 가 생성되고 아직 start() 메소드가 호출되지 않은 상태
    RUNNABLE: 실행 중이거나 실행 가능한 상태
        ㄴ[READY]
    BLOCKED : 동기화 블럭에 의해서 일시 정지된 상태
              ㄴ LOCK 이 풀릴 때까지 잠시 기다리는 상태
    WAITING : Thread 의 작업이 종료되지는 않았으나 실행이 불가능한 일시정지 상태
              unrunnable <= sleep(), wait(), join()
    TIME-WAITING : 일시 정지 시간이 지정된 경우
    TERMINATED   : Thread 의 작업이 종료된 상태
 */

class Ex09Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            System.out.print("◆");
        }
        System.out.println("\n<< Thread1 종료 >>");
    }
}

class Ex09Thread2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<500;i++){
            System.out.print("◇");
        }
        System.out.println("\n<< Thread2 종료 >>");
    }
}

public class Ex09 {
    public static void main(String[] args){
        Ex09Thread1 thread1 = new Ex09Thread1();
        Ex09Thread2 thread2 = new Ex09Thread2();

        thread1.start();
        thread2.start();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }

        System.out.println("<< Main Thread 종료 >>");
    }

}
