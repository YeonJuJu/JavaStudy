abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	public void stop() { }
}
class Marine extends Unit{
	@Override
	public void move(int x, int y) {
		System.out.println("Marine 이 ("+ x + ", " + y + ")로 이동합니다");
	}
	public void stimPack() { }
}
class Tank extends Unit{
	@Override
	public void move(int x, int y) {
		System.out.println("Tank 가 ("+ x + ", " + y + ")로 이동합니다");
	}
  public void changeMode() { } 
}
class DropShip extends Unit{
	@Override
	public void move(int x, int y) {
		System.out.println("DropShip 이 ("+ x + ", " + y + ")로 이동합니다");
	}
	public void load() { }
	public void unload() { }
}
public class Ex07 {
  public static void main(String[] args) {
  	// Cannot instantiate the type Unit
  	// new Unit();
  	
  	Unit[] unit = new Unit[5];
  	unit[0] = new Marine();
  	unit[1] = new Tank();
  	unit[2] = new DropShip();
  	unit[3] = new Marine();
  	unit[4] = new Marine();
  	
  	
  	for(int i = 0; i < unit.length; i++) {
  	  unit[i].move(111, 222);
  	}
  	
  }
}






