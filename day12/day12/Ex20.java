import java.util.InputMismatchException;

/*
  Method Overriding
  
  1) 부모클래스에 있는 메소드의 선언부와
  2) 자손클래스에 있는 메소드의 선언부가 일치해야 함
                                  * return type, parameter(type, 개수, 순서)
  3) 접근제한자 : 부모클래스에 있는 메소드의 접근제한자의 범위보다 좁으면 안 됨                            
  4) 예외처리(throws) : 
      ㄴ 부모클래스의 메소드에 정의된 예외클래스보다
         상위 예외클래스를 throws 할 수 없음
  
*/
public class Ex20 {
  public static void main(String[] args) {
  	Sub s = new Sub();
  	s.display();
  }
}
class Sub extends Super{
	// This instance method cannot override the static method from Super
	// remove 'static' modifier of Super.display()
	// public void display(){ }
	
	@Override
	public void add(int number) {
		
	}
	
}
class Super{
	public static void display() throws InputMismatchException{ 
		                    
	}
  public void add(int number) {
		
	}
}








