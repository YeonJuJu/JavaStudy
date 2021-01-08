
//예외처리를 호출한 곳에서 하는 법
/*
    throw 를 이용하여 메소드 내에서 호출한다
    해당 메소드에는 throws Exception 을 이용하여 세팅한다

    예외처리를 받는 곳에서는 try/catch를 이용해여 예외처리를 한다
 */

public class Ex03 {
    public static void main(String[] args){
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main() 에서 예외처리 발생");
        }
    }
    public static void method1() throws Exception{
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("method1() 에서 예외처리 발생함");
            throw e;
        }

    }
}
