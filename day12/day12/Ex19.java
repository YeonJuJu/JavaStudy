import java.util.InputMismatchException;
import java.util.Scanner;

/*
  throws 로 예외처리하는 방법
  (여러 메소드에서 같은 예외가 발생하는 경우,)
  예외가 발생한 곳에서 예외 처리를 바로 하지 않고
  해당 메소드를 호출한 곳으로 예외처리를 미루는(throws) 방법
*/
/* *******************************************************************
// 자바에서는 static method 는  overriding 을 허용하지 않음
// instance method인 경우에는
// JVM이 runtime 시에 생성된 객체에 접근해서 실행하지만,
//                          ㄴ 자손 객체에 접근해서 실행할 수 있음
// static method인 경우에는
// JVM이 객체를 생성하기 전인 compile 시점에 선언된 type(클래스)에
// 접근해서 static method를 실행하기 때문에
// 객체가 생성된 이후에 상속되어 overriding된 method 는 실행할 수 없음
 ******************************************************************* */

public class Ex19 {
  public static void exceptionTest1() throws InputMismatchException{
  	Scanner sc = new Scanner(System.in);
  	System.out.print("정수를 입력하세요 : "); 
		int num = sc.nextInt();
		System.out.println("num :" + num);
  }
  public static void exceptionTest2() throws InputMismatchException{
  	Scanner sc = new Scanner(System.in);
  	System.out.print("정수를 입력하세요 : "); 
		int num = sc.nextInt();
		System.out.println("num :" + num);
  }
  public static void exceptionTest3() throws InputMismatchException{
  	Scanner sc = new Scanner(System.in);
  	System.out.print("정수를 입력하세요 : "); 
		int num = sc.nextInt();
		System.out.println("num :" + num);
  }  
  
  public static void main(String[] args) {
  	System.out.println("프로그램 시작");
  	
  	try {
			exceptionTest1();
			exceptionTest2();
			exceptionTest3();
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException 발생");
		}
  	
  	
  	
  	
  	System.out.println("프로그램 종료");
  }
}
