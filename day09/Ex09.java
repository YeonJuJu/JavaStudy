
public class Ex09 {
  public static void main(String[] args) {
  	System.out.println("프로그램 시작");
  	new D(); 
  	System.out.println("프로그램 종료");
  }
}
class D{
	public D() {
		this(11);
		System.out.println("D() 실행 - 1");  // 1
	}
	public D(int i) {
		this(3.14F);
		System.out.println("D(int i) 실행 - 2"); // 2
	}
	public D(float f) {
		this(6.25);
		System.out.println("D(float f) 실행 - 3");  // 3
	}
	public D(double d) {
		System.out.println("D(double d) 실행 - 4");  // 4
	}
}





