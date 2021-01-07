import java.util.Vector;

class Product2{
	int price;
	int bonusPoint;
	public Product2() { }
	public Product2(int price) {
		this.price = price;
		this.bonusPoint = (int)(price / 10.0);
	}
}
class Tv2 extends Product2{
	public Tv2() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer2 extends Product2{
	public Computer2() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio2 extends Product2{
	public Audio2() {
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}
class Speaker2 extends Product2{
	public Speaker2() {
		super(50);
	}
	public String toString() {
		return "Speaker";
	}
}
class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Vector<Product2> item = new Vector<Product2>();
		
	public void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다...");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		// 구입한 제품을 Vector<Product2>에 저장하기
		item.add(p);
		System.out.println(p + "을(를) 구입하셨습니다");
	}
	
	// 구입한 제품 반품하기
	public void refund(Product2 p) {
    if(item.remove(p)) {
    	money += p.price;
    	bonusPoint -= p.bonusPoint;
    	System.out.println(p + "을(를) 반품하셨습니다");
    }else {
    	System.out.println("구입하신 제품 목록 중에 해당 제품이 없습니다");
    }
	}
	
	
	// 구입한 제품 정보 출력하기
	public void summary() {
		// 구입한 제품의 합계
		int sum = 0;
		// 구입한 제품 목록
		String itemList = "";
		
		// 구입한 제품 가격의 합계와 목록 작성하기
		for(int i = 0; i < item.size(); i++) {
			if(item.isEmpty()) {
				System.out.println("구입한 제품이 없습니다");
				return;
			}
			
			Product2 p = item.get(i);
			// 제품 가격 합계 구하기
			sum += p.price;  // sum += item.get(i).price;
			// 구입한 제품을 목록에 추가하기(',' 처리하기) 
			itemList += (i == 0) ? "" + p : ", " + p;
		}
    System.out.println("구입한 제품의 총금액은 " + sum + " 만원입니다")		;
    System.out.println("구입한 제품들은 " + itemList + " 입니다");
		
	}
}
public class Ex02 {
  public static void main(String[] args) {
  	Buyer2 buyer = new Buyer2();
  	
  	Tv2 tv2_1 = new Tv2();
  	Computer2 computer2_1 = new Computer2();
  	Audio2 audio2_1 = new Audio2();
  	Speaker2 speaker2_1 = new Speaker2();
  	Tv2 tv2_2 = new Tv2();
  	
  	buyer.buy(tv2_1);
  	buyer.buy(computer2_1);
  	buyer.buy(audio2_1);
  	buyer.buy(speaker2_1);
  	buyer.buy(tv2_2);
  	
  	buyer.summary();
  	System.out.println("-------------------------------");
  	
  	buyer.refund(tv2_2);
  	buyer.summary();
  	
  }
}



