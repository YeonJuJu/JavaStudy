import javax.swing.*;

class Ex10Thread extends Thread{
    @Override
    public void run(){
        int i=10;
        while(i != 0 && !isInterrupted()){
            System.out.println(i--);

            //for 반복문을 이용해 delay
            for(long x=0;x<2600000000l;x++);
        }
        System.out.println("카운트 종료");
    }
}

public class Ex10 {
    public static void main(String[] args){
        Ex10Thread thread = new Ex10Thread();
        thread.start();

        String input = JOptionPane.showInputDialog("값을 입력하세요");
        System.out.println("input : " + input);

        //interrupt() 를 호출하여 interrupted 상태를 true 로 전환
        thread.interrupt();

        System.out.println("isInterrupted() : " + thread.isInterrupted());

    }
}
