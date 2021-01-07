
class Product{
	int price;
	int bonusPoint;
	public Product() { }
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price / 10.0);
	}
}
class Tv extends Product{
	public Tv() {
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
class Audio extends Product{
	public Audio() {
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] item = new Product[10];
	
	int counter = 0;
	
	public void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다...");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		// 구입한 제품을 Product 배열에 저장하기
		item[counter++] = p;
		System.out.println(p + "을(를) 구입하셨습니다");
	}
	// 구입한 제품 정보 출력하기
	public void summary() {
		// 구입한 제품의 합계
		int sum = 0;
		// 구입한 제품 목록
		String itemList = "";
		
		// 구입한 제품 가격의 합계와 목록 작성하기
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) {
				break;
			}
			// 제품 가격 합계 구하기
			sum += item[i].price;
			// 구입한 제품을 목록에 추가하기(',' 처리하기) 
			itemList += (i == counter - 1) ? "" + item[i] : item[i] + ", " ;
		}
    System.out.println("구입한 제품의 총금액은 " + sum + " 만원입니다")		;
    System.out.println("구입한 제품들은 " + itemList + " 입니다");
		
	}
}
public class Ex01 {
  public static void main(String[] args) {
  	Buyer buyer = new Buyer();
  	
  	buyer.buy(new Tv());
  	buyer.buy(new Computer());
  	buyer.buy(new Audio());
  	buyer.buy(new Tv());
  	
  	buyer.summary();
  	
  	
  }
}



