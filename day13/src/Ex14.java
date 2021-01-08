
public class Ex14 {
  public static void main(String[] args) {
  	
  	// int type 을  String type으로 바꾸기
  	
  	// 1) 어떤 type이든 문자열과 + 연산을 하면
  	//    문자열로 변환됨
  	
  	int number = 111;
  	System.out.println("number : " + number);
  	String strNum = number + "";  	
  	System.out.println("strNum : " + strNum);
  	
  	// 2) String 클래스의 valueOf() 메소드를 사용하는 방법
  	//                      ㄴ static 메소드
  	String strVal1 = String.valueOf(number);
  	
  	
  	// 3) 문자열을 int type 으로 바꾸기
  	//    Integer 클래스의 parseInt() 메소드를 사용하는 방법
  	//                      ㄴ static 메소드
  	Integer intNum1 = Integer.parseInt(strVal1);
  	
  	String strVal2 = "222";
  	
  	Integer intNum2 = Integer.parseInt(strVal2);
  	
  	int result = intNum1 + intNum2;
  	System.out.println("result : " + result);
  	
  	
  }
}
