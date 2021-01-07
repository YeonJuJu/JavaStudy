
public class Ex12 {
  public static void main(String[] args) {
  	Car c1 = new Car();
  	System.out.println("c1 : " + c1);
  	c1.color = "Blue";
  	c1.gearType = "auto";
  	c1.door = 4;
  	System.out.println("c1 : " + c1);
  	
  	Car c2 = new Car("Red", "manual", 2);
  	System.out.println("c2 : " + c2);
  	
  	System.out.println("------------------------------------");
  	
  	
  	// 객체를 복사하기
  	Car2 car1 = new Car2("SkyBlue", "auto", 3);
  	System.out.println("car1 : " + car1);
  	Car2 car2 = new Car2(car1);
  	System.out.println("car2 : " + car2);
  	//Car2 car2 = car1;
  	//System.out.println("car2 : " + car2);
  	
  }
}
class Car2{
	String color;
	String gearType;
	int door;
	
	public Car2() {
		this("White", "auto", 4);
	}
	public Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
  // 객체를 복사할 때 사용하는 생성자
	public Car2(Car2 car) {
		this.color = car.color;
		this.gearType = car.gearType;
		this.door = car.door;		
	}
	
	
	public String toString() {
		// return super.toString();
		return color + " -- " + gearType + " -- " + door;
	}
}





