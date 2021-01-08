

class B2 {  // Provider :  dependency (의존성)
	int num1 = 10, num2 = 20;
	public void methodB() {
		System.out.println("methodB() in B2");
	}
  public String toString() {
  	return num1 + " -- " + num2;
  }
} 
class C2 {  // Provider :  dependency (의존성)
	public void methodC() {
		System.out.println("methodC() in C2");
	}
} 
class D2 {  // Provider :  dependency (의존성)
	public void methodD() {
		System.out.println("methodD() in D2");
	}
} 
class E2 {  // Provider :  dependency (의존성)
	public void methodE() {
		System.out.println("methodE() in E2");
	}
} 
class A2{ // User
	public void methodA(B2 b) {
		System.out.println("method1(B2 b) in class A2");
		b.methodB();
	}
	public void methodA(C2 c) {
		System.out.println("method1(C2 b) in class A2");
		c.methodC();
	}
	public void methodA(D2 d) {
		System.out.println("method1(D2 b) in class A2");
		d.methodD();
	}
	public void methodA(E2 e) {
		System.out.println("method1(E2 e) in class E2");
		e.methodE();
	}
}
public class Ex02 {
  public static void main(String[] args) {
  	A2 a = new A2();
  	B2 b = new B2();
  	C2 c = new C2();
  	D2 d = new D2();
  	
  	a.methodA(b);
  	a.methodA(c);
  	a.methodA(d);
  	
  }
}


