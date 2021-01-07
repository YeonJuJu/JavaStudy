class C{
	int i;
	float f;
	
	public C(int i) {
		this(i, 3.14F);
		System.out.println("C(int i) 실행"); // 1
	}
	public C(float f) {
		this(5, f);
		System.out.println("C(float f) 실행"); // 2
	}
	public C(int i, float f){
		this.i = i;
		this.f = f;
		System.out.println("C(int i, float f) 실행"); // 3
	}
	@Override
	public String toString() {
		return i + " -- " + f;
	}
}
public class Ex08 {
  public static void main(String[] args) {
  	System.out.println("프로그램 시작");
  	C c1 = new C(11);  // i: ?, f : ?
  	System.out.println("c1 : " + c1);
  	
  	C c2 = new C(56.48F);  // i: ?, f : ?
  	System.out.println("c2 : " + c2);
  	
  	C c3 = new C(33, 456.78F); 
  	System.out.println("c3 : " + c3);
  	
  	System.out.println("프로그램 종료");
  }
}
