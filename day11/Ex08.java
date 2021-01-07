/*
   인터페이스 (interface)
   
   다형성(polymorphism) 과 다중 상속을 위해서 사용하는 문법
   
   1) (원칙적으로) 모든 메소드는 추상 메소드임
      - public abstract
   2) 모든 멤버변수는 public static final 임 
   
   3) 생성자 선언 불가능함 (cf. 추상클래스에서는 생성자를 작성할 수 있음)
   
   4) 추상 메소드가 아닌 일반 메소드를 작성하지  X
   
*/

interface Inter01{
	// The blank final field number may not have been initialized
	public static final int number1 = 11;
	public static int number2 = 22;
	public int number3 = 33;
	int number5 = 55;
	
	public abstract void display1();
	public abstract void display2();
	abstract void display3();
	void display4();
}
// class(일반, 추상) 가 interface 상속할 때 : implements
class SubInter01 implements Inter01{

	@Override
	public void display1() {
		System.out.println("display1() in SubInter01");		
	}

	@Override 
	public void display2() { }

	@Override
	public void display3() { }

	@Override
	public void display4() { }
	
}
class SubInter02 implements Inter01{

	@Override
	public void display1() { 
		System.out.println("display1() in SubInter02");	
	}

	@Override
	public void display2() { }

	@Override
	public void display3() { }

	@Override
	public void display4() { }
	
}
class SubInter03 implements Inter01{
	
	@Override
	public void display1() { 
		System.out.println("display1() in SubInter03");	
	}
	
	@Override
	public void display2() { }
	
	@Override
	public void display3() { }
	
	@Override
	public void display4() { }
	
}

// interface 가 interface 를 상속할 때 : extends
interface Inter02 extends Inter01{
	
}
public class Ex08 {
  public static void main(String[] args){
  	// Cannot instantiate the type Inter01
  	// new Inter01();
  	Inter01 inter01 = new SubInter01();
  	        inter01.display1();
  	        inter01 = new SubInter02();
  	        inter01.display1();
  	        inter01 = new SubInter03();
  	        inter01.display1();
  	
  	
  	
  	
  	
  }
}






