public class Ex08 implements Runnable{
    static boolean autoSave = false;

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
            // 멤버 변수 autoSave 의 값이 true 인 경우
            // autoSaveStatus() 를 호출함
            if(autoSave){
                autoSaveStatus();
            }
        }
    }

    public void autoSaveStatus(){
        System.out.println("자동 저장 되었습니다.");
    }

    public static void main(String[] args){
        System.out.println("Program Start");
        Thread thread = new Thread(new Ex08());

        //자신을 호출한 곳이 종료할 경우 해당 스레드도 종료
        thread.setDaemon(true);
        thread.start();

        /*
            --데몬 스레드--
            다른 스레드에 종속되어있어서 그 스레드가 종료될 때
            자동으로 같이 종료되는 스레드이다.
         */

        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println(i);
            if(i == 5){
                // autoSave 가 true 이면
                // autoSaveStatus() 가 호출됨
                // 5초 후에 자동으로 호출되도록 설정함
                autoSave = true;
            }
        }
    }

}
