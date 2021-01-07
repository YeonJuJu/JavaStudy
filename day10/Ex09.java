class ParentB{
	public ParentB() {
		this(10);
		System.out.println("ParentB()-4"); // 4
	}
	public ParentB(int i) {
		this(3.14F);
		System.out.println("ParentB(int i)-5"); // 5
	}
	public ParentB(float f) {
		System.out.println("ParentB(float f)-6"); // 6
	}
}
class ChildB extends ParentB{
	public ChildB() {
		super(); // 생략 가능
		System.out.println("ChildB()-1"); // 1
	}
	public ChildB(int i) {
		this();
		System.out.println("ChildB(int i)-2"); // 2
	}
	public ChildB(float f) {
		this(30);
		System.out.println("ChildB(float f)-3"); // 3
	}
  
}
public class Ex09 {
  public static void main(String[] args) {
  	System.out.println("프로그램 시작");
  	new ChildB(6.25F);
  	System.out.println("프로그램 종료");
  }
}



