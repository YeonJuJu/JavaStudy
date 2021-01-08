
// 내부 클래스
// 클래스 안에서 클래스를 정의함
// instance inner class
// static inner class
// local inner class - 메소드 안에서 정의함
// Anonymous inner class
// (이름없는 내부 클래스)
// 가 있음

/*
  내부 클래스 : inner class - nested class
   
   클래스 내부에 선언된 클래스
   A클래스 내부에 B클래스를 선언하면
   B클래스가 내부클래스가 됨 (A클래스 - 외부클래스)
   내부 클래스인 B 클래스는 A 클래스를 제외하고
   다른 클래스에서는 잘 사용되지 않음
   
   내부 클래스의 종류
   
   1) instance class
    외부 클래스의 멤버변수 선언위치에 선언됨
    외부 클래스의 instance member 처럼 다루어짐
    외부 클래스의 instance member들과 관련된 작업에 사용됨
    
   2) static class
    외부 클래스의 멤버변수 선언위치에 선언됨
    외부 클래스의 static member 처럼 다루어짐
    외부 클래스의 static member들과 관련된 작업에 사용됨
       
   3) local class
    외부 클래스의 method나 initializing block 안에 선언함
    선언된 영역 내부에서만 사용함
    
   4) anonymous class <-- 어떤 클래스의 자손클래스가 익명클래스가 됨
                          클래스의 선언과 객체의 생성을 동시에 하는
                          이름 없는 클래스 - 일회용으로 사용함 
   
*/
public class Ex06 {  // outer class
	// instance inner class
	class InstanceInner{
		int iv = 111;
		// The field cv cannot be declared static in a non-static inner type, 
		// unless initialized with a constant expression
		// static int cv = 111;
		// final static 은 상수이므로 허용함
		final static int CONST = 111;
	}
	// static inner class
	static class StaticInner{
		int iv = 222;
		// static inner class 에서만 static 멤버변수를 선언+초기화할 수 있음
		static int cv = 222;
		final static int CONST = 222;
	}
	public void method() {
		class LocalInner{
			int iv = 333;
			// The field cv cannot be declared static in a non-static inner type, 
			// unless initialized with a constant expression
			// static int cv = 333;
			// final static 은 상수이므로 허용함
			final static int CONST = 333;
		}
	}
	// 내부클래스는 주로 외부클래스에서만 사용하고
	// 다른 클래스에서는 거의 사용하지 않는 경우 사용함
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}





