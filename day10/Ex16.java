
class Car4{
	String color;
	int door;
	public void drive() {
		System.out.println("drive ~~~");
	}
	public void stop() {
		System.out.println("stop !!!");
	}
}
class FireEngine extends Car4{
	public void water() {
		System.out.println("water !!!");
	}
}
class Ambulance extends Car4{
	public void siren() {
		System.out.println("siren ~~~~~");
	}
}
public class Ex16 {
  public static void main(String[] args) {
  	FireEngine fire = new FireEngine();
  	Ambulance abl = new Ambulance();
  	Car4 car = null;
  	
  	car = fire;
  	fire = (FireEngine)car;
  	
  	car = abl;
  	abl = (Ambulance)car;
  	
  	FireEngine fe1 = new FireEngine();
  	FireEngine fe2 = null;
  	
  	fe1.water();
  	car = fe1;
    // car.water();
  	fe2 = (FireEngine)car;
  	fe2.water();
  	System.out.println("---------------------------");
  	
  	FireEngine fe3 = new FireEngine();
  	
  	System.out.println(fe3 instanceof FireEngine); // true
  	System.out.println(fe3 instanceof Car4);   //  true
  	System.out.println(fe3 instanceof Object); //  true
  	System.out.println("---------------------------");
  	
  	
  	Car4 car4 = new Car4();
  	FireEngine fireEngine = new FireEngine();
  	Ambulance ambulance = new Ambulance();
  	
  	method(car4);
  	method(fireEngine);
  	method(ambulance);
  	
  	
  	
  }  // main
  
  public static void method(Object obj) {
  	if(obj instanceof FireEngine) {
  		FireEngine fe = (FireEngine)obj;
  		fe.water();
  	}else if(obj instanceof Ambulance) {
  		Ambulance abl = (Ambulance)obj;
  		abl.siren();
  	}else if(obj instanceof Car4) {
  		Car4 c = (Car4)obj;
  		c.drive();
  	}
  	
  }
  
}





