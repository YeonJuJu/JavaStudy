import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
  	System.out.println("프로그램 시작");
  	
  	Scanner sc = new Scanner(System.in);
  	int number = 0;
  	
    try {
    	System.out.print("정수를 입력하세요 : ");
    	number = sc.nextInt();
    	
    	String str = null;
    	System.out.printf("문자열의 길이 : %d%n", str.length());
    	
    	int[] arrNum = new int[3];
    	arrNum[3] = 111;
    	
    }catch(NullPointerException e) {
     	System.out.println("Exception 발생");
    }catch(InputMismatchException e) {
    	System.out.println("InputMismatchException 발생");
    }catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("ArrayIndexOutOfBoundsException 발생");
    }catch(Exception e) {
     	System.out.println("Exception 발생");
    }
  	
  	/*
  	  InputMismatchException 
  	  NullPointerException
  	  ArrayIndexOutOfBoundsException
  	  Exception : 최상위 예외 클래스 catch 구문은
  	              맨 마지막에 선언해 주어야 함
  	    <-- 다중 catch 구문을 선언하는 경우에는
  	        예외 클래스들 간의 상속관계를 고려해야 함            
  	*/
  	
    System.out.println("입력된 정수 : " + number);
    
  	System.out.println("프로그램 종료");
  }
}
