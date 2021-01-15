public class Ex05 {
    public static void main(String[] args){
        System.out.println("[ " + Thread.currentThread().getName() + "] ");

        for(int i=0;i<500;i++){
            System.out.print("◐");
        }
        System.out.println();

        //다음과 같이 실행함
        Runnable r = new Ex05Thread();
        Thread thread = new Thread(r);
        thread.start();

        for(int i=0;i<500;i++){
            System.out.print("◑");
        }
        System.out.println();

        for(int i=0;i<500;i++){
            System.out.print("●");
        }
        System.out.println();
    }
}

class Ex05Thread implements Runnable{

    @Override
    public void run() {
        System.out.println("[ " + Thread.currentThread().getName() + "] ");

        for(int i=0;i<500;i++){
            System.out.print("○");
        }
        System.out.println();
    }
}
