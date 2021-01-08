
/*
  예외 처리 (Exception Handling)
    ㄴ 예외 : 프로그램 소스를 수정해서 해결할 수 있는 오류
       에러 : 프로그램 소스를 수정해서 해결할 수 없는 오류
  
  try - catch (- finally)
    예외가 발생할 가능성이 있는 부분을
    code block으로 묶어서 처리함
    
    try{
      예외가 발생할 가능성이 있는 code
    }catch(예외처리클래스이름 변수){
      예외가 발생한 경우 처리하는 code      
    }
    
    try code block 내부에서 발생되는 예외는
    이미 정의된 예외처리 클래스의 객체로 생성되어
    catch code block 으로 전해짐 : 이곳에서 예외를 처리함
    
*/

public class Ex13 {
  public static void main(String[] args) {
  	System.out.println("프로그램 시작");
  	
  	int n1 = 10;
  	int n2 = 0;
  	int result = 0;
  	
  	try {
    	result = n1 / n2;
    	System.out.printf("%d / %d = %d%n", n1, n2, result);
  	}catch(ArithmeticException e) {
  		System.out.println("ArithmeticException 발생 !!!");
  	}
  	
  	System.out.println("프로그램 종료");
  }
}






