
public class Ex11 {
  public static void main(String[] args) {
  	Car c1 = new Car();
  	System.out.println("c1 : " + c1);
  	c1.color = "Blue";
  	c1.gearType = "auto";
  	c1.door = 4;
  	System.out.println("c1 : " + c1);
  	
  	Car c2 = new Car("Red", "manual", 2);
  	System.out.println("c2 : " + c2);
  	
  	
  	
  }
}
class Car{
	String color;
	String gearType;
	int door;
	
	public Car() {
		this("White", "auto", 4);
	}
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public String toString() {
		return color + " -- " + gearType + " -- " + door;
	}
}





