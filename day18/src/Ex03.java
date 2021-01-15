/*
    Thread (쓰레드) : 프로그램이 실행되는 물리적인 흐름

    Process : 실행 중인 프로그램

    Process = resource + thread

    채팅 프로그램 , 데이터 전송 프로그램 : multi-task
    채팅 프로그램 + 데이터 전송 프로그램 : ex) 카톡

    locking
    synchronize

    single thread -> 순차적으로 실행
    multi thread  -> 동시에 실행

 */


//현재 쓰레드 이름 알아내기 : Thread.currentThread().getName()

public class Ex03 {
    public static void main(String[] args){
        System.out.println("현재 쓰레드 : " + Thread.currentThread().getName());
        System.out.println("main() method");
    }

}
