import java.util.InputMismatchException;
import java.util.Scanner;

/*
  throws 로 예외처리하는 방법
  (여러 메소드에서 같은 예외가 발생하는 경우,)
  예외 처리를 바로 하지 않고
  해당 메소드를 호출한 곳으로 예외처리를 미루는 방법
*/


public class Ex18 {
  public static void exceptionTest1() {
  	Scanner sc = new Scanner(System.in);
  	System.out.print("정수를 입력하세요 : "); 
  	try {
			int num = sc.nextInt();
			System.out.println("num :" + num);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException 발생");
		}
  }
  public static void exceptionTest2() {
  	Scanner sc = new Scanner(System.in);
  	System.out.print("정수를 입력하세요 : "); 
  	try {
			int num = sc.nextInt();
			System.out.println("num :" + num);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException 발생");
		}
  }
  public static void exceptionTest3() {
  	Scanner sc = new Scanner(System.in);
  	System.out.print("정수를 입력하세요 : "); 
  	try {
			int num = sc.nextInt();
			System.out.println("num :" + num);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException 발생");
		}
  }  
  public static void main(String[] args) {
  	System.out.println("프로그램 시작");
  	exceptionTest1();
  	exceptionTest2();
  	exceptionTest3();
  	System.out.println("프로그램 종료");
  }
}
