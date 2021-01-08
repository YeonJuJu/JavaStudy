import java.util.InputMismatchException;
import java.util.Scanner;

/*
  try - catch - finally
  
  finally : 예외가 발생하든 안 하든
            무조건 실행되어야 하는  code 를 작성하는 부분
*/

public class Ex17 {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	
  	try {
			System.out.print("정수를 입력하세요 : ");
			int number = sc.nextInt();
			System.out.printf("입력된 정수는 %d입니다%n", number);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException 발생");
		} finally {
			System.out.println("finally block 실행 !!!");
			System.out.println("sc.close() 실행");
			sc.close();
		}
  	System.out.println("프로그램 종료");
  	
  }  // main
}  // class




