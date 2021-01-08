// default method
// Super가 class인 경우에는 Super의 method를 수정해도
// Sup class에서 반드시 구현해야 하지 않으나
// Super가 interface인 경우에는
// Super의 method를 수정하면 (signature:선언부)
// Sub class에서 Overriding한 method도 모두 수정해야 함
// interface에서 method를 definition 할 때
// default라는 키워드를 앞에 붙여주면
// 이 method는 abstract 로 definition하지 않아도 됨
// access modifier는 public 이어야 함 + body { } 가 있어야 함

// 1) 여러 interface의 default method 사이에서 일어나는 충돌
// <-- interface를 구현한 클래스에서 default method를 overriding함
// 2) default method와 Super(Parent) 클래스 method 사이에서 일어나는 충돌
// <-- Super 클래스의 method가 상속되고, default method는 무시됨

public class Ex05 {
  public static void main(String[] args) {
  	Child ch = new Child();
  	ch.method1();
  	ch.method2();
  	MyInterface1.staticMethod();
  	MyInterface2.staticMethod();
  }
}
class Parent{
	public void method2() {
		System.out.println("method2() in Parent");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2{
	@Override
	public void method1() {
		System.out.println("method1() in Child");
	}
}
// interface에는 추상메소드만 작성할 수 있었으나
// 유지보수의 어려움이 있어서
// default, static  메소드를 작성할 수 있도록 함
interface MyInterface1{
	default void method1() {
		System.out.println("method1() in MyInterface1");
	}
	default void method2() {
		System.out.println("method2() in MyInterface1");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface1");
	}
}
interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}







