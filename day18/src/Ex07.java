public class Ex07 {
    public static void main(String[] args){
        ThreadGroup main = Thread.currentThread().getThreadGroup();

        //Thread group name 지정
        ThreadGroup group1 = new ThreadGroup("Group1");
        ThreadGroup group2 = new ThreadGroup("Group2");

        //부모 group name, 자식 group name
        ThreadGroup subGrp = new ThreadGroup(group1, "subGroup1");

        //Thread group group1 의 최대 우선순위를 3으로 변경
        group1.setMaxPriority(3);

        //Runnable interface 를 상속하는 익명클래스를 생성해서
        //run() 메소드를 작성
        //ㄴ Thread 로 동작하게 함
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    //Thread 를 1초간 멈춤
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        //Thread 객체 생성
        Thread thread1 = new Thread(group1, runnable, "thread1");
        Thread thread2 = new Thread(subGrp, runnable, "thread2");
        Thread thread3 = new Thread(group2, runnable, "thread3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(" : ThreadGroup Name :" + main.getName());
        System.out.println(" : 활성화된 ThreadGroup : " + main.activeGroupCount());
        System.out.println(" : 활성화된 Thread : " + main.activeCount());
    }
}
