class Product{
	static int count = 0;
	int serialNo;
	// instance  초기화 블럭 (생성자 보다 먼저 실행됨)
	{ ++count; 	serialNo = count; }
	//  기본 생성자
	public Product(){ }
}
public class Ex15 {
  public static void main(String[] args) {
  	Product pro1 = new Product();
  	Product pro2 = new Product();
  	Product pro3 = new Product();
  	
  	System.out.println("pro1 의 제품번호는 " + pro1.serialNo + " 입니다");
  	System.out.println("pro2 의 제품번호는 " + pro2.serialNo + " 입니다");
  	System.out.println("pro3 의 제품번호는 " + pro3.serialNo + " 입니다");
  	System.out.println("생산된 제품의 개수는 " + Product.count + " 개입니다");
  }
}
