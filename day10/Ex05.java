class BattleShip{ }
class Destroyer extends BattleShip { }
class Cruiser extends BattleShip { }

public class Ex05 {
  public static void main(String[ ]args) {
  	BattleShip bsh1 = new BattleShip();
  	// BattleShip cannot be cast to Destroyer
  	
  	if(bsh1 instanceof Destroyer){
  		System.out.println("bsh1 이 저장하고 있는 주소지에 Destroyer 객체가 있음");
  	  Destroyer dst = (Destroyer)bsh1;
  	}
  	
  	
  	Destroyer dst1 = new Destroyer();
  	bsh1 = dst1;
  	dst1 = (Destroyer)bsh1;
  	
  	
  	Cruiser cs1 = new Cruiser();
  	bsh1 = cs1;
  	cs1 = (Cruiser)bsh1;
  	
  	
  	
  }
}
