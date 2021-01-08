import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	
  	int number = 0;
  	
  	do{
    	try {
    	  System.out.print("0이 아닌 정수를 입력하세요 : ");
    	  number = sc.nextInt();
    	}catch(InputMismatchException e) {
    		number = 0;
    		sc.next();
    		System.out.println("정수만 입력해 주세요");
    	}
  	}while(number == 0);
  	
  	
  	System.out.printf("입력된 정수 : %d%n", number);
  	System.out.println("프로그램 종료");
  	
  }
}
