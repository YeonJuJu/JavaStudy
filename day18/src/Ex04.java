public class Ex04 {
    public static void main(String[] args){
        System.out.println("[" + Thread.currentThread().getName()+"]");

        Ex04Thread1 ex04Thread1 = new Ex04Thread1();

        // run을 하면 순차적으로 실행.
        // 스레드 먼저 실행했으니 스레드가 실행된 뒤 리턴 후 메인 함수 실행
        ex04Thread1.run();

        for(int i=0;i<500;i++){
            System.out.print("●");
        }
        System.out.println();

        System.out.println("[" + Thread.currentThread().getName()+"]");

        // start를 하면 번갈아가면서 실행
        ex04Thread1.start();

        for(int i=0;i<500;i++){
            System.out.print("●");
        }
        System.out.println("main 종료");
    }
}

class Ex04Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("[" + Thread.currentThread().getName()+"]");
        for(int i=0;i<500;i++){
            System.out.print("○");
        }
        System.out.println("Thread1 종료");
    }
}
