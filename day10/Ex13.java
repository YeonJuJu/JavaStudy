
// Singleton Pattern
// 클래스의 객체를 하나만 생성해서 사용하는 기법
public class Ex13 {
  public static void main(String[] args) {
  	// The constructor Singleton() is not visible
  	Singleton s1 = Singleton.getInstance();
  	Singleton s2 = Singleton.getInstance();
  	Singleton s3 = Singleton.getInstance();
  	Singleton s4 = Singleton.getInstance();
  	
  	System.out.println("s1 : " + s1);
  	System.out.println("s2 : " + s2);
  	System.out.println("s3 : " + s3);
  	System.out.println("s4 : " + s4);
  }
}
final class Singleton{
	// 자신 클래스  type 의 멤버변수를 선언하고
	// 자신 클래스의 객체를 생성해서 주솟값을 저장함
  //	private static Singleton s = new Singleton();
	//    ㄴ 이렇게 하면 s에 이미 객체의 주소가 저장되어있어서
	//  getInstance() 메소드 내부에서는 if문이 false 가 되어
	//  new Singleton() 이 한 번도 동작하지 않음
	private static Singleton s;
	//  ㄴ 이렇게 하면 s에 객체의 주소가 저장되어있지 않아서
	//  getInstance() 메소드 내부에서는 if문이 true 가 되어
	//  new Singleton() 이 한 번 동작함
	//  ㄴ new Singleton() 이 한 번 동작한 이후에는
	//     getInstance() 메소드 내부에서는 if문이 false 가 되어
	//     new Singleton() 이 동작하지 않음 
	private Singleton() { }
	public static Singleton getInstance() {
		if(s == null) {
      s = new Singleton();		
		}
		return s;
	}
}

