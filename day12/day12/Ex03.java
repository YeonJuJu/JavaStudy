interface I{
	public abstract void method();
}

class B3 implements I{  // Provider :  dependency (의존성)
	int num1 = 10, num3 = 30;
	@Override
	public void method() {
		System.out.println("method() in B3");
	}
	public void methodB() {
		System.out.println("methodB() in B3");
	}
  public String toString() {
  	return num1 + " -- " + num3;
  }
} 
class C3 implements I {  // Provider :  dependency (의존성)
	@Override
	public void method() {
		System.out.println("method() in C3");
	}	
	public void methodC() {
		System.out.println("methodC() in C3");
	}
} 
class D3 implements I {  // Provider :  dependency (의존성)
	@Override
	public void method() {
		System.out.println("method() in D3");
	}
	public void methodD() {
		System.out.println("methodD() in D3");
	}
} 
class E3 implements I {  // Provider :  dependency (의존성)
	@Override
	public void method() {
		System.out.println("method() in E3");
	}
} 
class A3{ // User
	public void methodA(I i) {
		System.out.println("method(I i) in class A3");
		i.method();
	}
}
public class Ex03 {
  public static void main(String[] args) {
  	A3 a = new A3();
  	I  i = new B3();
  	a.methodA(i);
  	   i = new C3();
  	a.methodA(i);
       i = new D3();
  	a.methodA(i);
       i = new E3();
  	a.methodA(i);
  	System.out.println("-------------------------");
  	
  	I[] arrI = new I[3];
  	arrI[0] = new B3();
  	arrI[1] = new C3();
  	arrI[2] = new D3();
  	
  	for(int j = 0; j < arrI.length; j++) {
  		arrI[j].method();
  	}
  	
  	
  }
}


