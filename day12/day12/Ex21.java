import java.util.Scanner;

public class Ex21 {
	public static void exceptionTest() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("양수를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number < 0) {
			throw new Exception("사용자가 음수를 입력했습니다 - " + number);
		}
		System.out.printf("입력된 양수는 %d입니다%n", number);
	}
	
  public static void main(String[] args) {
  	try {
			exceptionTest();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
  	
  }
}



