
public class Ex18 {
  public static void main(String[] args) {
  	Car3 car = new Car3();
  	car.color = "White";
  	car.displacement = 3000;
  	car.door = 4;
  	// car.gearType = "manual";
  	
  	Sonata snt = new Sonata();
  	snt.gearType = "auto";
  	snt.color = "White";
  	snt.displacement = 3000;
  	snt.door = 4;
  	snt.vc = new Vehicle();
  	snt.vc.wheel = 4;
  	snt.vc.chair = 4;
  	
  	
  	Car3 car2 = snt;
  	// car2.gearType = "auto";
  	car2.color = "White";
  	car2.displacement = 3000;
  	car2.door = 4;	
  	
  }
}
class Car3{
	String color;
	int door;
	int displacement;
	public Car3() { }
	public Car3(int door) { }
}
          // is a 관계 (상속관계)
class Sonata extends Car3{
	String gearType;
	Vehicle vc; // has a 관계 (포함관계)
	Sonata(){
		super();
	}
}
class Vehicle{
  int wheel; 	
  int chair;
}



