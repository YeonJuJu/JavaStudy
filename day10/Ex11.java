
public class Ex11 {
  public static void main(String[] args) {
  	ChildD chd = new ChildD();
  	chd.method();
  	System.out.println("chd.x : " + chd.x);
  	
  	// class - type <-- 접근권한(해당 type 에서 정의한 멤버에 접근할 수 있음) 
  	
  	ParentD pd = chd;
  	System.out.println("pd.x : " + pd.x);
  	System.out.println("chd.x : " + chd.x);
  	
  	System.out.println("-------------------------");
  	
  	ParentD p = new ParentD();
  	System.out.println("p.x : " + p.x);
  	p.x = 333;
  	System.out.println("chd.x : " + chd.x);
  	System.out.println("p.x : " + p.x);
  	
  }
}
class ParentD{
	int x = 11;
}
class ChildD extends ParentD{
	int x = 20;
	public void method() {
		int x = 30;
		System.out.println("x       : " + x);
		System.out.println("this.x  : " + this.x);
		System.out.println("super.x : " + super.x);
		System.out.println("-------------------------");
		
	}
}








