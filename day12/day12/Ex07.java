
public class Ex07 {  // outer class
	class InstanceInner{ }
	static class StaticInner{ }
	
	// Ex07 클래스의 멤버변수로
	// 내부클래스 type의 변수를 가질 수 있음
	
	// 인스턴스 멤버 간에는 서로 직접 접근이 가능함
	InstanceInner iv = new InstanceInner();
  // Static 멤버 간에는 서로 직접 접근이 가능함
	StaticInner sv = new StaticInner();
	
	public static void staticMethod() {
		// static 메소드에서는 instance 멤버변수에 직접 접근할 수 없음
		// InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
		
		// 객체를 생성한 후에야
		// static 메소드에서는 instance 멤버변수에 접근할 수 있음
		
		Ex07 outer = new Ex07();
		InstanceInner inner = outer.new InstanceInner();
		
	}
	public void instanceMethod() {
		// instance 메소드에서는
		// instance 멤버와 static 멤버 모두 접근이 가능함
		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
		// LocalInner cannot be resolved to a type
		// local inner class 에는 외부(다른 메소드...)에서 접근 불가
		// LocalInner lv = new LocalInner();
		
	}
	
	public void method() {
		class LocalInner{ }
		LocalInner lv = new LocalInner();
	}
	

}
