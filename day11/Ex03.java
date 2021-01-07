/*
  추상 클래스 : Abstract Class
  
    추상 메소드가 하나 이상 있는 클래스
        ㄴ 메소드의 선언부만 있고 { }body(몸통=구현부) 부분이 없는 메소드
           몸통이 없으므로 실제 내용이 구현되어있지 않은 메소드임
           실제 내용이 구현되어있지 않다고 하여 추상 메소드라고 함
           (소스상에서는 추상 메소드가 하나도 없어도
            클래스 선언할 때 abstract 키워드를 작성하면
            추상클래스로 인식함)
           
    추상 클래스가 아닌 일반 클래스를 일반 클래스가 상속하는 경우에는
    method overriding 을 의무적으로 하지 않아도 
    문법적 오류가 발생하지 않아서 method overriding 강제성이 없음
    
    *******************************************************
    추상 클래스는 method overriding 을 강제하기 위한 수단임       
    *******************************************************
     ㄴ 추상 클래스를 상속하는 일반 클래스에서는
        부모 클래스에 있는 추상 메소드를 
        의무적으로 구현해야 하므로 <-- { } 부분을 작성해야 하므로 
        자식(일반) 클래스에서 기본적으로 어떠한 선언부를 가지고 있는
        메소드를 작성해야 하는지에 대한 안내서 역할을 함
        
     추상클래스는 추상메소드가 있기 때문에 객체를 생성할 수 없음    
                    ㄴ 몸통이 없는 메소드 <-- 구현되지 않은 메소드
      <-- 추상클래스를 상속하는 일반클래스의 객체를 생성함
      
                    
     추상 클래스를 작성하는 방법
     abstract class 클래스이름 { }         

     추상 메소드를 작성하는 방법
     abstract return_type  메소드이름 ();
     
     일반 메소드
     return_type  메소드이름() { }
    
*/
abstract class Parent {
	int number = 11;
	float f;
	public void display() {
		System.out.println("display() in Parent");
	}
	public abstract void method();
	public abstract int add(int num1, int num2);
}
// The type Child must implement (구현 : 추상메소드 -> 일반메소드)
// the inherited abstract method Parent.add(int, int)
class Child1 extends Parent{
	@Override
	public void display() {
		System.out.println("display() in Child");
	}	
	@Override
	public void method() { 
		System.out.println("method() in Child1");
	}
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
class Child2 extends Parent{
	@Override
	public void method() {
		System.out.println("method() in Child2");
	}
	@Override
	public int add(int num1, int num2) {
		return num1 + num2 + 100;
	}
}
abstract class Child3 extends Parent{
	public abstract void method();
	public abstract int add(int num1, int num2);
}
class GrandChild3 extends Child3{
	public void method() {
		System.out.println("method() in GrandChild3");
	}
	public int add(int num1, int num2) {
		return num1 + num2 + 222;
	}

}

public class Ex03 {
  public static void main(String[] args) {
  	Parent p1 = new Child1(); 
  	Parent p2 = new Child2();
  	
  	Parent[] p = new Parent[2];
  	p[0] = new Child1();
  	p[1] = new Child2();
  	
  	for(int i = 0; i < p.length; i++) {
  		p[i].method();
  		System.out.println(p[i].add(11, 22));
  		System.out.println("---------------------");
  	}
  	
  }
}



