class Vehicle extends Object{
	public void move() {
		System.out.println("탈것이 달립니다");
	}
}
class Car extends Vehicle{
	@Override
	public void move() {
		System.out.println("차가 달립니다");
	}
}
class Cycle extends Vehicle{
	@Override
	public void move() {
		System.out.println("자전거가 달립니다");
	}
}
public class Ex04 {
  public static void main(String[] args) {
  	// 상속 관계에 있을 때
  	// 자손클래스의 객체 내부에는
  	// 부모클래스의 객체가 있음
  	
  	Vehicle vc1 = new Vehicle();
  	System.out.println("vc1  : " + vc1);
  	
  	vc1 = new Car();
  	Car car1 = (Car)vc1;
  	Car car2 = (Car)vc1;
  	Vehicle vc2 =  car1;
  	Vehicle vc3 =  car2;
  	
  	System.out.println("vc1  : " + vc1);
  	System.out.println("car1 : " + car1);
  	System.out.println("car2 : " + car2);
  	System.out.println("vc2  : " + vc2);
  	System.out.println("vc3  : " + vc3);
  
  	Vehicle vc5 =  new Cycle();
  	Cycle c1 = (Cycle)vc5;
  	Cycle c2 = (Cycle)vc5;
  	Vehicle vc6 = c1;
  	Vehicle vc7 = c2;
  	System.out.println("vc5  : " + vc5);
  	System.out.println("c1   : " + c1);
  	System.out.println("c2   : " + c2);
  	System.out.println("vc6  : " + vc6);
  	System.out.println("vc7  : " + vc7);
  	
  }
}






