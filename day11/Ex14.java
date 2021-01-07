interface Repairable3{ }

class Unit3{
	int hitPoint;
	final int MAX_HP;
	public Unit3(int hp) {
		MAX_HP = hp;
	}
}
// Implicit super constructor Unit3() 
// is undefined for default constructor. 
// Must define an explicit constructor.
class GroundUnit3 extends Unit3{
	public GroundUnit3(int hp) {
		super(hp);
	}
}
class AirUnit3 extends Unit3{
	public AirUnit3(int hp) {
		super(hp);
	}
}
class Tank3 extends GroundUnit3 implements Repairable3{
	public Tank3() {
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}
class DropShip3 extends AirUnit3 implements Repairable3{
	public DropShip3() {
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "DropShip";
	}
}
class Marine3 extends GroundUnit3{
	public Marine3() {
		super(30);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit3 implements Repairable3 {
	public SCV() {
		super(50);
		hitPoint = MAX_HP;
	}
	public void repair(Repairable3 r) {
		if(r instanceof Unit3) {
			Unit3 u = (Unit3)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u + "의 수리를 다했습니다");
		}else {
			System.out.println(r + "의 수리를 못했습니다");
		}
	}
}


public class Ex14 {
  public static void main(String[] args) {
  	Tank3 t = new Tank3();
  	DropShip3 d = new DropShip3();
  	Marine3 m = new Marine3();

  	SCV scv = new SCV();
  	scv.repair(t);
  	scv.repair(d);
  	// The method repair(Repairable3) in the type SCV 
  	// is not applicable for the arguments (Marine3)
  	// scv.repair(m);
  	
  	
  	
  }
}
