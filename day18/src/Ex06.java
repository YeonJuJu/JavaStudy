public class Ex06 {
    public static void main(String[] args){
        Ex06Thread1 thread1 = new Ex06Thread1();
        Ex06Thread2 thread2 = new Ex06Thread2();
        Ex06Thread3 thread3 = new Ex06Thread3();

        // 우선순위를 정해주기 (1~10), default = 5
//        thread1.setPriority(10);
//        thread2.setPriority(1);

        // 우선순위로 지정한 숫자가 클수록 우선순위가 높다
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Thread1's priority : " + thread1.getPriority());
        System.out.println("Thread2's priority : " + thread2.getPriority());
        System.out.println("Thread3's priority : " + thread3.getPriority());
    }
}

class Ex06Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("[ " + Thread.currentThread().getName() + "] ");

        for(int i=0;i<500;i++){
            System.out.print("○");

            // for 문을 사용한 delay
           for(int x=0;x<10000000;x++);

        }
        System.out.println();
    }
}

class Ex06Thread2 extends Thread{

    @Override
    public void run() {
        System.out.println("[ " + Thread.currentThread().getName() + "] ");

        for(int i=0;i<500;i++){
            System.out.print("●");

            // for 문을 사용한 delay
            for(int x=0;x<10000000;x++);

        }
        System.out.println();
    }
}

class Ex06Thread3 extends Thread{

    @Override
    public void run() {
        System.out.println("[ " + Thread.currentThread().getName() + "] ");

        for(int i=0;i<500;i++){
            System.out.print("◎");

            // for 문을 사용한 delay
            for(int x=0;x<10000000;x++);

        }
        System.out.println();
    }
}
