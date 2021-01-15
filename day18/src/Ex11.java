import javax.swing.*;

class Ex11Thread extends Thread{
    @Override
    public void run(){
        int i=10;
        while(i != 0 && !isInterrupted()){
            System.out.println(i--);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("카운트 종료");
    }
}

public class Ex11 {
    public static void main(String[] args){
        Ex11Thread thread = new Ex11Thread();
        thread.start();

        String input = JOptionPane.showInputDialog("값을 입력하세요");
        System.out.println("input : " + input);

        //interrupt() 를 호출하여 interrupted 상태를 true 로 전환
        thread.interrupt();

        System.out.println("isInterrupted() : " + thread.isInterrupted());

    }
}
