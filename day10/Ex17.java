class Product{
	// 제품 가격
	int price;
	// 제품 구매시 제공되는 bonus 점수
	int bonusPoint;
	public Product() { }
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price / 10.0);
	}
}
class Tv2 extends Product{
	public Tv2() { 
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	public Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}	
}
class Buyer{
	// 가지고 있는 돈
	int money = 1000;
	// 보너스 점수 (구매 전 : 0)
	int bonusPoint = 0;
	
	public void buy(Product p) {
		// 가지고 있는 돈보다 제품 가격이 더 큰 경우
		if(money < p.price) {
			System.out.println("잔액이 부족해서 살 수 없습니다");
			return;
		}
		
		// 잔액이 많아서 물건을 살 수 있는 경우
		money -= p.price; // money = money - p.price;
		//  보너스 점수는 올라감
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + " 을(를) 구입하셨습니다");
	}
	
	
}
public class Ex17 {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
    Tv2 tv = new Tv2();
    Computer computer = new Computer();
		
    buyer.buy(tv);
    System.out.println("현재 잔액은 " + buyer.money + "만원입니다");
    System.out.println("현재 보너스 점수는 " + buyer.bonusPoint + " 입니다");
    
    buyer.buy(computer);
    System.out.println("현재 잔액은 " + buyer.money + "만원입니다");
    System.out.println("현재 보너스 점수는 " + buyer.bonusPoint + " 입니다");
    
	}

}



