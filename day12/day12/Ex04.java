import java.util.Scanner;

interface Calculation{
	public abstract int calculate(int n1, int n2);
}
class Adding implements Calculation{
	@Override
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}
}
class Subtraction implements Calculation{
	@Override
	public int calculate(int n1, int n2) {
		return n1 - n2;
	}
}
class Multiplicaiton implements Calculation{
	@Override
	public int calculate(int n1, int n2) {
		return n1 * n2;
	}
}
class Division implements Calculation{
	@Override
	public int calculate(int n1, int n2) {
		return n1 / n2;
	}                    // Calculation c = new Adding(); 
}                      // user.methodUser(c);
class User{            // 
	public int methodUser(Calculation c) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자를 입력하세요 : ");
    int number1 = sc.nextInt();
    System.out.print("두 번째 숫자를 입력하세요 : ");
    int number2 = sc.nextInt();
		// int result = c.calculate(number1, number2);
		return c.calculate(number1, number2);
	}
}
public class Ex04 {
	public static void main(String[] args) {
		int result = 0;
		
		User user = new User();
		
		Calculation c = new Adding(); 
		result = user.methodUser(c);
		System.out.println("덧셈 결과 : " + result);
		
		c = new Subtraction() ;
		result = user.methodUser(c);
		System.out.println(" 뺄셈 결과 : " + result);
		
		c = new Multiplicaiton() ;
		result = user.methodUser(c);
		System.out.println(" 곱셈 결과 : " + result);
		
		c = new Division();
		result = user.methodUser(c);
		System.out.println("나눗셈 결과 : " + result);
		
		
		
	}

}




