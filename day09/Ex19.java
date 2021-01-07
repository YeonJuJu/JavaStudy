
public class Ex19 {
  public static void main(String[] args) {
  	User user = new User();
  	System.out.println("user.i : " + user.i);
  	System.out.println("user.arrNum : " + user.arrNum);
  	System.out.println("user.arrNum[0] : " + user.arrNum[0]);
  	System.out.println("user.arrNum[1] : " + user.arrNum[1]);
  	System.out.println("user.arrNum[2] : " + user.arrNum[2]);
  	
  	user.item = new Item();
  	user.item.i = 111;
  	System.out.println("user.item.i : " + user.item.i);
  	
  }
}
class Item{
	int i;
}
class User{
	Item item;
	int i;
	int[] arrNum;
	public User() {
		this.i = 222;
		arrNum = new int[3];
	}
}

