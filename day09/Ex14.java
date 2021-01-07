
public class Ex14 {
  static int a = 10;
  static int[] arrNum = new int[10];
  
  // static 초기화블럭이
  // static 메소드보다 더 먼저 실행됨
  static {
  	for(int i = 0; i < arrNum.length; i++) {
  		arrNum[i] = (int)(Math.random() * 10) + 1;
  	}
  }
  
  public Ex14() { }
  
  public static void main(String[] args) {
  	// static  초기화 블럭에서 생성하고 초기화한 배열을
  	// main() 메소드에서 출력하기
  	for(int i = 0; i < arrNum.length; i++) {
  		System.out.printf("%d ", arrNum[i]);
  	}
  	System.out.println("\n=================================");
  	
  }
  
  
}
