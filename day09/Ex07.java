
public class Ex07 {
  public static void main(String[] args) {
    B b1 = new B(11);
    System.out.println("b1 : " + b1);
    B b2 = new B(11, 22);
    System.out.println("b2 : " + b2);
    B b3 = new B(11, 22, 33);
    System.out.println("b3 : " + b3);
    
  }
}
class B{
	int num1, num2, num3;
	
	public B(int num1) { 
		this.num1 = num1;
	}
	public B(int num1, int num2) {
		// this.num1 = num1;
		// Constructor call must be the first statement in a constructor
		this(num1);
		this.num2 = num2;
	}
	public B(int num1, int num2, int num3) {
		// this.num1 = num1;
		// this.num2 = num2;
		this(num1, num2);
		this.num3 = num3;
	}
	public String toString() {
		return num1 + " -- " + num2 + " -- " + num3;
	}
	
	public void setMember(int num1, int num2) {
	  // this(num1); 일반 메소드에서는 생성자를 호출할 수 없음 
		// this.num1 = num1;
		this.num2 = num2;
	}
	
}



