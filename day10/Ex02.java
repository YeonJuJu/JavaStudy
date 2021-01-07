// 모든 클래스의 조상 클래스
// Object
/*
  class A extends Object{
    @Override 
    public String toString() {
    	return super.toString();
    }	  
  }
*/
// Overriding
// 부모클래스에서 상속받은 메소드를 자식클래스에서
// 자식클래스에 맞게 재정의하는 것
//                    ㄴ body(몸통) 부분의 내용을 변경하는 것
// 자식클래스의 메소드의 선언부가 
// 부모클래스의 메소드의 선언부와 일치해야 함
// 매개변수부(type, 순서, 개수)가 일치해야 함
// return type 까지 일치해야 함
// 다른 클래스에서 일어남

// cf. overloading
//     매개변수부(type, 순서, 개수)가 일치하지 않아야 함
//     return type 은 overloading 에 영향을 미치지 않음
//     같은 클래스 안에서 일어남

class Animal{
	public void sound() {
		System.out.println("소리를 냅니다");
	}
}
class Dog extends Animal{
	@Override
	public void sound() {
		super.sound();
		System.out.println("멍멍~~~");
	}  	
}
class Cat extends Animal{
	@Override
	public void sound() {
		super.sound();
		System.out.println("야옹~~~");
	}	
}
public class Ex02 {
  public static void main(String[] args) {
  	Dog dog = new Dog();
  	Cat cat = new Cat();
  	dog.sound();
  	cat.sound();
  	
  }
}








