class Unit2{
	// Unit 의 체력
	int currentHP;
	// Unit 의 좌푯값
	int x, y;
} // Unit2
interface Movable{ 
	public void move(int x, int y);
}
interface Attackable{
	public void attack(Fightable f);
}
interface Fightable extends Movable, Attackable{ 
	public void move(int x, int y);
	public void attack(Fightable f);
}

class Fighter1 extends Unit2 implements Fightable{
	int x, y;
	@Override
	public void move(int x, int y) { 
		this.x = x; this.y = y;
		System.out.printf("(%d, %d)로 이동하기 - Fighter1%n", x, y);
	}
	@Override
	public void attack(Fightable f) { 
		System.out.println(this + "은(는) " + f + "을(를) 공격합니다");
	}
	public Fighter1 method1() {
		Fighter1 f1 = new Fighter1();
		return f1;
	}
	public String toString() {
		return "Fighter1";
	}
}
class Fighter2 extends Unit2 implements Fightable{
	@Override
	public void move(int x, int y) {
		System.out.printf("(%d, %d)로 이동하기 - Fighter2%n", x, y);
	}
	@Override
	public void attack(Fightable f) {
		System.out.println(this + "은(는) " + f + "을(를) 공격합니다");
	}
	public String toString() {
		return "Fighter2";
	}
}

public class Ex11 {
  public static void main(String[] args) {
  	Fightable interF1 = new Fighter1();
  	Fightable interF2 = new Fighter2();
  	
  	interF1.move(11, 22);
  	interF2.move(33, 55);
  	
  	interF1.attack(interF2);
  	interF2.attack(interF1);
  	
  	interF1.attack(new Fighter2());
  	interF2.attack(new Fighter1());
  	
  }
}






