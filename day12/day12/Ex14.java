
public class Ex14 {
  public static void main(String[] args) {
  	System.out.println("프로그램 시작");
  	
  	try {
  	  String str = null;  	
  	  System.out.printf("문자열의 길이 : %d%n", str.length());
  	}catch(NullPointerException e) {
  		System.out.println("NullPointerException 발생함");
  	}
  	System.out.println("프로그램 종료");
  }
}
