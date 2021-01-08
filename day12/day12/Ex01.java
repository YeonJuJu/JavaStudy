
class A{ // User
	int number;
	String name;
	public A() { }
	public A(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public void method1(B b) {
		System.out.println("method1(B b) in class A");
	}
	public void method2(C c) {
		System.out.println("method2(C c) in class A");
	}
}
class B { int num1, num2; } // Provider :  dependency (의존성)
class C { int num3, num4; } // Provider :  dependency (의존성)
public class Ex01 {
  public static void main(String[] args) {
  	A a = new A();
  	
  	a.method1(new B());
  	a.method2(new C());
  }
}


