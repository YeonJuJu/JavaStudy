
class A{
	int i;
	float f;
	
	// 기본 생성자
	public A() {
		System.out.println("A()[기본생성자] 호출 !!");
	}
	// 매개변수 있는 생성자
	public A(int i, float f) {
		System.out.println("A(int i, float f) 호출 !!");
		this.i = i;
		this.f = f;
	}
	public A(float f, int i) {
		System.out.println("A(float f, int i) 호출 !!");
		this.i = i;
		this.f = f;
	}
	public A(int i) {
		System.out.println("A(int i) 호출 !!");
		this.i = i;
	}
	public A(float f) {
		System.out.println("A(float f) 호출 !!");
		this.f = f;
	}

	public A(int num1, int num2, int num3) {
		System.out.println("A(int num1, int num2, int num3) 호출 !!");
	}
	@Override
	public String toString() {
		return i + " : " + f;
	}
}
public class Ex04 {
  public static void main(String[] args) {
  	System.out.println(new A());
  	A a1 = new A();
  	System.out.println(a1);
  	
  	A a2 = new A(11, 22, 33);
  	System.out.printf("a2.i : %d, a2.f : %.2f%n", a2.i, a2.f);
  	
  	A a3 = new A(55, 66.0F);
  	System.out.printf("a3.i : %d, a3.f : %.2f%n", a3.i, a3.f);
  	
  	A a4 = new A(55.65F, 66);
  	System.out.printf("a4.i : %d, a4.f : %.2f%n", a4.i, a4.f);
  	
  	A a5 = new A(111);
  	System.out.printf("a5.i : %d, a5.f : %.2f%n", a5.i, a5.f);
  	
  	A a6 = new A(123.345F);
  	System.out.printf("a6.i : %d, a6f : %.2f%n", a6.i, a6.f);
  	
  	
  }
}



